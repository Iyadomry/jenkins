def main() {
    start()
}

def start() {
    node('jenkins') {
        ${env.VERSION} = version
        stage(' running if statment') {
            echo ' hello there'
            switch(version) {
                case 100:
                    println("this is the default value")
                    
                break
                    println("this is the default value")
            }
        }
    }
}


return this
