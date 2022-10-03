package com.lastowski.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MedalTallySection() {
    Text("Hello Custom Component!!")
}

@Preview
@Composable
fun previewMedalTallySection() {
    MaterialTheme {
        MedalTallySection()
    }
}