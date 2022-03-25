




def main() {
    timestamps {
        first()
        yes()
    }
}

def yes() {
class Foo {
    def bar() {
        println "baz"
    }
}
foo = new Foo()
foo.bar()
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