package meteor.ui.compose

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color

object Colors {
    val bg900 = Color(0x263238)
    val surfaceColor = Color(0xFF272525)
    val surfaceDarkColor = Color(0xFF1B1A1A)
    val surfaceDarkerColor = Color(0xFF111010)
    val secondaryColor = Color(0xff7e00e1)
    val secondarySurfaceColor = Color(0xff292828)

    val surface = mutableStateOf(surfaceColor)
    val surfaceDark = mutableStateOf(surfaceDarkColor)
    val surfaceDarker = mutableStateOf(surfaceDarkerColor)
    val secondary = mutableStateOf(secondaryColor)
    val secondarySurface = mutableStateOf(this.secondarySurfaceColor)
}