package com.example.user.ethminer;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {
    EditText ed_wallet;
    Button btn_wallet;
    SharedPreferences sharedPreferences;
    final String SAVED_TEXT = "my_wallet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ed_wallet = findViewById(R.id.et_wallet);


        loadText();

    }

    public void onClickSetWallet() {

    }

    protected void onDestroy(){
        super.onDestroy();
        saveText();
    }

    void saveText(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sharedPreferences.edit();
        ed.putString(SAVED_TEXT, ed_wallet.getText().toString());
        ed.commit();
    }

    void loadText(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        String saved_wallet = sharedPreferences.getString(SAVED_TEXT, "");
        ed_wallet.setText(saved_wallet);
    }



    public void onClickBack(View view) {
        finish();
    }



}