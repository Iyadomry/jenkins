def main() {
    start()
}

def start() {
    node('jenkins') {
        stage(' running if statment') {
            def $VERSION = version
            if ( version != "windows") {
                echo " This is the manula value "
            }
            else {
                echo " this is the default value 'windows' "
            } 
        }
    }
}

return this
