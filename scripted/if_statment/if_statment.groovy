def main() {
    start()
}

def start() {
    node('jenkins') {
        def $VERSION = version
        stage(' running if statment') {
            echo ' hello there'
            switch(version) {
                case [ version !=  "windows" ] :
                    println (" we get the manual inout")
                default:
                    println (" this the default value and it should be Windows ")
                break

            }
        }
    }
}


return this
