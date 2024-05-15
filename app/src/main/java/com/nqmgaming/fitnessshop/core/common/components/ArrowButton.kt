package com.nqmgaming.fitnessshop.core.common.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ArrowButton(
    modifier: Modifier = Modifier,
    onClickArrowButton: () -> Unit = {}
) {
    IconButton(onClick = { onClickArrowButton() }, modifier = modifier) {
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Arrow",
            modifier = Modifier
                .drawBehind {
                    drawRoundRect(
                        color = Color.Black,
                        cornerRadius = CornerRadius(50.dp.toPx())
                    )
                }
                .padding(10.dp)
                .size(100.dp),
            tint = Color.White
        )
    }
}

@Preview
@Composable
private fun ArrowButtonPreView() {
    ArrowButton()
}