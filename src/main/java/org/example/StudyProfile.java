package org.example;

public enum StudyProfile {
    MEDECINE("Медецина"),
    INGENER("Инженер");

    private String name;
    StudyProfile(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
