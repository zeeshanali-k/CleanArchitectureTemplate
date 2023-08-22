package com.devname.cleanarchitecturetemplate.presentation.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

val bottomSheetCorners = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
val standardRoundedShape = RoundedCornerShape(16.dp)