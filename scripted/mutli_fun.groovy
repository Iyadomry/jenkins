 node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
        }
        next()
    }
 
def next() {
    echo 'test 2'
}

return this