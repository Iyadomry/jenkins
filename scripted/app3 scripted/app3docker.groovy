def main() {
    ansiColor('xterm') {
        docker1() 
    }
}

def docker1() {
    node(label: 'jenkins') {
        properties(
        [parameters([string(defaultValue: '58', name: 'port'), string(defaultValue: 'app3', name: 'name' )])]
        )
        try {
            stage('remove all running containers') {
                sh 'docker rm -f $(docker ps -a -q)'
                }
            }
        catch (Exception) {
            echo ' Ignore the error Jsut trying to clean old containers'
            currentBuild.result = 'ABORTED'
            }
        stage('Deply my application as a container') {
            ansiColor('xterm') {
                echo "\u001B[31mbuild new container\u001B[0m"
                sh "docker run --name ${name} -d --rm -p ${port}:80  nginx"
            }
        }
        stage(name: 'check if the container os running') {
            sh 'docker ps -a'
            sh "curl localhost:${port} "
        }
    }
}

return this