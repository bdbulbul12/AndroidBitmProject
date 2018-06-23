package com.programmerhuntbd.bulbul.makecall;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeCall(View view) {
        //String number = "01753155400";
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel"+"01753155400"));
        //intent.setData(Uri.fromParts("Tel: ",number,null));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_LONG).show();
        }

    }
}
