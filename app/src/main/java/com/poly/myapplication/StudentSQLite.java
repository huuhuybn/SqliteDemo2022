package com.poly.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class StudentSQLite extends SQLiteOpenHelper {

    public Context context;

    public StudentSQLite(@Nullable Context context) {
        super(context, "std.db", null, 1);
        this.context = context;
    }

    //    int id;
//    String name;
//    String numberPhone;
//    Date birthday;
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String table = "CREATE TABLE " +
                "students(id integer primary key,name text,numberPhone text,birthday date)";
        sqLiteDatabase.execSQL(table);
    }

    public void insert(Student student) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", student.id);
        contentValues.put("name", student.name);
        contentValues.put("numberPhone", student.numberPhone);
        contentValues.put("birthday", student.birthday.toString());

        long ketqua = sqLiteDatabase.insert("students", null, contentValues);

        if (ketqua > 0) {
            Toast.makeText(context, "THANH CONG", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "KHONG THANH CONG", Toast.LENGTH_SHORT).show();
        }

    }

    public void update() {

    }

    public void delete() {

    }

    public void getList() {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
