pipeline {
    agent { label 'Java17' }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn clean install'
            }
        }
    }
//     post {
//         always {
//             junit 'target/surefire-reports/*.xml'
//             jacoco(
//                   execPattern: 'target/jacoco.exec',
//                   classPattern: 'target/classes',
//                   sourcePattern: 'src/main/java',
//                   exclusionPattern: 'src/test*'
//             )
//             recordIssues enabledForFailure: true, tool: spotBugs(pattern: '**/target/spotbugsXml.xml')
//             recordIssues enabledForFailure: true, tool: pmdParser(pattern: '**/target/pmd.xml')
//             recordIssues enabledForFailure: true, tool: checkStyle(pattern: '**/target/checkstyle-result.xml')
//             dependencyCheckPublisher pattern: '**/target/dependency-check-report.xml'
//             publishHTML (target: [
//                 allowMissing: false,
//                 alwaysLinkToLastBuild: false,
//                 keepAll: true,
//                 reportDir: 'target/site/',
//                 reportFiles: 'dependency-updates-report.html,property-updates-report.html,plugin-updates-report.html',
//                 reportName: "Versions Report"
//             ])
//         }
//     }
}
