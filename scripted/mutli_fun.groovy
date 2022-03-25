def main() {
    timestamps {
        first()
    }
}

def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
            sendmail()
        }
    }

}



def sendmail() {
    node('jenkins') {
        properties([parameters([string(defaultValue: 'iyad.omryx@gmail.com', name: 'RECIPIAN', trim: true)]), pipelineTriggers([githubPush()])])
        mail bcc: '', body: "This is build number '${BUILD_NUMBER}'", cc: '', from: '', replyTo: '', subject: "${JOB_NAME}", to: "${RECIPIAN}"
    }
}



return this
