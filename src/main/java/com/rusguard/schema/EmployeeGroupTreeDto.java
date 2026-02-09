package com.rusguard.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeGroupTreeDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("icon")
    private String icon = "bi bi-folder";
    @JsonProperty("children")
    private List<EmployeeGroupTreeDto> children;
    // другие поля, если нужны
    // Конструкторы, геттеры, сеттеры
    public EmployeeGroupTreeDto() {
        this.children = new ArrayList<>();
    }
    public EmployeeGroupTreeDto(String id, String name) {
        this.id = id;
        this.name = name;
    }
    // Геттеры и сеттеры
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<EmployeeGroupTreeDto> getChildren() { return children; }
    public void setChildren(List<EmployeeGroupTreeDto> children) { this.children = children; }

    public void addChild(EmployeeGroupTreeDto child) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(child);
    }
}