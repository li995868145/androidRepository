package kiwi.com.iotlocation;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

import kiwi.com.iotlocation.UI.SettingActivity;
import kiwi.com.iotlocation.Fragment.HomeFragment;
import kiwi.com.iotlocation.Fragment.PictureFragment;
import kiwi.com.iotlocation.Fragment.UsrFragment;
import kiwi.com.iotlocation.Fragment.UtilsFragment;
import kiwi.com.iotlocation.Logger.Logger;
import kiwi.com.iotlocation.View.CommonUtils;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    // tablayout
    private TabLayout mtab;
    // viewpager
    private ViewPager mvp;
    // title
    private List<String> mtitle;
    // fragment
    private List<Fragment>mfragment;

    private FloatingActionButton fab_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CommonUtils.setFullScreenNotitle(this);
        setContentView(R.layout.activity_main);
        //去掉阴影
        getSupportActionBar().setElevation(0);

        Logger.i("onCreate ===============");

        initData();

        initView();
    }

    private void initView() {
        mtab = (TabLayout) findViewById(R.id.mtab);
        mvp = (ViewPager) findViewById(R.id.mvp);
        fab_setting = (FloatingActionButton)findViewById(R.id.fab_setting);


        fab_setting.setVisibility(View.GONE);

        fab_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SettingActivity.class));
            }
        });

        mvp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Logger.i("onPageScrolled");
            }

            @Override
            public void onPageSelected(int position) {
                Logger.i("onPageSelected");
                if(position == 0){
                    fab_setting.setVisibility(View.GONE);
                } else{
                    fab_setting.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Logger.i("onPageScrollStateChanged");
            }
        });

        mvp.setOffscreenPageLimit(mfragment.size());

        mvp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mfragment.get(position);
            }

            @Override
            public int getCount() {
                return mfragment.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mtitle.get(position);
            }
        });

        mtab.setupWithViewPager(mvp);
    }

    private void initData() {
        mtitle = new ArrayList<String>();
        mtitle.add("首页");
        mtitle.add("工具");
        mtitle.add("图片");
        mtitle.add("个人");

        mfragment = new ArrayList<Fragment>();
        mfragment.add(new HomeFragment());
        mfragment.add(new PictureFragment());
        mfragment.add(new UsrFragment());
        mfragment.add(new UtilsFragment());
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    @Override
    protected void onStart() {
        super.onStart();
        Logger.i("onStart ===============");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.i("onResume ===============");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.i("onPause ===============");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.i("onStop ===============");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.i("onRestart ===============");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.i("onDestroy ===============");
    }



}
