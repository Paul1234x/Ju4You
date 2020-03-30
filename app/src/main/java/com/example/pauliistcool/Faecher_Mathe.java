package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Faecher_Mathe extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    private MatheMemoDataSource dataSource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faecher__mathe);
        MatheMemo testMemo = new MatheMemo("Paul", 8, 0664);
        Log.d(LOG_TAG, "Inhalt der Testmemo: " + testMemo.toString());

        dataSource = new MatheMemoDataSource(this);
    }
}