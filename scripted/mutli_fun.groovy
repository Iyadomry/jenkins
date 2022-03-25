
def main() {
    timestamps {
        first()
    }
}


def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
            emailext body: '', subject: 'test', to: 'iyad.omryx@gmail.com'
        }
    }
    next()
}

def next() {
    echo 'test 2'
}

return this