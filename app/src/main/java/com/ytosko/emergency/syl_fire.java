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

public class syl_fire extends AppCompatActivity {
    Vibrator x;
    Button Sylhet,Sunamganj,Moulovibazar,Habiganj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syl_fire);
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
        x = (Vibrator)syl_fire.this.getSystemService(Context.VIBRATOR_SERVICE);
        Sylhet = findViewById(R.id.zyl);
        Moulovibazar = findViewById(R.id.moul);
        Sunamganj = findViewById(R.id.sun);
        Habiganj = findViewById(R.id.habi);
        Sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:0821-713998"));
                if(ContextCompat.checkSelfPermission(syl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(syl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Sunamganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-009142"));
                if(ContextCompat.checkSelfPermission(syl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(syl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Moulovibazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-009078"));
                if(ContextCompat.checkSelfPermission(syl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(syl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Habiganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-082212"));
                if(ContextCompat.checkSelfPermission(syl_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(syl_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });

    }
}
