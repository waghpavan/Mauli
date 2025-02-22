package com.example.mauli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Police extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String url="tel:+91 8180989902";
                callIntent.setData(Uri.parse(url));
                startActivity(callIntent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent callIntent = new Intent(Intent.ACTION_CALL);
                                      String url="tel:+91 7972969880";
                                      callIntent.setData(Uri.parse(url));
                                      startActivity(callIntent);
                                  }
                              }

        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent callIntent = new Intent(Intent.ACTION_CALL);
                                      String url="tel:+91 9284665325";
                                      callIntent.setData(Uri.parse(url));
                                      startActivity(callIntent);
                                  }
                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent callIntent = new Intent(Intent.ACTION_CALL);
                                      String url="tel:+91 9657699126";
                                      callIntent.setData(Uri.parse(url));
                                      startActivity(callIntent);
                                  }
                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent callIntent = new Intent(Intent.ACTION_CALL);
                                      String url="tel:+91 9850190625";
                                      callIntent.setData(Uri.parse(url));
                                      startActivity(callIntent);
                                  }
                              }
        );
        b6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent callIntent = new Intent(Intent.ACTION_CALL);
                                      String url="tel:+91 8010421371";
                                      callIntent.setData(Uri.parse(url));
                                      startActivity(callIntent);
                                  }
                              }
        );
    }
}