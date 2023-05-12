package com.iisysgroup.`custom-text`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.iisysgroup.`custom-text`.ui.theme.CustomTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTextTheme {
                @Composable
                fun CustomText(
                    text: String,
                    fontSize: Int,
                    textColor: Color,
                    modifier: Modifier = Modifier,
                    fontFamily: Int,
                    textAlign: TextAlign = TextAlign.Justify
                ) {

                    Text(
                        text = text,
                        fontSize = fontSize.sp,
                        color = textColor,
                        modifier = modifier,
                        fontFamily = setFontFamily(fontFamily),
                        textAlign = textAlign
                    )

                }
            }
        }
    }
}

private fun setFontFamily(fontFamily: Int) = FontFamily(Font(fontFamily))

