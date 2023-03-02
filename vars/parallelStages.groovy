def runParallelStages(def stages) {
    parallelStages = [:]
    stages.each { stageName ->
        parallelStages[stageName] = {
            stage(stageName) {
                // Esegui le operazioni dello stage
                echo "Esecuzione dello stage ${stageName}"
            }
        }
    }
    parallel parallelStages
}
