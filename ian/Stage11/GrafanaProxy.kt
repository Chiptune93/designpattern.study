class GrafanaProxy(private val url: String): Image {
    override fun send() {
        var proxyImage = Grafana(url)
        proxyImage.send()
    }
}
