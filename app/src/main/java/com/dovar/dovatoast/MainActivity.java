package com.dovar.dovatoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dovar.dovatoast.lib.DToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastUtil.show(this, "hello");
        ToastUtil.showAtCenter(this, "你是来搞笑的吗");
        ToastUtil.show(this, "world");
        ToastUtil.show(this, "你才是来搞笑的");
        ToastUtil.show(this, "mmp");
        ToastUtil.showAtCenter(this, "弄啥嘞");
        ToastUtil.showAtCenter(this, "再瞅一个试试");
        ToastUtil.showAtCenter(this, "哇咔咔。。");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //如果DToast.make(mContext)使用的是ActivityContext,则在退出Activity时需要调用
        DToast.cancelActivityToast(this);
    }
}
