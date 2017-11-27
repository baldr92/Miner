package com.example.user.ethminer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        final EditText et_text = (EditText) findViewById(R.id.et_wallet);

    }

    public void onClickBack(View view) {
        finish();
    }



}