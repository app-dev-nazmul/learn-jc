package com.example.learnjc

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjc.ui.theme.LearnJCTheme


@Composable
fun WellnessTaskItem(modifier: Modifier = Modifier, onClose: () -> Unit, taskName: String) {
    var checkState by rememberSaveable { mutableStateOf(false) }

    WellnessTaskItem(
        modifier = modifier,
        taskName = taskName,
        onCheckChanged = { newValue -> checkState = newValue },
        onClose = onClose,
        checked = checkState
    )
}

@Composable
fun WellnessTaskItem(
    modifier: Modifier = Modifier,
    taskName: String,
    onCheckChanged: (Boolean) -> Unit,
    onClose: () -> Unit,
    checked: Boolean
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = taskName, modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        )
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckChanged
        )
        IconButton(onClick = onClose ) { Icon(Icons.Filled.Close, contentDescription = "Close") }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFF, // white
    widthDp = 350,
    heightDp = 600
)
@Composable
fun PreviewWellnessTaskItem() {
    LearnJCTheme { WellnessTaskItem(taskName = "task", onClose = {}) }
}

