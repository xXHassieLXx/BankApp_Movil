package com.example.bankapp.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null



public val StarFilled: ImageVector
    get() {
        if (_StarFilled != null) {
            return _StarFilled!!
        }
        _StarFilled = ImageVector.Builder(
            name = "StarFilled",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.22303f, 0.665992f)
                curveTo(7.3255f, 0.4196f, 7.6745f, 0.4196f, 7.777f, 0.666f)
                lineTo(9.41343f, 4.60039f)
                curveTo(9.4566f, 4.7043f, 9.5543f, 4.7752f, 9.6664f, 4.7842f)
                lineTo(13.914f, 5.12475f)
                curveTo(14.18f, 5.1461f, 14.2878f, 5.478f, 14.0852f, 5.6516f)
                lineTo(10.849f, 8.42374f)
                curveTo(10.7636f, 8.4969f, 10.7263f, 8.6118f, 10.7524f, 8.7212f)
                lineTo(11.7411f, 12.866f)
                curveTo(11.803f, 13.1256f, 11.5206f, 13.3308f, 11.2929f, 13.1917f)
                lineTo(7.6564f, 10.9705f)
                curveTo(7.5604f, 10.9119f, 7.4397f, 10.9119f, 7.3437f, 10.9705f)
                lineTo(3.70718f, 13.1917f)
                curveTo(3.4794f, 13.3308f, 3.1971f, 13.1256f, 3.259f, 12.866f)
                lineTo(4.24769f, 8.72118f)
                curveTo(4.2738f, 8.6118f, 4.2365f, 8.4969f, 4.151f, 8.4237f)
                lineTo(0.914889f, 5.65162f)
                curveTo(0.7122f, 5.478f, 0.8201f, 5.1461f, 1.0861f, 5.1247f)
                lineTo(5.3336f, 4.78422f)
                curveTo(5.4457f, 4.7752f, 5.5434f, 4.7043f, 5.5866f, 4.6004f)
                lineTo(7.22303f, 0.665992f)
                close()
            }
        }.build()
        return _StarFilled!!
    }

private var _StarFilled: ImageVector? = null



public val PersonCircle: ImageVector
    get() {
        if (_PersonCircle != null) {
            return _PersonCircle!!
        }
        _PersonCircle = ImageVector.Builder(
            name = "PersonCircle",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                moveToRelative(8f, -7f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.468f, 11.37f)
                curveTo(3.242f, 11.226f, 4.805f, 10f, 8f, 10f)
                reflectiveCurveToRelative(4.757f, 1.225f, 5.468f, 2.37f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 1f)
            }
        }.build()
        return _PersonCircle!!
    }

private var _PersonCircle: ImageVector? = null





public val Shopping_cart: ImageVector
    get() {
        if (_Shopping_cart != null) {
            return _Shopping_cart!!
        }
        _Shopping_cart = ImageVector.Builder(
            name = "Shopping_cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(280f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                reflectiveQuadToRelative(23.5f, -56.5f)
                reflectiveQuadTo(280f, 720f)
                reflectiveQuadToRelative(56.5f, 23.5f)
                reflectiveQuadTo(360f, 800f)
                reflectiveQuadToRelative(-23.5f, 56.5f)
                reflectiveQuadTo(280f, 880f)
                moveToRelative(400f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 800f)
                reflectiveQuadToRelative(23.5f, -56.5f)
                reflectiveQuadTo(680f, 720f)
                reflectiveQuadToRelative(56.5f, 23.5f)
                reflectiveQuadTo(760f, 800f)
                reflectiveQuadToRelative(-23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                moveTo(246f, 240f)
                lineToRelative(96f, 200f)
                horizontalLineToRelative(280f)
                lineToRelative(110f, -200f)
                close()
                moveToRelative(-38f, -80f)
                horizontalLineToRelative(590f)
                quadToRelative(23f, 0f, 35f, 20.5f)
                reflectiveQuadToRelative(1f, 41.5f)
                lineTo(692f, 478f)
                quadToRelative(-11f, 20f, -29.5f, 31f)
                reflectiveQuadTo(622f, 520f)
                horizontalLineTo(324f)
                lineToRelative(-44f, 80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                quadToRelative(-45f, 0f, -68f, -39.5f)
                reflectiveQuadToRelative(-2f, -78.5f)
                lineToRelative(54f, -98f)
                lineToRelative(-144f, -304f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(130f)
                close()
                moveToRelative(134f, 280f)
                horizontalLineToRelative(280f)
                close()
            }
        }.build()
        return _Shopping_cart!!
    }

private var _Shopping_cart: ImageVector? = null
