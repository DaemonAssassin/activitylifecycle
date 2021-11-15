package com.gmail.mateendev3.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int a = 5;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("BEAST", "In OnCreate() metheod");
    }



    @Override
    protected void onStart() {
        super.onStart();

        Log.v("BEAST", "In OnStart() metheod");
    }



    @Override
    protected void onResume() {
        super.onResume();

        Log.v("BEAST", "In OnResume() metheod");
    }



    @Override
    protected void onPause() {
        super.onPause();

        Log.v("BEAST", "In OnPause() metheod");
    }



    @Override
    protected void onStop() {
        super.onStop();

        Log.v("BEAST", "In OnStop() metheod");
    }



    @Override
    protected void onRestart() {
        super.onRestart();

        Log.v("BEAST", "In OnRestart() metheod");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v("BEAST", "In OnDestroy() metheod");
    }



    @Override
    public void finish() {
        super.finish();

        Log.v("BEAST", "In finish() metheod");
    }



    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("value", a);
        Log.v("BEAST", "In OnSaveInstanceState() metheod" + " | a = " + a);
    }



    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        a = savedInstanceState.getInt("value");
        Log.v("BEAST", "In OnRestoreInstanceState() metheod" + " | a = " + a);
    }











    void showDialog () {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete");
        builder.setMessage("Do you want to delete?");
        builder.setNegativeButton("Cancel", ((dialog, which) -> dialog.cancel()));
        builder.setPositiveButton("OK", ((dialog, which) -> dialog.cancel()));
        builder.create().show();
    }

    public void setDialog(View view) {
        showDialog();
    }
}