class Grafana(url: String): Image {
    private var img: String? = null
    init {
        getImage(url)
    }

    private fun getImage(url:String) {
        try {
            /*
            실제로 그라파라 URL 로 이미지를 저장함
             */
            println("이미지 다운로드 중" )
            Thread.sleep((1000))
            img = url
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        println("$url 의 이미지 저장 완료" )
    }

    override fun send() {
        /*
        슬랙 봇에서 특정 채널로 이미지를 보냄
         */
        println("$img 이미지 전달 완료" )
    }
}