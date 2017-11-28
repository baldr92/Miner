package com.example.user.ethminer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RatesActivity extends AppCompatActivity {


    String url = "https://min-api.cryptocompare.com/data/price?fsym=ETH&tsyms=USD,EUR,GBP,CHF,CNY,JPY";
    TextView tv_usd;
    TextView tv_date;
    TextView tv_euro;
    TextView tv_gbp;
    TextView tv_chf;
    TextView tv_cny;
    TextView tv_jpy;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rates);
        tv_usd = findViewById(R.id.usd_rate);
        tv_date = findViewById(R.id.tv_date);
        tv_euro = findViewById(R.id.eur_rate);
        tv_gbp = findViewById(R.id.gbp_rate);
        tv_chf = findViewById(R.id.chf_rate);
        tv_cny = findViewById(R.id.cny_rate);
        tv_jpy = findViewById(R.id.jpy_rate);
        String date = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        tv_date.setText(date);

        try {
            runUSD();
            runEURO();
            runGBP();
            runCHF();
            runCNY();
            runJPY();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void runUSD() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String myResponse = response.body().string().toString();
                RatesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject json = new JSONObject(myResponse);
                            tv_usd.setText(json.getString("USD"));
                        } catch (JSONException je) {
                            je.printStackTrace();
                        }
                    }
                });
            }
        });
    }

    void runEURO() throws IOException{
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String myResponse = response.body().string().toString();
                RatesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject json = new JSONObject(myResponse);
                            tv_euro.setText(json.getString("EUR"));
                        } catch (JSONException ex) {
                              ex.printStackTrace();
                        }
                    }
                });
            }
        });

    }

    void runGBP() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String myResponse = response.body().string().toString();
                RatesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject json = new JSONObject(myResponse);
                            tv_gbp.setText(json.getString("GBP"));
                        } catch (JSONException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            }
        });

    }

    void runCHF() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String myResponse = response.body().string().toString();
                RatesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject json = new JSONObject(myResponse);
                            tv_chf.setText(json.getString("CHF"));
                        } catch (JSONException je) {
                            je.printStackTrace();
                        }
                    }
                });
            }
        });
    }

    void runCNY() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String myResponse = response.body().string().toString();
                RatesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject json = new JSONObject(myResponse);
                            tv_cny.setText(json.getString("CNY"));
                        } catch (JSONException je) {
                            je.printStackTrace();
                        }
                    }
                });
            }
        });
    }

    void runJPY() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                call.cancel();
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String myResponse = response.body().string().toString();
                RatesActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject json = new JSONObject(myResponse);
                            tv_jpy.setText(json.getString("JPY"));
                        } catch (JSONException je) {
                            je.printStackTrace();
                        }
                    }
                });
            }
        });
    }

    public void onClickBac(View view ) {
        finish();
    }
}
