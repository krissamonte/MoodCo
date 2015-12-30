package com.example.kris.moodco;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kris on 12/10/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper{
    static final String SCHEMA = "moodcodb";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, SCHEMA, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String moodtable = "CREATE TABLE " + Mood.TABLE_NAME +
                " ( " + Mood.COLUMN_NAME + " TEXT , "
                + " " + Mood.COLUMN_SCORE + " INTEGER );";
        db.execSQL(moodtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //METHODS
    public void addScore(Mood m){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Mood.COLUMN_NAME, m.getName());
        cv.put(Mood.COLUMN_SCORE, m.getScore());
        db.update(Mood.TABLE_NAME, cv, Mood.COLUMN_SCORE + " = ? ", new String[]{String.valueOf(m.getScore())});

    }


}
