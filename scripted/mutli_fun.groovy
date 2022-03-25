
def main() {
    timestamps {
        first()
    }
}


def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
              withGroovy {
                println 'hi'
            }

        }
    }
    next()
}

def next() {
    echo 'test 2'
}

return this