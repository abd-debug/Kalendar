package com.himanshoe.kalendar.endlos.ui.modifier

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

fun Modifier.dayBackgroundColor(
    selected: Boolean,
    selectedColor: Color
) = this.then(
    Modifier.background(
        when {
            selected -> selectedColor
            else -> Color.Transparent
        }
    )
)
