package com.example.user.ethminer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rates);
    }

    public void onClickBac(View view ) {
        finish();
    }
}
