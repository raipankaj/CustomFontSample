package fonts.sample.com.customfontsample;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

/**
 * This font cache is used so that once the typeface is created  for the font than reuse that typeface
 * in future instead of recreating it again and again.
 */
public class FontCache {

    private static HashMap<String, Typeface> sFontCache = new HashMap<>();

    public static Typeface getFont(Context context, String fontName) {
        if (sFontCache.get(fontName) == null) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);
            sFontCache.put(fontName, typeface);
        }
        return sFontCache.get(fontName);
    }
}
