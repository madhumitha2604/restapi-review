package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int giftid;
    private String giftname;
    private String price;
    private int rating;
    private String email;
    private String password;
    private String phonenumber;
    private String address;
    public int getId() {
        return giftid;
    }
    public void setId(int giftid) {
        this.giftid = giftid;
    }
    public String getGiftName() {
        return giftname;
    }
    public void setGiftName(String giftname) {
        this.giftname = giftname;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public User(int giftid, String giftname,String price,int rating, String email, String password,String phonenumber,String address) {
        this.giftid = giftid;
        this.giftname = giftname;
        this.price = price;
        this.rating=rating;
        this.email = email;
        this.password = password;
        this.phonenumber= phonenumber;
        this.address= address;

    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getAddress() {
        return password;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public User() {
    }

}
