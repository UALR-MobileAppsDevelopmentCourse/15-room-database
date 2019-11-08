package edu.ualr.roomdatabase.db.entity;

import androidx.room.ColumnInfo;

/**
 * Created by irconde on 2019-11-08.
 */
public class UserBasicData {
    private int uid;
    private String name;
    @ColumnInfo(name = "last_name")
    private  String lastName;
    private int age;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
