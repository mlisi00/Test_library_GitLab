def runParallelStages(def stages) {
    def parallelStages = [:]
    for (e in environments) {
        parallelStages[e] = {
            stage(e) {
                echo "Esecuzione dello stage ${stageName}"
            }
        }
    }
    parallel parallelStages
}

/*def environments = ["development", "staging", "production"]

stage("deploy to multiple environments") {
    def deployments = [:]
    for (e in environments) {
        deployments[e] = {
            stage(e) {
                echo "Esecuzione dello stage ${stageName}"
            }
        }
    }
    parallel deployments
}*/
