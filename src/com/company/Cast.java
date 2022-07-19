package com.company;

public class Cast {
    private String fullName;
    private String role;

    @Override
    public String toString() {
        return "[fullName = " + fullName +
                ", role = " + role + "]";
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

}
