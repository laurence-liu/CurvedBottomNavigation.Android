package liuuu.laurence.myapplication

import android.content.Context
import android.graphics.Canvas
import android.view.View
import android.graphics.Color
import android.graphics.Paint
import android.graphics.*
import android.util.AttributeSet


class CurvedBottomLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var mRadius: Int = 0

    private val mPath: Path
    private val mPaint: Paint

    private val mFirstCurveStartPoint = Point()
    private val mFirstCurveEndPoint = Point()
    private val mFirstCurveControlPoint1 = Point()
    private val mFirstCurveControlPoint2 = Point()

    private var mSecondCurveStartPoint = Point()
    private val mSecondCurveEndPoint = Point()
    private val mSecondCurveControlPoint1 = Point()
    private val mSecondCurveControlPoint2 = Point()

    init {
        mRadius = 256 / 2
        mPath = Path()
        mPaint = Paint()
        mPaint.color = Color.RED
        mPaint.style = Paint.Style.STROKE
        mPaint.strokeWidth = 10f
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mFirstCurveStartPoint.set(width / 5 - mRadius * 2 - mRadius / 3, 0)
        mFirstCurveEndPoint.set(width / 5, mRadius + mRadius / 4)

        mSecondCurveStartPoint = mFirstCurveEndPoint
        mSecondCurveEndPoint.set(width / 5 + mRadius * 2 + mRadius / 3, 0)

        mFirstCurveControlPoint1.set(
            mFirstCurveStartPoint.x + mRadius + mRadius / 4,
            mFirstCurveStartPoint.y
        )

        mFirstCurveControlPoint2.set(
            mFirstCurveEndPoint.x - mRadius * 2 + mRadius,
            mFirstCurveEndPoint.y
        )

        mSecondCurveControlPoint1.set(
            mSecondCurveStartPoint.x + mRadius * 2 - mRadius,
            mSecondCurveStartPoint.y
        )
        mSecondCurveControlPoint2.set(
            mSecondCurveEndPoint.x - (mRadius + mRadius / 4),
            mSecondCurveEndPoint.y
        )

        mPath.moveTo(0f, 300f)
        mPath.lineTo(mFirstCurveStartPoint.x.toFloat(), mFirstCurveStartPoint.y.toFloat() + 300f)
        mPath.cubicTo(
            mFirstCurveControlPoint1.x.toFloat(), mFirstCurveControlPoint1.y.toFloat() + 300f,
            mFirstCurveControlPoint2.x.toFloat(), mFirstCurveControlPoint2.y.toFloat() + 300f,
            mFirstCurveEndPoint.x.toFloat(), mFirstCurveEndPoint.y.toFloat() + 300f
        )

        mPath.cubicTo(
            mSecondCurveControlPoint1.x.toFloat(), mSecondCurveControlPoint1.y.toFloat() + 300f,
            mSecondCurveControlPoint2.x.toFloat(), mSecondCurveControlPoint2.y.toFloat() + 300f,
            mSecondCurveEndPoint.x.toFloat(), mSecondCurveEndPoint.y.toFloat() + 300f
        )

        mPath.lineTo(width.toFloat(), 300f)

        // -----------------------------------------------------------

        mFirstCurveStartPoint.set(width / 2 - mRadius * 2 - mRadius / 3, 0)
        mFirstCurveEndPoint.set(width / 2, mRadius + mRadius / 4)

        mSecondCurveStartPoint = mFirstCurveEndPoint
        mSecondCurveEndPoint.set(width / 2 + mRadius * 2 + mRadius / 3, 0)

        mFirstCurveControlPoint1.set(
            mFirstCurveStartPoint.x + mRadius + mRadius / 4,
            mFirstCurveStartPoint.y
        )

        mFirstCurveControlPoint2.set(
            mFirstCurveEndPoint.x - mRadius * 2 + mRadius,
            mFirstCurveEndPoint.y
        )

        mSecondCurveControlPoint1.set(
            mSecondCurveStartPoint.x + mRadius * 2 - mRadius,
            mSecondCurveStartPoint.y
        )
        mSecondCurveControlPoint2.set(
            mSecondCurveEndPoint.x - (mRadius + mRadius / 4),
            mSecondCurveEndPoint.y
        )

        mPath.moveTo(0f, 600f)
        mPath.lineTo(mFirstCurveStartPoint.x.toFloat(), mFirstCurveStartPoint.y.toFloat() + 600f)
        mPath.cubicTo(
            mFirstCurveControlPoint1.x.toFloat(), mFirstCurveControlPoint1.y.toFloat() + 600f,
            mFirstCurveControlPoint2.x.toFloat(), mFirstCurveControlPoint2.y.toFloat() + 600f,
            mFirstCurveEndPoint.x.toFloat(), mFirstCurveEndPoint.y.toFloat() + 600f
        )

        mPath.cubicTo(
            mSecondCurveControlPoint1.x.toFloat(), mSecondCurveControlPoint1.y.toFloat() + 600f,
            mSecondCurveControlPoint2.x.toFloat(), mSecondCurveControlPoint2.y.toFloat() + 600f,
            mSecondCurveEndPoint.x.toFloat(), mSecondCurveEndPoint.y.toFloat() + 600f
        )

        mPath.lineTo(width.toFloat(), 600f)

        // -----------------------------------------------------------

        mFirstCurveStartPoint.set(width * 4 / 5 - mRadius * 2 - mRadius / 3, 0)
        mFirstCurveEndPoint.set(width * 4 / 5, mRadius + mRadius / 4)

        mSecondCurveStartPoint = mFirstCurveEndPoint
        mSecondCurveEndPoint.set(width * 4 / 5 + mRadius * 2 + mRadius / 3, 0)

        mFirstCurveControlPoint1.set(
            mFirstCurveStartPoint.x + mRadius + mRadius / 4,
            mFirstCurveStartPoint.y
        )

        mFirstCurveControlPoint2.set(
            mFirstCurveEndPoint.x - mRadius * 2 + mRadius,
            mFirstCurveEndPoint.y
        )

        mSecondCurveControlPoint1.set(
            mSecondCurveStartPoint.x + mRadius * 2 - mRadius,
            mSecondCurveStartPoint.y
        )
        mSecondCurveControlPoint2.set(
            mSecondCurveEndPoint.x - (mRadius + mRadius / 4),
            mSecondCurveEndPoint.y
        )

        mPath.moveTo(0f, 900f)
        mPath.lineTo(mFirstCurveStartPoint.x.toFloat(), mFirstCurveStartPoint.y.toFloat() + 900f)
        mPath.cubicTo(
            mFirstCurveControlPoint1.x.toFloat(), mFirstCurveControlPoint1.y.toFloat() + 900f,
            mFirstCurveControlPoint2.x.toFloat(), mFirstCurveControlPoint2.y.toFloat() + 900f,
            mFirstCurveEndPoint.x.toFloat(), mFirstCurveEndPoint.y.toFloat() + 900f
        )

        mPath.cubicTo(
            mSecondCurveControlPoint1.x.toFloat(), mSecondCurveControlPoint1.y.toFloat() + 900f,
            mSecondCurveControlPoint2.x.toFloat(), mSecondCurveControlPoint2.y.toFloat() + 900f,
            mSecondCurveEndPoint.x.toFloat(), mSecondCurveEndPoint.y.toFloat() + 900f
        )

        mPath.lineTo(width.toFloat(), 900f)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawPath(mPath, mPaint)
    }

}