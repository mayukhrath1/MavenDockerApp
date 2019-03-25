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
    stage('push image') {
      steps {
        sh '''docker login -u="1234567abcdefg" -p="Narayan@15"
docker push 1234567abcdefg/mavendocker'''
      }
    }
  }
}