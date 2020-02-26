package com.kilo.jsonfield;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by kilo on 2020/2/26.
 */
public class Model {
    private int id;

    //反序列化中匹配多个别名
    @JSONField(alternateNames = {"user", "person"})
    private String name;

    //序列化时直接输出json字符串
    //注意：值为null的 key:value 不会输出
    @JSONField(jsonDirect = true)
    private String value;

    public Model() {
    }

    public Model(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
