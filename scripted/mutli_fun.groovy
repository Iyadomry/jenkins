
class Foo {
    def bar() {
        println "baz"
    }
}
foo = new Foo()
foo.bar()  



def main() {
    timestamps {
        first()
    }
}


def first() {
    node('jenkins') {
        stage('clone git repo') {
            echo ' stage of git'
        }
    }
    next()
}

def next() {
    echo 'test 2'
}

return this