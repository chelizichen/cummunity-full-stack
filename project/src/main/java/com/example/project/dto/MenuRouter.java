package com.example.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MenuRouter {
    public String name;
    public String id;
    public String path;
    public String component;
    public List<MenuRouter> children;

    public MenuRouter(String name, String id, String path, String component) {
        this.name = name;
        this.id = id;
        this.path = path;
        this.component = component;
    }
}
