package com.zhiyuan3g.androidweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这是我的第一行代码。
        //伊呀伊呦咪，新城已无旧少年。jjy
        Toast.makeText(this, "阿吉咯", Toast.LENGTH_SHORT).show();
    }
}
