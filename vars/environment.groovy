def testFunction(envTarget) {
    switch (envTarget) {
        case 'dev':
            projecta = "dev-site1";
            projectb = "dev-site2";
        case 'test':
            projecta = "test-site1";
            projectb = "test-site2";
    }
    return [projecta, projectb]
}

println(testFunction(DEV: dev))