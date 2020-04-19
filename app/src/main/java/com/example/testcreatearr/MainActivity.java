package com.example.testcreatearr;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private TextView tv_explain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_explain = findViewById(R.id.tv_explain);
        tv_explain.setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tv_explain) {
            ArrUtils.getInstance().showToast(this, "点击了测试arr打包");
        } else if (id == R.id.btn_1) {
            Toast.makeText(this, "点击了弹出Dialog", Toast.LENGTH_LONG).show();
            MyDialog.getInstance().showDialog(this, "MainActivity调用", "放一首歌来听");
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
