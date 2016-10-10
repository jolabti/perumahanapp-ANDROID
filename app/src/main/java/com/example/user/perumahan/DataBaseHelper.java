package com.example.user.perumahan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by johan on 09/10/16.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase _db) {

        _db.execSQL(LoginDataBaseAdapter.DATABASE_CREATE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase _db, int oldVersion, int newVersion) {

        Log.w("TASKDBAdapter", "UPGRADING ROM VERSION" + oldVersion+ "to" + newVersion );

        onCreate(_db);
    }
}
