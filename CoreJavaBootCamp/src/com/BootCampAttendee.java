package com;

public enum BootCampAttendee {

    STUDENT("student"), TRAINER("trainer"), ASSESSOR("assessor");

    private String name;

    BootCampAttendee(String name) {
        this.name = name;
    }
}
