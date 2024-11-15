package com.example.testtask.model.enums;

public enum Status {
    PENDING("в ожидании"),
    IN_PROCESS("в процессе"),
    COMPLETED("завершено");

    private final String displayName;

    Status(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

