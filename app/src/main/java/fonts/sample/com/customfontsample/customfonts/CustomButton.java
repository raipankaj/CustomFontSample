package fonts.sample.com.customfontsample.customfonts;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import fonts.sample.com.customfontsample.FontCache;
import fonts.sample.com.customfontsample.R;

public class CustomButton extends AppCompatButton {

    public CustomButton(Context context) {
        super(context);
        init(null);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attributeSet) {

        if (attributeSet != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.CustomFont);
            String fontName = typedArray.getString(R.styleable.CustomFont_fontName);

            if (fontName != null) {
                setTypeface(FontCache.getFont(getContext(), fontName));
            }

            typedArray.recycle();
        }
    }
}
