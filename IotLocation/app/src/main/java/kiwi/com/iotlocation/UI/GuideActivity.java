package kiwi.com.iotlocation.UI;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import kiwi.com.iotlocation.R;
import kiwi.com.iotlocation.View.CommonUtils;

/**
 * 项目名：IotLocation
 * 包  名: kiwi.com.iotlocation.UI
 * 作  者： kiwi
 * 创  建: 2018/3/19 0:02
 * 功  能：TODO
 */
public class GuideActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CommonUtils.setFullScreenNotitle(this);
        setContentView(R.layout.activity_splash);
    }
}
