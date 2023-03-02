def incrementVersion(String version) {
    def parts = version.split("\\.")
    def major = Integer.parseInt(parts[0])
    def minor = Integer.parseInt(parts[1])
    def patch = Integer.parseInt(parts[2])

    if (major == 1) {
        minor += 1
        patch = 0
    } else if (major == 2) {
        patch += 1
    } else {
        echo "Versione non gestita: ${version}"
        return null
    }

    return "${major}.${minor}.${patch}"
}
