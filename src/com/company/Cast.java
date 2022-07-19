package com.company;

public class Cast {
    private String fullName;
    private String role;

    @Override
    public String toString() {
        return "[fullName = " + fullName +
                ", role = " + role + "]";
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
