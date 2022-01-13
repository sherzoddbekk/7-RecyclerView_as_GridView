package com.example.a7_recyclerviewasgridviewjava.model;

public class Member {
    private  String firstname;
    private  String lastname;
    private boolean avialable;

    public Member(String firstname, String lastname, boolean avialable) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.avialable = avialable;
    }

    public Member() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isAvialable() {
        return avialable;
    }

    public void setAvialable(boolean avialable) {
        this.avialable = avialable;
    }
}
