package com.xys.model;

/**
 * Created by Administrator on 2018/1/10.
 */
public class User {
    private String name;
    private int id;
    private String address;

    public User() {
    }

    public User(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    /* 工厂方法 */
   /* public static User getInstance() {
        return null;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
