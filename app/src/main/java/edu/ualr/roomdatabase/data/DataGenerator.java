package edu.ualr.roomdatabase.data;

import java.util.ArrayList;
import java.util.List;

import edu.ualr.roomdatabase.db.entity.Address;
import edu.ualr.roomdatabase.db.entity.User;

/**
 * Created by irconde on 2019-11-08.
 */
public class DataGenerator {
    public static List<User> getUserDataset() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("Ivan");
        user1.setLastName("Rodriguez-Conde");
        user1.setAge(34);
        user1.setAddress(new Address("Xoan Manuel Pintos", "Galicia", "Ourense", 32004));
        users.add(user1);
        User user2 = new User();
        user2.setName("Elvira");
        user2.setLastName("Losada-Sanchez");
        user2.setAge(36);
        user2.setAddress(new Address("Xoan Manuel Pintos", "Galicia", "Ourense", 32004));
        users.add(user2);
        User user3 = new User();
        user3.setName("Pura");
        user3.setLastName("Conde-Gonzalez");
        user3.setAge(72);
        user3.setAddress(new Address("Puente Pelamios", "Galicia", "Ourense", 32002));
        users.add(user3);
        return users;
    }
}
