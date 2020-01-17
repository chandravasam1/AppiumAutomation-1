node () {
  stage('Source') {
    git 'https://github.com/asifapasha/AppiumAutomation.git'
  }
  stage('Run appium test') {
  bat 'mvn clean test'
  }
  stage('reports') {
   
            allure([
                    includeProperties: false,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/allure-results']]
            ])
}
}
