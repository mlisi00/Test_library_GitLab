def incrementVersion(version) {
    def matcher = version =~ /(\d+)\.(\d+)\.(\d+)/
    if (matcher.matches()) {
        def major = Integer.parseInt(matcher.group(1))
        def minor = Integer.parseInt(matcher.group(2))
        def patch = Integer.parseInt(matcher.group(3))
        return "${major}.${minor}.${patch + 1}"
    } else {
        return version
    }
}
