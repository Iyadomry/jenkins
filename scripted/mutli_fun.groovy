def main() {
    timestamps {
        first()
    }
}

def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' welcome here!'
        }
    }
    next()
}

def next() {
    echo 'test 2'
}

return this
