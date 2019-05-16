package liuuu.laurence.myapplication

import android.content.Context
import android.graphics.Canvas
import android.view.View
import android.graphics.Color
import android.graphics.Paint
import android.graphics.*
import android.util.AttributeSet


class CurvedBottomLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : View(context, attrs, defStyleAttr) {

    private val mPath: Path
    private val mPaint: Paint

    init {
        mPath = Path()
        mPaint = Paint()
        mPaint.color = Color.RED
        mPaint.style = Paint.Style.STROKE
        mPaint.strokeWidth = 10f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        mPath.moveTo(0f, 300f)
        mPath.rQuadTo(100f, -100f, 200f, 0f)
        mPath.rQuadTo(100f, 100f, 200f, 0f)
        mPath.rQuadTo(100f, -100f, 200f, 0f)
        mPath.rQuadTo(100f, 100f, 200f, 0f)
        mPath.rQuadTo(100f, -100f, 200f, 0f)
        mPath.rQuadTo(100f, 100f, 200f, 0f)
        canvas?.drawPath(mPath, mPaint)
    }

}