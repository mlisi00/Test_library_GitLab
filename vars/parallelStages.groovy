def runParallelStages() {
    pipeline {
        agent any
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
}

parallelStages.runParallelStages()