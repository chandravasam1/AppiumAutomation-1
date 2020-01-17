node () {
  stage('Source') {
    git 'https://github.com/asifapasha/AppiumAutomation.git'
  }
  stage('Compile') {
    def gradle_home = tool 'gradle4'
    sh "'${gradle_home}/bin/gradle' clean compileJava test"
  }
}
