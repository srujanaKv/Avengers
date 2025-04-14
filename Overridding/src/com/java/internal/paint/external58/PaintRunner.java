package com.java.internal.paint.external58;

import com.java.internal.paint.internal58.Paint;
import com.java.internal.paint.internal58.WallPaint;

public class PaintRunner {

    public void startPainting(Paint paint) {
        if (paint != null) {
            paint.Apply();
            if (paint instanceof WallPaint) {
                WallPaint wallPaint = (WallPaint) paint;
                wallPaint.Dry();
            }
        } else {
            System.out.println("No paint to apply.");
        }
    }
}
