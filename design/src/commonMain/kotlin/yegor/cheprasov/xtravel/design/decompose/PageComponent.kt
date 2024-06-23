package yegor.cheprasov.xtravel.design.decompose

interface PageComponent {
    val type: PageType
}

enum class PageType {
    Main,
    Favorites
}