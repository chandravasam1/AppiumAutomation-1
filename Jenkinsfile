import hudson.model.*

              pipeline {

                agent any

                tools {

                  maven 'Maven 3.6.1'

                  //Adding comment..

                }

             

                parameters {

                    string(name: 'BRANCH', defaultValue: 'project_planit_integration', description: 'Provide the section/branch name')        

                }

               

                environment {

                    ELK_HOST = "10.138.52.72"

                }

               

                stages {

               

                  stage('Run Regression Tests') {

                    steps {

                      script {

                        try {
                             sh "mvn test"
                                              //******

                        } catch (Exception e) {

                          // sh "rm -rf ${env.pgreport}_${BUILD_NUMBER}*.tap"

              print "${e}"

                           sh "echo 'Removed report file for failed job to avoid future failures...'"  

                           currentBuild.result = 'FAILURE'

                        }

                      }

                    }

                  }

               

                  stage('Publish Test Results') {

                      //This step will publish the result in Jenkins Build link under 'Extended TAP Tests Results'

                      steps {

                        step([$class: "TapPublisher", testResults: "**/${env.pgreport}_${BUILD_NUMBER}*.tap"])

                          //This step is to gather data to send to ELK

                         

                       }

                   }

                 

                }

              }

             

             
