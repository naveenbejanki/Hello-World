package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void ButtonIsClick(View buttonview){
        //int result=5*6;
        //Log.i("OPERTION" ,result + "");

        //TextView text=findViewById(R.id.naveen);
        //Log.i("TAG", text.getText().toString());
//        EditText EnterName=findViewById(R.id.EnterName);
//        Log.i("NAME", EnterName.getText().toString());

        //Toast.makeText(MainActivity.this,"this is a display message",Toast.LENGTH_SHORT).show();

        ImageView imageView=findViewById(R.id.ima);
        imageView.setImageResource(R.drawable.monarch);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
