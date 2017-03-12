package com.example.lenovo.touch_event;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Lenovo on 12-03-2017.
 */
public class ExploreTouchEvent extends View {
    private Paint paint=new Paint();
    private Path path=new Path();
    public ExploreTouchEvent(Context context, AttributeSet attrrs) {
        super(context,attrrs);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(7f);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.RED);
        canvas.drawPath(path,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float eventx=event.getX();
        float eventy=event.getY();

        switch (event.getAction()){


            case MotionEvent.ACTION_DOWN:
                path.moveTo(eventx,eventy);
                return true;

            case MotionEvent.ACTION_MOVE:
                path.lineTo(eventx,eventy);
                break;

            case MotionEvent.ACTION_UP:
                break;
            default:
                return false;

        }

            invalidate();
        return true;
    }
}

































