package com.example.mauli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Hospital extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        b10=findViewById(R.id.btn10);
        b11=findViewById(R.id.btn11);
        b12=findViewById(R.id.btn12);
        b13=findViewById(R.id.btn13);
        b14=findViewById(R.id.btn14);
        b15=findViewById(R.id.btn15);
        b16=findViewById(R.id.btn16);
        b17=findViewById(R.id.btn17);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 2186223147";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 2186224345";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 2186224108";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel: ";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 2186223181";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 7741078175";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 2186224330";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 9890922608";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 9561153574";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 8446636399";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 8010061394";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 9922295563";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
    }
}