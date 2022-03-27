def main() {
    start()
}

def start() {
    node('jenkins') {
        def $VERSION = version
        stage(' running if statment') {
            echo ' hello there'
            switch(version) {
                case [ version != 100 ] :
                    println (" we get the manual inout")
                default:
                    println (" this the default value and it should be 100 ")
                break

            }
        }
    }
}


return this
