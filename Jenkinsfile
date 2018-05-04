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
            sh 'docker build -t devops1 .'
          }
        }
      stage('Docker Push') {
           agent any
           steps {
             withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
               sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
               sh 'docker tag devops1 shravan1603/devops1'
               sh 'docker push shravan1603/devops1'
               build 'rundeck'
             }
           }
         }

  }
}