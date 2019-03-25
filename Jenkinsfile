pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('docker_build') {
      steps {
        sh 'docker build -t mavendocker:latest .'
      }
    }
  }
}