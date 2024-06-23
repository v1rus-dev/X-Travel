import UIKit
import ComposeApp

@main
class AppDelegate: UIResponder, UIApplicationDelegate {
    var window: UIWindow?

    let rootHolder = RootHolder()

    override init() {
        #if DEBUG
        NapierProxyKt.doInitNapier()
        #endif
        InitKoinKt.doInitKoin()
    }

    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
    ) -> Bool {
        window = UIWindow(frame: UIScreen.main.bounds)
        if let window = window {
            window.rootViewController = MainKt.MainViewController(rootComponent: rootHolder.root)
            window.makeKeyAndVisible()
        }
        return true
    }
}
