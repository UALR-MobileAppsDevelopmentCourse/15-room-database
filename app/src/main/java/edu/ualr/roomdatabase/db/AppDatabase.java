package edu.ualr.roomdatabase.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import edu.ualr.roomdatabase.db.dao.UserDao;
import edu.ualr.roomdatabase.db.entity.Book;
import edu.ualr.roomdatabase.db.entity.User;

/**
 * Created by irconde on 2019-11-08.
 */
// TODO 24. Create an abstract class that represents the database. Firstly it will include Book and User entities
@Database(entities = {User.class, Book.class }, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    // TODO 25. Provide one get method for each defined DAO
    abstract public UserDao getUserDao();

    // TODO 26. We'll use a singleton pattern to provide only reference of the database for the whole application
    // TODO 26.01 Define a static member to store the reference to the db
    private static AppDatabase instance;

    // TODO 26.02. Define the method to get the database instance
    public static AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "appDatabase").build();
        }
        return instance;
    }

    public static void destroyInstance() {
        instance = null;
    }

}
