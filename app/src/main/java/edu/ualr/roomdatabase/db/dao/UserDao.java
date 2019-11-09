package edu.ualr.roomdatabase.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import edu.ualr.roomdatabase.db.entity.UserBasicData;
import edu.ualr.roomdatabase.db.entity.User;

import static androidx.room.OnConflictStrategy.IGNORE;
import static androidx.room.OnConflictStrategy.REPLACE;

/**
 * Created by irconde on 2019-11-08.
 */
// TODO 11. We create a DAO interface to define the query operations over the user entity
@Dao
public interface UserDao {

    // TODO 12. Define an insert query to add a new user to the users database
    // TODO 13. Ignore insert queries when the object is already present in the database
    @Insert(onConflict = IGNORE)
    void insertUser(User user);

    // TODO 14. Insert a collection of users in the same transaction
    @Insert(onConflict = IGNORE)
    void insertUsers(User... users);

    // TODO 15. Use a POJO object to insert a partial entity. This can be applied to any type of query
    // TODO 15.01 Define a POJO class that represents the full name of a user: FullName
    // TODO 15.02 Create a new method and specify the target entity
    @Insert(entity = User.class)
    void updateUserAddress(UserBasicData fullName);

    // TODO 16. Define a delete query to delete a user from the users database
    @Delete
    void deleteUser(User user);

    // TODO 17. Define an update query to update a user from the users database
    // TODO 18. Replace the existing user with the new one provided
    @Update(onConflict = REPLACE)
    void updateUser(User user);

    // TODO 19. Simple query to get a list of all the users in the database
    // TODO 30. Instead of retrieving the list of users from the database, retrieve the LiveData
    //  object from the DAO and use it to subscribe to changes
    @Query("select * from users")
    LiveData<List<User>> loadAllUsers();

    @Query("DELETE FROM users")
    void deleteAll();

    // TODO 20. Query to get information about an specific user using value passed as parameter to the method
    @Query("select * from users where uid = :id")
    User loadUserById(int id);

    // TODO 21. Query to get user that match the provided name and last name passed as multiple parameters.
    @Query("select * from users where name = :firstName and last_name = :lastName")
    List<User> findUserByNameAndLastName(String firstName, String lastName);

    // TODO 22. Query to get all the names of the users stored in the database.
    //  We return subsets of the user entity columns by using a POJO class as the returning type of the method
    @Query("SELECT uid, name, last_name, age  FROM users")
    public List<UserBasicData> loadAllUsersFullName();

    // TODO 23. Query to get all the users that live in any of the provided cities. Passing a collection of arguments
    @Query("SELECT uid, name, last_name, age FROM users WHERE city IN (:cities)")
    public List<UserBasicData> loadUsersFromRegions(List<String> cities);

}
