package com.taidev198.project138.data.repository.datasource.local.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context?):
SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION),
IDBHelper{

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        private const val TAG = "DBHelper"
        private const val DATABASE_NAME = "mainapp.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_FAVORITES = "favorites"
        private const val COLUMN_ID = "id"
        private const val COLUMN_CITY_NAME = "cityName"
        private const val COLUMN_COUNTRY_NAME = "countryName"
        private const val CREATE_TABLE_FAVORITES = """
            CREATE TABLE $TABLE_FAVORITES (
                $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_CITY_NAME TEXT,
                $COLUMN_COUNTRY_NAME TEXT
            )
             """
    }
}