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

public class raj_fire extends AppCompatActivity {
    Vibrator x;
    Button Rajshahi, Capainowabganj, Nowgaon, Natore, Bogura, Joypurhat, Pabna, Sirajganj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raj_fire);
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
        x = (Vibrator)raj_fire.this.getSystemService(Context.VIBRATOR_SERVICE);
        Rajshahi = findViewById(R.id.raj);
        Capainowabganj = findViewById(R.id.capai);
        Nowgaon = findViewById(R.id.nowga);
        Natore = findViewById(R.id.nator);
        Bogura = findViewById(R.id.bogra);
        Joypurhat = findViewById(R.id.zprht);
        Pabna = findViewById(R.id.pbn);
        Sirajganj = findViewById(R.id.srj);
        Rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-336655"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Capainowabganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002515"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Nowgaon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002527"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Natore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002518"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Bogura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002497"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Sirajganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002549"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Pabna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:0731-62222"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });
        Joypurhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002539"));
                if(ContextCompat.checkSelfPermission(raj_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(raj_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else{
                    startActivity(a);
                }
            }
        });

    }
}
