package com.zhy.autolayout;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

;

/**
 * Created by zhy on 15/11/19.
 */
public class AutoLayoutActivity extends AppCompatActivity
{
    private static final String LAYOUT_LINEARLAYOUT = "LinearLayout";
    private static final String LAYOUT_FRAMELAYOUT = "FrameLayout";
    private static final String LAYOUT_RELATIVELAYOUT = "RelativeLayout";
    private static final String LAYOUT_CONSTRAINTLAYOUT = "androidx.constraintlayout.widget.ConstraintLayout";
    private static final String LAYOUT_FLEXBOXLAYOUT = "com.google.android.flexbox.FlexboxLayout";
    private static final String LAYOUT_SCROLLVIEW = "ScrollView";
    private static final String LAYOUT_HORIZONTALSCROLLVIEW = "HorizontalScrollView";
    private static final String LAYOUT_NESTEDSCROLLVIEW = "androidx.core.widget.NestedScrollView";


    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs)
    {
        View view = null;
        if (name.equals(LAYOUT_FRAMELAYOUT))
        {
            view = new AutoFrameLayout(context, attrs);
        }

        if (name.equals(LAYOUT_LINEARLAYOUT))
        {
            view = new AutoLinearLayout(context, attrs);
        }

        if (name.equals(LAYOUT_RELATIVELAYOUT))
        {
            view = new AutoRelativeLayout(context, attrs);
        }

        if (name.equals(LAYOUT_CONSTRAINTLAYOUT))
        {
            view = new AutoConstraintLayout(context, attrs);
        }

        if (name.equals(LAYOUT_FLEXBOXLAYOUT))
        {
            view = new AutoFlexboxLayout(context, attrs);
        }

        if (name.equals(LAYOUT_SCROLLVIEW))
        {
            view = new AutoScrollView(context, attrs);
        }

        if (name.equals(LAYOUT_HORIZONTALSCROLLVIEW))
        {
            view = new AutoHorizontalScrollView(context, attrs);
        }

        if (name.equals(LAYOUT_NESTEDSCROLLVIEW))
        {
            view = new AutoNestedScrollView(context, attrs);
        }

        if (view != null) return view;

        return super.onCreateView(name, context, attrs);
    }




}
