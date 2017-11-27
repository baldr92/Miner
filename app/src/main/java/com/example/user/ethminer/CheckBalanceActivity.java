package com.example.user.ethminer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CheckBalanceActivity extends AppCompatActivity {
    TextView ethBalance ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_balance);
        ethBalance = (TextView) findViewById(R.id.tv_ur_balance);

    }

    public void onClickBackToMain(View view) {
        finish();
    }
}
