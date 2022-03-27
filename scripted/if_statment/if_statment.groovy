def main() {
    start()
}

def start() {
    node('jenkins') {
        def env.VERSION = version
        stage(' running if statment') {
            echo ' hello there'
            echo "${version}"
            switch(version) {
                case [ version !=  "windows" ] :
                    println (" we get the manual inout")
                case [ version ==  "windows" ]:
                    println (" this the default value and it should be Windows ")
            }
        }
    }
}


return this
