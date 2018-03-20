package kiwi.com.iotlocation.UI;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import kiwi.com.iotlocation.Constents.Constents;
import kiwi.com.iotlocation.MainActivity;
import kiwi.com.iotlocation.R;
import kiwi.com.iotlocation.UtilTools.ShareUtils;
import kiwi.com.iotlocation.View.CommonUtils;
import kiwi.com.iotutils.UtilTools.FontUtils;

/**
 * 项目名：IotLocation
 * 包  名: kiwi.com.iotlocation.UI
 * 作  者： kiwi
 * 创  建: 2018/3/18 23:43
 * 功  能：TODO
 */
public class SplashActivity extends AppCompatActivity {

    private TextView tv_splash;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case Constents.HANDLER_SPLASH:
                    if(isFirstRun()) {
                        startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                    }else{
                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    }
                    finish();
                    break;
            }
        }
    };

    private boolean isFirstRun() {
        boolean bl = ShareUtils.getBoolean(this,Constents.IS_FIRST_RUN, true);
        if(bl == true){
            ShareUtils.putBoolean(this, Constents.IS_FIRST_RUN, false);
            return true;
        }else {
            return false;
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CommonUtils.setFullScreenNotitle(this);
        setContentView(R.layout.activity_splash);

        initView();
        initData();
    }

    private void initView() {
        handler.sendEmptyMessageDelayed(Constents.HANDLER_SPLASH, 2000);
        tv_splash = (TextView) findViewById(R.id.tv_splash);

        FontUtils.setFont(this,tv_splash,"fonts/FONT.TTF");
    }

    private void initData() {

    }
}
