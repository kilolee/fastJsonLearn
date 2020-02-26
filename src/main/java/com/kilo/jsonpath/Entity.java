package com.kilo.jsonpath;

/**
 * Created by kilo on 2020/2/26.
 */
public class Entity {
    private Integer id;
    private String name;
    private Object value;

    public Entity() {
    }

    public Entity(String name) {
        this.name = name;
    }

    public Entity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Entity(Integer id, Object value) {
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
