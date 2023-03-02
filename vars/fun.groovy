def incrementVersion(String version) {
    def parts = version.split("\\.")
    def major = Integer.parseInt(parts[0])
    def minor = Integer.parseInt(parts[1])
    def patch = Integer.parseInt(parts[2])
    patch += 1 // incrementa il numero di versione di patch
    return "${major}.${minor}.${patch}"

    echo "La nuova versione è: ${major}"
}

//def incrementVersion(version) {
//    def matcher = version =~ /(\d+)\.(\d+)\.(\d+)/
//    if (matcher.matches()) {
//        def major = Integer.parseInt(matcher.group(1))
//        def minor = Integer.parseInt(matcher.group(2))
//        def patch = Integer.parseInt(matcher.group(3))
//        return "${major}.${minor}.${patch + 1}"
//    } else {
//        return version
//    }
//}
