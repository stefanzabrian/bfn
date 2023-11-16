package com.restapp.bfn.model.constant;

public enum UserRole {
    CLIENT("Client"),
    OWNER("Owner");
    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
