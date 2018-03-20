package kiwi.com.iotlocation.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kiwi.com.iotlocation.R;

/**
 * 项目名：IotLocation
 * 包  名: kiwi.com.iotlocation.Fragment
 * 作  者： kiwi
 * 创  建: 2018/3/18 21:33
 * 功  能：个人中心
 */
public class UsrFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_user,null);
        return view;
    }
}
