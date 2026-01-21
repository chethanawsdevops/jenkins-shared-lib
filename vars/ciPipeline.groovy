def call(Map config = [:]) {
    pipeline {
        kubernetes {
          label 'k8s'
        }
        stages {
            stage('Build') {
                steps {
                    echo "Building service: ${config.service ?: 'unknown'}"
                }
            }
            stage('Test') {
                steps {
                    echo "Running tests"
                }
            }
            stage('Deploy') {
                when {
                    expression { return config.deploy ?: false }
                }
                steps {
                    echo "Deploying to ${config.env ?: 'dev'}"
                }
            }
        }
    }
}
