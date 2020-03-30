package com.example.pauliistcool;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class MatheMemoDataSource {
    private static final String LOG_TAG = MatheMemoDataSource.class.getSimpleName();

    private SQLiteDatabase database;
    private MatheMemoDbHelper dbHelper;


    public MatheMemoDataSource(Context context) {
        Log.d(LOG_TAG, "Unsere DataSource erzeugt jetzt den dbHelper.");
        dbHelper = new MatheMemoDbHelper(context);
    }
}
