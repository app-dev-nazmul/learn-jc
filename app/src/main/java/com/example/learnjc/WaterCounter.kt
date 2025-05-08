package com.example.learnjc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.learnjc.ui.theme.LearnJCTheme


@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableIntStateOf(0) }

    StatelessCounter(count = count, onIncrement = { count++ }, modifier = modifier)

}

@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(16.dp)) {
        if (count > 0)
            Text(
                text = "you have had ${count} glasses",
            )
        Spacer(modifier.padding(top = 10.dp))
        Button(enabled = count < 10, onClick = {
            onIncrement()
        }) { Text("Add One") }
    }
}


@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFF, // white
    widthDp = 320,
    heightDp = 600
)
@Composable
fun WellnessScreenPreview() {
    LearnJCTheme { WellnessScreen(modifier = Modifier) }
}