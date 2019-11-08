package edu.ualr.roomdatabase.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

/**
 * Created by irconde on 2019-11-08.
 */
// TODO 27. We wrap the database with a viewmodel class
// Since we need to use context inside our viewmodel we should use AndroidViewModel,
// because it contains the application context (to retrieve the context call getApplication() ),
public class UserViewModel extends AndroidViewModel {
    // TODO 28. Define a member to store a reference to the database
    // TODO 29. Define a LiveData member used as observable field to automatically update the UI when
    // values returned from data queries are received

    // TODO 30. Instead of retrieving the list of users from the database, retrieve the LiveData
    //  object from the DAO and use it to subscribe to changes

    // TODO 31. Define the constructor of the viewmodel
    public UserViewModel(@NonNull Application application) {
        super(application);
    }
    // TODO 32. Define a method to setup the database

    // TODO 33. Populate the database with data. We'll reset the database to start from scratch every time we launch the app

    // TODO 34. Define a get method to allow the activity subscribe to changes in database

    // TODO 36. Define a method to delete a user from the database

    // TODO 38. Define a method to edit and update an user in the database

}
