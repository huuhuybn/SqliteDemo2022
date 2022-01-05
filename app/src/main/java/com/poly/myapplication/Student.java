package com.poly.myapplication;

import java.util.Date;

public class Student {
    int id;
    String name;
    String numberPhone;
    Date birthday;

    public Student(int id, String name, String numberPhone, Date birthday) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.birthday = birthday;
    }
}
