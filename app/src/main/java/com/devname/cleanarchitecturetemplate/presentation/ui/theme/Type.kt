package com.devname.cleanarchitecturetemplate.presentation.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.devname.cleanarchitecturetemplate.R

val interFamily = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_semi_bold, FontWeight.SemiBold),
    Font(R.font.inter_extra_bold, FontWeight.ExtraBold),
)

// Set of Material typography styles to start with
//TODO
val Typography = Typography(
    bodyMedium = TextStyle(
        //load font from resource
        fontFamily = interFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

@Composable
fun SmallBlackText(
    text: String,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center
) {
    Text(
        modifier = modifier,
        text = text,
        textAlign = textAlign,
        style = TextStyle(
            fontFamily = interFamily,
            fontWeight = FontWeight.Normal,
            color = colorResource(R.color.black),
            fontSize = 14.sp
        ),
    )
}
