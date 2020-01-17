node () {
  stage('Source') {
    git 'https://github.com/asifapasha/AppiumAutomation.git'
  }
  stage('Run appium test') {
  bat 'mvn clean test'
  }
}
