package yegor.cheprasov.xtravel.design

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.text2.BasicTextField2
import androidx.compose.foundation.text2.input.TextFieldLineLimits
import androidx.compose.foundation.text2.input.TextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AppTextField(
    state: TextFieldState,
    modifier: Modifier = Modifier,
) {
    BasicTextField2(
        state = state,
        modifier = modifier.border(1.dp, color = Color.Blue),
        lineLimits = TextFieldLineLimits.SingleLine
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
private fun PreviewTextField() {
    val state = remember { TextFieldState() }
    AppTextField(state = state)
}