package com.jgs.jemputyuk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void HalamanUser(View view) {
        Intent intent = new Intent(this,UserActivity.class);
        startActivity(intent);
    }
    public void HalamanLog(View view) {
        Intent intent = new Intent(this,AktivitasActivity.class);
        startActivity(intent);
    }
    public void HalamanMotor(View view) {
        Intent intent = new Intent(this,MotorActivity.class);
        startActivity(intent);
    }
    public void HalamanMobil(View view) {
        Intent intent = new Intent(this,MobilActivity.class);
        startActivity(intent);
    }
}
 