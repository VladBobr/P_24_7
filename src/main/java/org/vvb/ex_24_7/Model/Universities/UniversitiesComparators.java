package org.vvb.ex_24_7.Model.Universities;

public enum UniversitiesComparators {
    BY_NAME("BY_NAME");

    private String name;
    private UniversityComparator comparator;
    UniversitiesComparators(String name){
        this.name = name;
        switch(this.name) {
            case "BY_NAME":
                this.comparator = new UniversityNameComparator();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
    }

    public UniversityComparator getComparator() {
        return comparator;
    }
}
