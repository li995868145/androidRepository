package kiwi.com.iotlocation.UI;

import android.os.Bundle;
import android.view.WindowManager;

import kiwi.com.iotlocation.Activity.BaseActivity;
import kiwi.com.iotlocation.R;
import kiwi.com.iotlocation.View.CommonUtils;

/**
 * 项目名：IotLocation
 * 包  名: kiwi.com.iotlocation.Activity
 * 作  者： kiwi
 * 创  建: 2018/3/18 23:11
 * 功  能：TODO
 */
public class SettingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CommonUtils.setFullScreenNotitle(this);
        setContentView(R.layout.activity_setting);

        initView();
        initData();

    }

    private void initView() {
    }

    private void initData() {
    }
}
