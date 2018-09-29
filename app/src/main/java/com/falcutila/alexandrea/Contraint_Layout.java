package com.falcutila.alexandrea;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Contraint_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contraint_layout);
        Log.d("4ITF","onStart has executed....");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF","onStart has executed....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF", "onResume has executed....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF","onPause has executed....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF","onStop has executed....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF","onRestart has executed....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF","onDestroy has executed....");
    }

    public void ToastDisplay(View v){
         Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show();
        Log.d("4ITF","Toast has been used....");
    }

    public void SnackBarDisplay(View v){
        Snackbar.make(v,"Button is clicked", Snackbar.LENGTH_LONG).show();
        Log.d("4ITF","SnackBar has been used....");
    }
}
