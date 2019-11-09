package edu.ualr.roomdatabase.db.entity;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Created by irconde on 2019-11-08.
 */
// TODO 02. We create a new entity for storing information about users.
//  Each entity represents a table in the database
// Fields: id, name, lastName, age, picture
// TODO 03. We can set a different name for the table by setting the tableName property. Set the name as "users"
// TODO 10. We include in the user entity information about the address of the user by using a nested object
// TODO 10.01. Define a new POJO class that represents the composition of the several address field we want to include
// TODO 10.02. Include a field using the defined class as type of this field. We have to use the @Embedded annotation
@Entity(tableName = "users")
public class User {
    // TODO 04. Set the id field as the primary key of the entity.
    // TODO 05. Configure Room to automatically assign the id to the entity. The id type must be int
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int uid;

    // NOTE. We can make a field public or provide getter and setter methods
    private String name;

    // TODO 06. Set a specific column name for lastName field: last_name
    @ColumnInfo(name = "last_name")
    private String lastName;

    private int age;

    // TODO 07. Avoid persisting the picture field
    @Ignore
    private Bitmap picture;

    // TODO 10.02
    @Embedded
    private Address address;

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

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
