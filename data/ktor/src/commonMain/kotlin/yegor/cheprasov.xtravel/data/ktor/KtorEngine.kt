package yegor.cheprasov.xtravel.data.ktor

import io.ktor.client.HttpClient

class KtorEngine(
    private val httpClient: HttpClient
) {
    
    companion object {
        private const val BASE_PORT = "8080"
        private const val BASE_URL = "http://192.168.100.4:$BASE_PORT"
    }
    
}