#!groovy

pipeline {
  agent none
  stages {
    stage('Maven Install') {
      agent {
        docker {
          image 'maven:3.3.9'
        }
      }
      steps {
        sh 'mvn clean install'
      }
    }
     stage('Docker Build') {
          agent any
          steps {
            sh 'docker build -t devops1 container1:latest .'
          }
        }

  }
}