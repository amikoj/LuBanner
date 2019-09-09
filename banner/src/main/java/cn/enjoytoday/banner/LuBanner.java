package cn.enjoytoday.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

import cn.enjoytoday.banner.interfaces.Indicator;

/**
 * Created by Android Studio.
 * User: caihaifei
 * Date: 2019/9/9
 * Time: 16:54
 * WebBlog:http://www.enjoytoday.cn
 */
public class LuBanner extends ViewGroup implements LuBannerInterface{


    //适配器
    private Indicator indicator;
    private boolean isShowIndicator =  false; //是否显示指示器





    public LuBanner(Context context) {
        this(context,null);
    }

    public LuBanner(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public LuBanner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    //初始化数据
    private void init(){

    }


    /**
     * 确定每个字view的摆放位置
     * @param b
     * @param i
     * @param i1
     * @param i2
     * @param i3
     */
    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }




    /**
     * view测量
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    /**
     * 尺寸发生改变，在onMeasure之后调用
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }
}
