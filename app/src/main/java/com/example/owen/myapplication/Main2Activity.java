package com.example.owen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    public static final String Page2Name ="Page2Name";
    EditText username;
    String Stringname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username=(EditText)findViewById(R.id.et_text);
        Button backbtn = (Button)findViewById(R.id.button2) ;
        backbtn.setOnClickListener(back);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Stringname=username.getText().toString();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private View.OnClickListener back =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent();
            intent.putExtra(Page2Name,Stringname);
            setResult(RESULT_OK,intent);
            finish();
        }
    };
}
