package com.example.user.ethminer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ToggleButton toggleButton;
    TextView tv_button;
    String balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.PlayBtn);

        toggleButton.setOnCheckedChangeListener(this);


    }

    public void onCheckedChanged(CompoundButton button, boolean isChecked){
        if(isChecked) {

        } else {

        }
    }

    public void miningStart(View view) {



    }
    public void onClickCheckBalance(View view) {
        Intent intent = new Intent(MainActivity.this, CheckBalanceActivity.class);
        intent.putExtra("balance", balance);
        startActivity(intent);

    }
    public void onClickSettings(View view) {
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
    public void onClickShare(View view) {
        Intent intent = new Intent(MainActivity.this, ShareActivity.class);
        startActivity(intent);
    }
    public void onClickRates(View view) {
        Intent intent = new Intent(MainActivity.this, RatesActivity.class);
        startActivity(intent);
    }

}
