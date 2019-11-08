package edu.ualr.roomdatabase.db.dao;

/**
 * Created by irconde on 2019-11-08.
 */
// TODO 11. We create a DAO interface to define the query operations over the user entity
public interface UserDao {

    // TODO 12. Define an insert query to add a new user to the users database
    // TODO 13. Ignore insert queries when the object is already present in the database

    // TODO 14. Insert a collection of users in the same transaction

    // TODO 15. Use a POJO object to insert a partial entity. This can be applied to any type of query
    // TODO 15.01 Define a POJO class that represents the full name of a user: FullName
    // TODO 15.02 Create a new method and specify the target entity

    // TODO 16. Define a delete query to delete a user from the users database

    // TODO 17. Define an update query to update a user from the users database
    // TODO 18. Replace the existing user with the new one provided

    // TODO 19. Simple query to get a list of all the users in the database
    // TODO 30. Instead of retrieving the list of users from the database, retrieve the LiveData
    //  object from the DAO and use it to subscribe to changes

    // TODO 20. Query to get information about an specific user using value passed as parameter to the method

    // TODO 21. Query to get user that match the provided name and last name passed as multiple parameters.

    // TODO 22. Query to get all the names of the users stored in the database.
    //  We return subsets of the user entity columns by using a POJO class as the returning type of the method: UserBasicData

    // TODO 23. Query to get all the users that live in any of the provided cities. Passing a collection of arguments

}
