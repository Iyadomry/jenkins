def main() {
    timestamps {
        first()
    }
}

def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
        }
    }
    sendmail()
}



def sendmail() {
    node('jenkins')
    mail bcc: '', body: ' JenkinsReport', cc: '', from: '', replyTo: '', subject: 'Jenkins report', to: 'iyad.omryx@gmail.com'
}



return this
