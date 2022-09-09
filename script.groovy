def buildJar() {
  echo "building the application..."
  sh'mvn clean package'
}

def buildImage() {
  echo "building the docker image..."
  withCredentials([usernamePassword(credentialsId: 'nexus-docker-repo', passwordVariable: 'PASS', usernameVariable:'USER')]) {
      sh 'docker build -t 20.225.57.67:8083/my-job:$IMAGE_NAME .'
      sh "echo $PASS | docker login -u $USER --password-stdin 20.225.57.67:8083"
      sh 'docker push 20.225.57.67:8083/my-job:$IMAGE_NAME'           
   }   
}

def deployApp() {
  echo 'deploying the application...'
 // withKubeConfig([credentialsId: 'kubeconfig-raw', serverUrl: '']) {
      sh 'kubectl apply -f deployment.yaml'
      sh 'kubectl get deployment'
      sh 'kubectl get pods'
      sh 'kubectl get svc'
   // }
}


return this
