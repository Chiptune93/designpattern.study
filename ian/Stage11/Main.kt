
fun main() {
    val grafanaImage:Image = GrafanaProxy("grafana.test.com")
    grafanaImage.send()
}
