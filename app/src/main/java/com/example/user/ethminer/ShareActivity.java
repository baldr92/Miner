package com.example.user.ethminer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShareActivity extends AppCompatActivity {


    private final static String PROMO_CODE = "175974257184";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);


    }


    public void onClicksendPromo(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, PROMO_CODE);
        startActivity(intent);
    }

    public void onClickBackMain(View view) {
        finish();
    }

}