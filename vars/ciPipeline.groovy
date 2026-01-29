def call(Map config = [:]) {
    node('k8s') {  // ✅ Scripted syntax
        stage('Build') {
            echo "Building service: ${config.service ?: 'unknown'}"
        }
        stage('Test') {
            echo "Running tests"
        }
        stage('Deploy') {
            if (config.deploy) {
                echo "Deploying to ${config.env ?: 'dev'}"
            }
        }
    }
}
