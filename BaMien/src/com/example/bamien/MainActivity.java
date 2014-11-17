package com.example.bamien;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        Button btn5=(Button) findViewById(R.id.btn5);
        Button btn6=(Button) findViewById(R.id.btn6);
        Button btn7=(Button) findViewById(R.id.btn7);
        Button btn8=(Button) findViewById(R.id.btn8);
        Button btn9=(Button) findViewById(R.id.btn9);
        Button btn10=(Button) findViewById(R.id.btn10);
        ImageView btnmap=(ImageView) findViewById(R.id.btnmap);
        btnmap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, MapActivity.class);
				startActivity(i);
			}
		});
        
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T1Activity.class);
				startActivity(i);
			}
		});
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T2Activity.class);
				startActivity(i);
			}
		});
        btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T3Activity.class);
				startActivity(i);
			}
		});
        btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T4Activity.class);
				startActivity(i);
			}
		});
        btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T5Activity.class);
				startActivity(i);
			}
		});
        btn6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T6Activity.class);
				startActivity(i);
			}
		});
        btn7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T7Activity.class);
				startActivity(i);
			}
		});
        btn8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T8Activity.class);
				startActivity(i);
			}
		});
        btn9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T9Activity.class);
				startActivity(i);
			}
		});
        btn10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this, T91Activity.class);
				startActivity(i);
			}
		});
    }
}
