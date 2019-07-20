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

public class khl_fire extends AppCompatActivity {
    Vibrator x;
    Button Khulna, Bagherhat, Satkhira, Jossore, Norail, Magura, jhinaidoho, Kusthia, Cuadanga, Meherpur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khl_fire);
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
        x = (Vibrator)khl_fire.this.getSystemService(Context.VIBRATOR_SERVICE);
        Khulna = findViewById(R.id.khln);
        Bagherhat = findViewById(R.id.bgrh);
        Satkhira = findViewById(R.id.stk);
        Jossore = findViewById(R.id.jsr);
        Norail = findViewById(R.id.nrl);
        Magura = findViewById(R.id.mgr);
        jhinaidoho = findViewById(R.id.jhn);
        Kusthia = findViewById(R.id.kst);
        Cuadanga = findViewById(R.id.cua);
        Meherpur = findViewById(R.id.meher);
        Khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:041-760333"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Bagherhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:0468-63666"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Satkhira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:0471-62357"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Jossore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:0421-65114"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
       Norail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:0481-62222"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
       Magura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01730-009185"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        jhinaidoho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01717-967188"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Kusthia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01733-620385"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Cuadanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01745-400699"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
        Meherpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent xy = new Intent(Intent.ACTION_CALL);
                xy.setData(Uri.parse("tel:01971-020209"));
                if (ContextCompat.checkSelfPermission(khl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(khl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(xy);
                }
            }
        });
    }
}
