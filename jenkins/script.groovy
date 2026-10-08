pipeline{
  agent any
  stages{
    stage{
      steps{
        sh '''
          echo "Test stage is successful"
          '''
      }
    }
  }
}
