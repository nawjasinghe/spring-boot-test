package com.example;

import java.util.Objects;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private String techStack;

    public SoftwareEngineer(String techStack, String name, Integer id) {
        this.techStack = techStack;
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
