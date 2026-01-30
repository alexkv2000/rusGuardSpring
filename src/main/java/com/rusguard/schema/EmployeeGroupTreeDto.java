package com.rusguard.schema;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGroupTreeDto {
    private String id;
    private String name;
    private List<EmployeeGroupTreeDto> children;
    // другие поля, если нужны

    // Конструкторы, геттеры, сеттеры
    public EmployeeGroupTreeDto() {
        this.children = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<EmployeeGroupTreeDto> getChildren() { return children; }
    public void setChildren(List<EmployeeGroupTreeDto> children) { this.children = children; }

    public void addChild(EmployeeGroupTreeDto child) {
        this.children.add(child);
    }
}