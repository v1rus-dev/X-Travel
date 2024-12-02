package yegor.cheprasov.xtravel.design.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun CountryPreviewCard(
    nameRu: String,
    nameEn: String,
    imageUri: String,
    modifier: Modifier = Modifier,
) {
    val language = Locale.current.language
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
    ) {
        Box {
            
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = nameRu
            )
        }
    }
}

@Preview
@Composable
fun PreviewCountryPreviewCard() {
    CountryPreviewCard(
        nameRu = "Япония",
        nameEn = "Japan",
        imageUri = ""
    )
}