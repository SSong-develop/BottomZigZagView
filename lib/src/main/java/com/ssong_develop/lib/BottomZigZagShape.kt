package com.ssong_develop.lib

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import com.ssong_develop.lib.painter.BottomZigZagPainter
import com.ssong_develop.lib.type.PathType

class BottomZigZagShape(
    private val pathType: PathType,
    private val waveCount: Int = 15
) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val pathPainter = BottomZigZagPainter(
            pathType = pathType,
            size = size,
            waveCount = waveCount
        )
        return Outline.Generic(
            path = pathPainter.drawZigZagBottomPath()
        )
    }
}