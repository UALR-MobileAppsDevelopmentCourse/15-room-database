package edu.ualr.roomdatabase.db.entity;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
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
@Entity(tableName = "users")
public class User {
    // TODO 04. Set the id field as the primary key of the entity.
    // TODO 05. Configure Room to automatically assign the id to the entity. The id type must be int
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int uid;

    // NOTE. We can make a field public or provide getter and setter methods
    public String name;

    // TODO 06. Set a specific column name for lastName field: last_name
    @ColumnInfo(name = "last_name")
    public String lastName;

    public int age;

    // TODO 07. Avoid persisting the picture field
    @Ignore
    public Bitmap picture;
}
