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

public class dhk_fire extends AppCompatActivity {
    Vibrator x;
    Button Dhaka;
    Button Gazipur, Rajbari, Munshiganj, Manikganj, Tangail, Faridpur, Kishoreganj, Madaripur, Sariatpur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhk_fire);
        x = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
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
        Dhaka = findViewById(R.id.dhk);
        Gazipur = findViewById(R.id.gzi);
        Rajbari = findViewById(R.id.rajib);
        Munshiganj = findViewById(R.id.mun);
        Manikganj = findViewById(R.id.manik);
        Faridpur = findViewById(R.id.farid);
        Tangail = findViewById(R.id.tng);
        Kishoreganj = findViewById(R.id.kishore);
        Madaripur = findViewById(R.id.madari);
        Sariatpur = findViewById(R.id.soriot);
        x = (Vibrator)dhk_fire.this.getSystemService(Context.VIBRATOR_SERVICE);


        Dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:+8801730002229"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });

        Gazipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002104"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });

        Munshiganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002142"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Manikganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002385"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Tangail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01767-609988"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Faridpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01558-544300"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Rajbari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01726-595141"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Madaripur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01919-800397"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Sariatpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01726-877270"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Kishoreganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002372"));
                if (ContextCompat.checkSelfPermission(dhk_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(dhk_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
    }
}
