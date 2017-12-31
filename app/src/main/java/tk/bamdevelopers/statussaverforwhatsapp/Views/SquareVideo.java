package tk.bamdevelopers.statussaverforwhatsapp.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.VideoView;

import tk.bamdevelopers.statussaverforwhatsapp.R;

/**
 * TODO: document your custom view class.
 */
public class SquareVideo extends VideoView {
    public SquareVideo(Context context) {
        super(context);
    }

    public SquareVideo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareVideo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
