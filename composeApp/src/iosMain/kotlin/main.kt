import androidx.compose.ui.window.ComposeUIViewController
import yegor.cheprasov.xtravel.App
import platform.UIKit.UIViewController
import yegor.cheprasov.xtravel.root.decompose.RootComponent

fun MainViewController(rootComponent: RootComponent): UIViewController = ComposeUIViewController { App(rootComponent) }
