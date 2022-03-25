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
        mail bcc: '', body: "This is build number '${BUILD_NUMBER}'", cc: '', from: '', replyTo: '', subject: 'JenkinsReport', to: 'iyad.omryx@gmail.com'
    }
}



return this
