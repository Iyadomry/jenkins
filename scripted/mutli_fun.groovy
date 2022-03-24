def main() {
    git()

}

def git_clone(){
    node ('jenkins') {
        stage ('clone git repo') {
            echo ' stage of git'
        }
    }
}
return this
