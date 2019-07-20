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

public class ctg_fire extends AppCompatActivity {
    Vibrator x;
    Button Zone3,Cox, Bandarban, rangamati, Khagrachori, brammanbaria, comilla, cadpur, noakhali, lokkhipur, feni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctg_fire);
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
        x = (Vibrator)ctg_fire.this.getSystemService(Context.VIBRATOR_SERVICE);
        Zone3 = findViewById(R.id.ctg3);
        Cox = findViewById(R.id.cox);
        Bandarban = findViewById(R.id.bandor);
        rangamati = findViewById(R.id.rangam);
        Khagrachori = findViewById(R.id.khgr);
        brammanbaria = findViewById(R.id.brm);
        cadpur = findViewById(R.id.cad);
        noakhali = findViewById(R.id.noa);
        lokkhipur = findViewById(R.id.lokkhi);
        feni = findViewById(R.id.feni);
        comilla = findViewById(R.id.com);
        Zone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002407"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        comilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:081-65090"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Cox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002434"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Bandarban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002460"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        rangamati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002462"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Khagrachori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002454"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        brammanbaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002479"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        cadpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:0841-63340"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        noakhali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002488"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        lokkhipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002495"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        feni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-002492"));
                if (ContextCompat.checkSelfPermission(ctg_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(ctg_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
    }
}
