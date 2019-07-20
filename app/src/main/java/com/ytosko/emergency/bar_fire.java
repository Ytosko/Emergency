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

public class bar_fire extends AppCompatActivity {
    Vibrator x;
    Button Barisal,Jhalkathi,Pirozpur,Bhola, Potuakhali, Borguna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_fire);
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
        x = (Vibrator)bar_fire.this.getSystemService(Context.VIBRATOR_SERVICE);
        Barisal = findViewById(R.id.bari);
        Jhalkathi = findViewById(R.id.jhl);
        Pirozpur = findViewById(R.id.prz3);
        Bhola = findViewById(R.id.bhl);
        Potuakhali = findViewById(R.id.ptu);
        Borguna = findViewById(R.id.brg);
         Barisal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 x.vibrate(80);
                 Intent a = new Intent(Intent.ACTION_CALL);
                 a.setData(Uri.parse("tel:0431-56222"));
                 if(ContextCompat.checkSelfPermission(bar_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                     ActivityCompat.requestPermissions(bar_fire.this, new String[]{Manifest.permission.CALL_PHONE} , 1);
                 }
                 else{
                     startActivity(a);
                 }
             }
         });
        Pirozpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01724-849080"));
                if(ContextCompat.checkSelfPermission(bar_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(bar_fire.this, new String[]{Manifest.permission.CALL_PHONE} , 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Jhalkathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:0498-62222"));
                if(ContextCompat.checkSelfPermission(bar_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(bar_fire.this, new String[]{Manifest.permission.CALL_PHONE} , 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Bhola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01714-501896"));
                if(ContextCompat.checkSelfPermission(bar_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(bar_fire.this, new String[]{Manifest.permission.CALL_PHONE} , 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Borguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01728-604860"));
                if(ContextCompat.checkSelfPermission(bar_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(bar_fire.this, new String[]{Manifest.permission.CALL_PHONE} , 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Potuakhali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01777-998333"));
                if(ContextCompat.checkSelfPermission(bar_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(bar_fire.this, new String[]{Manifest.permission.CALL_PHONE} , 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
    }
}
