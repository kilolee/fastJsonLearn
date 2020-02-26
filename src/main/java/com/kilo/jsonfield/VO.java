package com.kilo.jsonfield;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by kilo on 2020/2/26.
 */
public class VO {
    private int id;

    @JSONField(unwrapped = true)
    private Localtion localtion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Localtion getLocaltion() {
        return localtion;
    }

    public void setLocaltion(Localtion localtion) {
        this.localtion = localtion;
    }
}
