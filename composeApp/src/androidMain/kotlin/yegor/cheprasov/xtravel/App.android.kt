package yegor.cheprasov.xtravel

import android.app.Application
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arkivanov.decompose.defaultComponentContext
import yegor.cheprasov.xtravel.root.decompose.DefaultRootComponent
import yegor.cheprasov.xtravel.utils.initNapier

class AndroidApp : Application() {
    companion object {
        lateinit var INSTANCE: AndroidApp
    }

    override fun onCreate() {
        super.onCreate()

        INSTANCE = this

        initNapier()
        KoinInjector.inject(INSTANCE)
    }
}

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = DefaultRootComponent(
            componentContext = defaultComponentContext()
        )

        enableEdgeToEdge()
        setContent { App(rootComponent = root) }
    }
}

internal actual fun openUrl(url: String?) {
    val uri = url?.let { Uri.parse(it) } ?: return
    val intent = Intent().apply {
        action = Intent.ACTION_VIEW
        data = uri
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }
    AndroidApp.INSTANCE.startActivity(intent)
}