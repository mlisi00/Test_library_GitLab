def testFunction(envTarget) {
    switch (envTarget) {
        case 'dev':
            projecta = "dev-site1";
            projectb = "dev-site2";
            break;
        case 'test':
            projecta = "test-site1";
            projectb = "test-site2";
            break;
    }
    return [projecta, projectb]
}