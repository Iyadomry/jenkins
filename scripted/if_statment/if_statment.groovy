def main() {
    start()
}

def start() {
    node('jenkins') {
        def $VERSION = version
        stage(' running if statment') {
            echo "${version}"
            switch("${version}") {
                case [ "${version}" !=  "windows".toString() ] :
                    println (" we get the manual inout")
                case [ "${version}" ==  "windows".toString() ]:
                    println (" this the default value and it should be Windows ")
                break;
            }
        }
    }
}

return this
