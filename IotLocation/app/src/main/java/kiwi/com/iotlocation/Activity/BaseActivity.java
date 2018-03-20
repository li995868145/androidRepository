package kiwi.com.iotlocation.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * 项目名：IotLocation
 * 包  名: kiwi.com.iotlocation.Activity
 * 作  者： kiwi
 * 创  建: 2018/3/18 21:00
 * 功  能：1.统一的属性，2.统一的方法，3.统一的接口
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
