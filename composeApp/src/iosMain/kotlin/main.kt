import androidx.compose.ui.window.ComposeUIViewController
import yegor.cheprasov.xtravel.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
