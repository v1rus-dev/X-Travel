package yegor.cheprasov.xtravel.design

import androidx.compose.foundation.border
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppTextField(
    textFieldState: TextFieldState,
    modifier: Modifier = Modifier,
) {
    BasicTextField(
        state = textFieldState,
        modifier = modifier.border(1.dp, color = Color.Blue)
    )
}

@Preview
@Composable
private fun PreviewTextField() {
    var value by remember { mutableStateOf("") }
    val state = remember {
        TextFieldState()
    }
//    AppTextField(value = value, onValueChange = {
//        value = it
//    })
    AppTextField(textFieldState = state)
}