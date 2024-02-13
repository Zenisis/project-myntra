def call() {
    sh 'trivy image kartik2311/youtube:latest > trivyimage.txt'
}