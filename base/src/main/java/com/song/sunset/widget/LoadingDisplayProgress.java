package com.song.sunset.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import android.text.TextPaint;

import com.song.sunset.utils.ViewUtil;

/**
 * Created by Song on 2016/8/29 0029.
 * Email:z53520@qq.com
 */
public class LoadingDisplayProgress extends Drawable {

    public static final float MAIN_TEXT_SIZE = ViewUtil.dip2px(17);
    public static final float SUB_TEXT_SIZE = ViewUtil.dip2px(13);
    public static final float CIRCLE_STROKE_WIDTH = ViewUtil.dip2px(3);

    private Paint mainTextPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    private Paint subTextPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    private Paint bgCirclePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint loadingCirclePaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private String mTextPercent = "0";
    private int mLastLevel = 0;
    private int circleRadius = 0;
    private int position = -1;

    public LoadingDisplayProgress(int position) {
        setTextType(mainTextPaint, Color.parseColor("#2bbad8"), MAIN_TEXT_SIZE);
        setTextType(subTextPaint, Color.LTGRAY, SUB_TEXT_SIZE);
        setCircleType(bgCirclePaint, Color.LTGRAY);
        setCircleType(loadingCirclePaint, Color.parseColor("#2bbad8"));
        this.position = position;
    }

    private void setTextType(Paint p, int color, float size) {
        p.setTextSize(size);
        p.setColor(color);
    }

    private void setCircleType(Paint p, int color) {
        p.setColor(color);
        p.setStrokeWidth(CIRCLE_STROKE_WIDTH);
        p.setStyle(Paint.Style.STROKE);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        Rect rect = getBounds();
        int width = rect.width();
        int height = rect.height();
        int centerX = rect.centerX();
        int centerY = rect.centerY();

        int mainTextX = centerX - (int) (mainTextPaint.measureText(position + "")) / 2;
        int mainTextY = mainTextPaint.getFontMetricsInt().descent + centerY;
        int subTextHeight = subTextPaint.getFontMetricsInt().descent - subTextPaint.getFontMetricsInt().ascent;
        int subTextX = centerX - (int) (subTextPaint.measureText(mTextPercent) / 2);
        float subTextY = mainTextY + subTextHeight * 1.2f;

        int minSize = Math.min(width, height);
        int minRadius = (int) ((subTextY - centerY) * 1.1);
        circleRadius = minSize / 7;
        if (circleRadius < minRadius) {
            circleRadius = minRadius;
        }

        if (position != -1) {
            canvas.drawText(position + "", mainTextX, mainTextY, mainTextPaint);
            canvas.drawText(mTextPercent, subTextX, subTextY, subTextPaint);
        } else {
            subTextY = subTextPaint.getFontMetricsInt().descent + centerY;
            canvas.drawText(mTextPercent, subTextX, subTextY, subTextPaint);
        }
        canvas.drawCircle(centerX, centerY, circleRadius, bgCirclePaint);

        RectF arcRect = new RectF((width / 2 - circleRadius), (height / 2 - circleRadius), (width / 2 + circleRadius), (height / 2 + circleRadius));
        canvas.drawArc(arcRect, -90, getLevel() * 360 / 10000, false, loadingCirclePaint);
    }

    @Override
    protected boolean onLevelChange(int level) {
        if (mLastLevel == level) {
            return super.onLevelChange(level);
        } else {
            mLastLevel = level;
            mTextPercent = "" + ((level) / 100);
            invalidateSelf();
            return true;
        }
    }

    @Override
    public void setAlpha(int i) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.UNKNOWN;
    }
}
