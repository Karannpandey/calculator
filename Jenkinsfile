pipeline{
    environment{
        DOCKERHUB_CRED = credentials("DockerKaran")
    }
    agent any
    stages{
        stage("Stage 1 : Git Clone") {
            steps {
                sh 'ls'
            }
        }

//comment

        stage("Stage 2 : Maven Build"){
            steps{
                sh 'mvn clean install'
            }
        }

        stage("Stage 3 : Build Docker Image"){
            steps{
                sh "docker build -t krp277/scientific-calculator:latest ."
            }
        }

        stage("Stage 4 : Push Docker Image to Dockerhub"){
            steps{
                sh 'echo $DOCKERHUB_CRED_PSW | docker login -u $DOCKERHUB_CRED_USR --password-stdin'
                sh "docker push krp277/scientific-calculator:latest"
            }
        }

        stage("Stage 5 : Clean Unwanted Docker Images"){
            steps{
                sh "docker container prune -f"
                sh "docker image prune -a -f"
            }
        }

        stage('Stage 6 : Ansible Deployment') {
            steps {
                    sh 'ansible-playbook -i inventory deploy.yml'

             }
        }
    }
}