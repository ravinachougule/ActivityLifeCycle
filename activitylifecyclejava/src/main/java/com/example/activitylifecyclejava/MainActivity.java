package com.example.activitylifecyclejava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fun1("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        fun1("onstart");
    }

    @Override
    protected void onPause() {
        fun1("onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        fun1("onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        fun1("onRestart");

    }

    @Override
    protected void onStop() {
        fun1("onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        fun1("onDestroy");
        super.onDestroy();
    }
    public void fun1(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }
}
