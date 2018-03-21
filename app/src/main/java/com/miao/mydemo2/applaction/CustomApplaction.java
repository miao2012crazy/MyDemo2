package com.miao.mydemo2.applaction;

import com.alibaba.android.arouter.launcher.ARouter;
import com.miao.common.BaseApplication;
import com.miao.common.BuildConfig;

/**
 * Created by Administrator on 2018/3/21 0021.
 */
public class CustomApplaction extends BaseApplication{
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
