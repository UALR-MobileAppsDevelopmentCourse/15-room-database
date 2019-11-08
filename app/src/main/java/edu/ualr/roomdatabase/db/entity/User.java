package edu.ualr.roomdatabase.db.entity;

/**
 * Created by irconde on 2019-11-08.
 */
// TODO 02. We create a new entity for storing information about users.
//  Each entity represents a table in the database
// Fields: id, name, lastName, age, picture
// TODO 03. We can set a different name for the table by setting the tableName property. Set the name as "users"
// TODO 10. We include in the user entity information about the address of the user by using a nested object
// TODO 10.01. Define a new POJO class that represents the composition of the several address fields we want to include: street, state, city, postCode(post_code)
// TODO 10.02. Include a field using the defined class as type of this field. We have to use the @Embedded annotation
public class User {
    // TODO 04. Set the id field as the primary key of the entity.
    // TODO 05. Configure Room to automatically assign the id to the entity. The id type must be int

    // NOTE. We can make a field public or provide getter and setter methods

    // TODO 06. Set a specific column name for lastName field: last_name

    // TODO 07. Avoid persisting the picture field

    // TODO 10.02. Include a field using the defined class as type of this field. We have to use the @Embedded annotation

}
