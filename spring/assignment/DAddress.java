package com.assignment;

public class DAddress {
    private int id;
    private String address;

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
        return "DAddress [id=" + id + ", address=" + address + "]";
    }
}
