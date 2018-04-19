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
  }
}