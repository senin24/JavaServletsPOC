package model;

public enum Role {

    USER ("user"),
    MANAGER ("manager"),
    ADMIN ("admin");

    private String role;

    Role (String role) {
        this.role = role;
    }

    public String getRole () {
        return role;
    }

    }
