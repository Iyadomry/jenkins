def main() {
    timestamps {
        first()
    }
}

def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
            mail bcc: '', body: ' JenkinsReport', cc: '', from: '', replyTo: '', subject: 'Jenkins report', to: 'iyad.omryx@gmail.com'
        }
    }
    next()
}

def next() {
    echo 'test 2'
}

return this
