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



def sendmail(RECIPIAN) {
    node('jenkins') {
        mail bcc: '', body: "This is build number '${BUILD_NUMBER}'", cc: '', from: '', replyTo: '', subject: "${JOB_NAME}", to: "${RECIPIAN}"
    }
}



return this
