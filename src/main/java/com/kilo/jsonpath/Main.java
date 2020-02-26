package com.kilo.jsonpath;

import com.alibaba.fastjson.JSONPath;

/**
 * Created by kilo on 2020/2/26.
 */
public class Main {

    public static void main(String[] args) {

    }

    public static void test_jsonPath(){
        Entity entity = new Entity(123, new Object());

//        Assert.assertSame(entity.getValue(), JSONPath.eval(entity, "$.value"));
//        Assert.assertTrue(JSONPath.contains(entity, "$.value"));
//        Assert.assertTrue(JSONPath.containsValue(entity, "$.id", 123));
//        Assert.assertTrue(JSONPath.containsValue(entity, "$.value", entity.getValue()));
//        Assert.assertEquals(2, JSONPath.size(entity, "$"));
//        Assert.assertEquals(0, JSONPath.size(new Object[], "$"));
    }
}
