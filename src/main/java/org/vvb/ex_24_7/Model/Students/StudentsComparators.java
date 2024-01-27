package org.vvb.ex_24_7.Model.Students;

import org.jetbrains.annotations.NotNull;

public enum StudentsComparators {
    BY_NAME("BY_NAME"),
    BY_EXAM("BY_EXAM");

    private String name;
    private StudentComparator comparator;
    StudentsComparators(String name){
        this.name = name;
        switch(this.name) {
            case "BY_NAME":
                this.comparator = new StudentNameComparator();
                break;
            case "BY_EXAM":
                this.comparator = new StudentExamComparator();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
    }

    public StudentComparator getComparator() {
        return comparator;
    }
}
