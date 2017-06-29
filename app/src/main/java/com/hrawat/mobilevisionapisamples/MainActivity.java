package com.hrawat.mobilevisionapisamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBarCode = (Button) findViewById(R.id.btn_bar_code);
        Button btnOcr = (Button) findViewById(R.id.btn_ocr);
        Button btnFace = (Button) findViewById(R.id.btn_scan_face);
        btnBarCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BarCodeActivity.class);
                startActivity(intent);
            }
        });
        btnOcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OcrActivity.class);
                startActivity(intent);
            }
        });
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FaceDetectActivity.class);
                startActivity(intent);
            }
        });
    }
}
