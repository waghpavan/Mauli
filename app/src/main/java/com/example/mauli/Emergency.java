package com.example.mauli;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.net.Uri;
public class Emergency extends AppCompatActivity {
        ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_emergency);
            b1 = findViewById(R.id.b1);
            b2 = findViewById(R.id.b2);
            b3 = findViewById(R.id.b3);
            b4 = findViewById(R.id.b4);
            b5 = findViewById(R.id.b5);
            b6 = findViewById(R.id.b6);
            b7 = findViewById(R.id.b7);
            b8 = findViewById(R.id.b8);
            b9 = findViewById(R.id.b9);
            b10 = findViewById(R.id.b10);
//
//          if(checkCallingOrSelfPermission(Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
//          {
//              ActivityResultContracts.RequestPermission
//          }


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 100";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 108";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 104";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 1098";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 1091";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 1090";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 1077";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });

            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 1800 22 4949";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 182";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
            b10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    String url = "tel: 112";
                    callIntent.setData(Uri.parse(url));
                    startActivity(callIntent);
                }
            });
        }
    }


