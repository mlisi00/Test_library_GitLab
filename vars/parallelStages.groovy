def runParallelStages() {
    parallel {
        stage('Stage One') {
            steps {
                sh 'echo "Running stage one"'
            }
        }
        stage('Stage Two') {
            steps {
                sh 'echo "Running stage two"'
            }
        }
    }
}


/*
def runParallelStages() {
    pipeline {
        agent { label 'any' }
        stages {
            stage('Parallel Stages') {
                parallel {
                    stage('Stage One') {
                        steps {
                            sh 'echo "Running stage one"'
                        }
                    }
                    stage('Stage Two') {
                        steps {
                            sh 'echo "Running stage two"'
                        }
                    }
                }
            }
        }
    }
}*/
