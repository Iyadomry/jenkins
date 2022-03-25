
def main() {
    timestamps {
        first()
    }
}


def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
              withGroovy {
                    class Foo {
                        def bar() {
                            println "baz"
                        }
                    }
                foo = new Foo() 
                foo.bar()  
            }

        }
    }
    next()
}

def next() {
    echo 'test 2'
}

return this