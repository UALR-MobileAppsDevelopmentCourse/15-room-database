package edu.ualr.roomdatabase.db.entity;

import androidx.room.ColumnInfo;

/**
 * Created by irconde on 2019-11-08.
 */
public class Address {
    private String street;
    private String state;
    private String city;
    @ColumnInfo(name = "post_code")
    private int postCode;

    public Address(String street, String state, String city, int postCode) {
        this.street = street;
        this.state = state;
        this.city = city;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
}
