def main() {
    start()
}

def start() {
    node('jenkins') {
        stage(' running if statment') {
            echo ' hello there'
        }
    }
}


return this
