package com.example.testtask.model.enums;

public enum Priority {
    HIGH("высокий"),
    MEDIUM("средний"),
    LOW("низкий");

    private final String displayName;

    Priority(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
