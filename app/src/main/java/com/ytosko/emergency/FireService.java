package com.ytosko.emergency;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class FireService extends AppCompatActivity {
    Vibrator x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_service);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        ActionBar a = getSupportActionBar();
        a.hide();
        Button Dhaka = (Button)findViewById(R.id.dhkd);
        Button Mymensingh = (Button)findViewById(R.id.mymn);
        Button Barisal = (Button)findViewById(R.id.bar);
        Button Sylhet = (Button)findViewById(R.id.syl);
        Button Rajshahi = (Button)findViewById(R.id.raj);
        Button Rangpur = (Button)findViewById(R.id.rng);
        Button Chittagong = (Button)findViewById(R.id.ctg);
        Button Khulna = (Button)findViewById(R.id.khl);
        x = (Vibrator)FireService.this.getSystemService(Context.VIBRATOR_SERVICE);

        Dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , dhk_fire.class);
                startActivity(a);
            }
        });
        Mymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , mym_fire.class);
                startActivity(a);
            }
        });
        Barisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , bar_fire.class);
                startActivity(a);
            }
        });
        Sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , syl_fire.class);
                startActivity(a);
            }
        });
        Rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , raj_fire.class);
                startActivity(a);
            }
        });
        Rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , rng_fire.class);
                startActivity(a);
            }
        });
        Chittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , ctg_fire.class);
                startActivity(a);
            }
        });
        Khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(FireService.this , khl_fire.class);
                startActivity(a);
            }
        });

    }
}
