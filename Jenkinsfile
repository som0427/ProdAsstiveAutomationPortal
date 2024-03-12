
def environment = params.Environment
def browsertype = params.BrowserType
def headless = params.Headless
def build_ok = true

node{

    parameters {
        choice(
                name: 'BrowserType',
                choices: ['chrome','firefox'],
                description: 'Type of Browser'
        )
        choice(
                name: 'Headless',
                choices: ['true','false'],
                description: 'Headless'
        )
        choice(
                name: 'Environment',
                choices: ['QA'],
                description: 'Environment'
        )
    }

    stage('Download Source Code'){

        echo "Staring the Jenkins build for the Assistive Regression Test Suite"

        git credentialsId: '658c0152-5d89-4eaf-b65d-f9d98104dec9', url: 'https://github.com/som0427/channelplay-automated-testing.git'

    }

    stage('Check Maven and Allure Reporting Status'){

        sh "mvn --version"

    }

    stage('Executing the maven build'){

        try {
            sh 'echo "Jenkins Chrome Version: `google-chrome --version`"'
        } catch (e) {
            echo "Chrome browser version not found."
        }
        sh "mvn dependency:resolve"
        try{
            sh "mvn clean verify -Dbrowser=chrome -Dheadless=true -Denvironment=QA"

        } catch(e) {

            build_ok = false
            echo e.toString()
        }
    }
    stage('Report Generation'){

        script {
            sh '''
                 if [ -d "allure-results" ] ; then
                    echo "Browser=${BrowserType}
                        Branch=${BUILD_TAG}
                        Headless=${Headless}
                        Environment=${Environment}" > target/allure-results/environment.properties
                 else
                    echo "No results for Allure, skipping report"
                 fi
             '''

            allure([
                    includeProperties: true,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/allure-results']]
            ])
        }
    }

    if(build_ok) {
        currentBuild.result = "SUCCESS"
    } else {
        currentBuild.result = "FAILURE"
    }
}


