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

public class mym_fire extends AppCompatActivity {
    Vibrator x;
    Button Mymensingh, Jamalpur, Sherpur, Netrokona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mym_fire);
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
        Mymensingh = findViewById(R.id.mym);
        Jamalpur = findViewById(R.id.jml);
        Sherpur = findViewById(R.id.shr);
        Netrokona = findViewById(R.id.ntro);
        x = (Vibrator)mym_fire.this.getSystemService(Context.VIBRATOR_SERVICE);

        Mymensingh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002353"));
                if(ContextCompat.checkSelfPermission(mym_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(mym_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else
                {
                    startActivity(a);
                }
            }
        });
        Jamalpur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002399"));
                if(ContextCompat.checkSelfPermission(mym_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(mym_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else
                {
                    startActivity(a);
                }
            }
        });
        Sherpur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01730-002187"));
                if(ContextCompat.checkSelfPermission(mym_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(mym_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else
                {
                    startActivity(a);
                }
            }
        });
        Netrokona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x.vibrate(80);
                Intent a = new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:01789-744212"));
                if(ContextCompat.checkSelfPermission(mym_fire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(mym_fire.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
                else
                {
                    startActivity(a);
                }
            }
        });
    }
}
