package edu.ualr.roomdatabase.db.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/**
 * Created by irconde on 2019-11-08.
 */

// TODO 08. Create a One-to-many relationship between users and books.
//  Several books can be borrowed by the same person

// TODO 08.01. Define the foreign key of the entity
@Entity(foreignKeys = @ForeignKey(entity = User.class, parentColumns = "uid", childColumns = "user_id"))
public class Book {
    @PrimaryKey
    @NonNull
    public String id;

    public String title;

    // TODO 08.02. Add a new field to the entity class that represents the foreign key
    @ColumnInfo(name = "user_id")
    public int userId;
}