package yegor.cheprasov.xtravel.feature.main.presentation.compose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import yegor.cheprasov.xtravel.feature.main.presentation.decompose.MainComponent

@Composable
fun MainUI(component: MainComponent) {
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            items(1000) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp, horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(it.toString())
                    Text(it.toString())
                }
            }
        }
    }
}