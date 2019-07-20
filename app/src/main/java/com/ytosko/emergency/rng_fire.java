package com.ytosko.emergency;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class rng_fire extends AppCompatActivity {
    Vibrator x;
    Button Rangpur, Gaibanda, Kurigram, Lalmonirhat, Nilphamari, Dinajpur, thakurgaon, pancagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rng_fire);
        x = (Vibrator)this.getSystemService( Context.VIBRATOR_SERVICE);
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
        x = (Vibrator)rng_fire.this.getSystemService(Context.VIBRATOR_SERVICE);
        Rangpur = findViewById(R.id.rang);
        Gaibanda = findViewById(R.id.Gai);
        Kurigram = findViewById(R.id.kuri);
        Lalmonirhat = findViewById(R.id.lal);
        Nilphamari = findViewById(R.id.nilpha);
        Dinajpur = findViewById(R.id.din);
        thakurgaon = findViewById(R.id.thakur);
        pancagar = findViewById(R.id.ponc);
        Rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01732-707172"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Gaibanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002582"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Kurigram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-009101"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Lalmonirhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-009105"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Nilphamari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-009105"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Dinajpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-009120"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        thakurgaon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-009131"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        pancagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01732-506811"));
                if (ContextCompat.checkSelfPermission(rng_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(rng_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
    }
}
