package com.example.muradahmad.diabetesfitness;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by muradahmad on 07/05/2018.
 */

public class Database extends SQLiteOpenHelper {

    public static final String BLOOMER_DB = "Bloomer.db";
    public static final String BLOOMER_TABLE = "Bloomer_Table";
    public static final String USER_NAME = "User_Name";

    public static Database instance;


    public static  Database getInstance(Context context) {
        if (instance == null) {
            instance = new Database(context);
        }
        return instance;
    }

    private Database(Context context) {
        super(context, BLOOMER_DB, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + BLOOMER_TABLE + "(User_Name TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + BLOOMER_TABLE);
        onCreate(db);

    }
    public boolean insertData(String Temperature, String username ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(USER_NAME, username);


        long result = db.insert(BLOOMER_TABLE,null, contentValues );
        if(result == -1){

            return false;
        }else {
            return true;
        }


        // close database


    }

    public Cursor ViewAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor result = db.rawQuery("select * from "+ BLOOMER_TABLE,null );


        // close cursor
        //close database

        return result;



    }




}
