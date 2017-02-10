package fanjh.mine.testmvp.tab.ui;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import fanjh.mine.testmvp.R;
import fanjh.mine.testmvp.base.IView;

/**
 * Created by fanjh on 2017/2/9.
 */
public class TabLayout extends FrameLayout implements IView{
    private LinearLayout mParentLayout;
    private ViewPager mContent;
    private LinearLayout mTabLayout;

    public TabLayout(Context context) {
        this(context,null);
    }

    public TabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
        addView(mParentLayout);
    }

    @Override
    public View setupView() {
        return this;
    }

    private void initView(Context context){
        mParentLayout = (LinearLayout) inflate(context, R.layout.tab_layout,null);
        mContent = (ViewPager) mParentLayout.findViewById(R.id.vp_content);
        mTabLayout = (LinearLayout) mParentLayout.findViewById(R.id.ll_tab_layout);
    }

    public void setupTab(final int postion, int res_id, String text){
        LinearLayout tabContentLayout = (LinearLayout) inflate(getContext(),R.layout.tab_view,null);
        ImageView tabIcon = (ImageView) tabContentLayout.findViewById(R.id.iv_tab_icon);
        TextView tabText = (TextView) tabContentLayout.findViewById(R.id.tv_tab_text);
        tabIcon.setImageResource(res_id);
        tabText.setText(text);
        tabIcon.setSelected(false);
        tabText.setSelected(false);
        tabContentLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setTabSelected(postion);
                mContent.setCurrentItem(postion,false);
            }
        });
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,49,getResources().getDisplayMetrics()));
        params.weight = 1;
        mTabLayout.addView(tabContentLayout,postion,params);
    }

    public void setTabSelected(int position){
        int childCount = mTabLayout.getChildCount();
        for(int i=0;i<childCount;++i) {
            LinearLayout tabContentLayout = (LinearLayout) mTabLayout.getChildAt(i);
            ImageView tabIcon = (ImageView) tabContentLayout.findViewById(R.id.iv_tab_icon);
            TextView tabText = (TextView) tabContentLayout.findViewById(R.id.tv_tab_text);
            tabIcon.setSelected(i==position);
            tabText.setSelected(i==position);
        }
    }

    public void setTabScrollChanged(){
        setTabSelected(0);
        mContent.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTabSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void setPagerAdapter(PagerAdapter adapter){
        mContent.setAdapter(adapter);
    }

}
