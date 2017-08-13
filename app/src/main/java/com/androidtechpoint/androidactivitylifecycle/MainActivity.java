package com.androidtechpoint.androidactivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("Activity Life cycle", "Saving the activity state.");
        //you can get the data from the text fields too
        outState.putString("string", "My string to save");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("Activity Life cycle", "getting the saved data and using it.");
        Toast.makeText(this, savedInstanceState.getString("string"), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Activity Life cycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity Life cycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity Life cycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity Life cycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity Life cycle", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Activity Life cycle", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activity Life cycle", "onDestroy");
    }
}
