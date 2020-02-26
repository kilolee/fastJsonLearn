package com.kilo.pojogeneric;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kilo on 2020/2/26.
 */
public class Main {
    public static void main(String[] args) {
        test_pojogeneric();
    }

    public static void test_pojogeneric() {
        List<Model> models = new ArrayList<Model>();
        Model model1 = new Model(1, "Tony");
        Model model2 = new Model(2, "Jack");
        models.add(model1);
        models.add(model2);

        String jsonString = JSON.toJSONString(models);
        System.out.println(jsonString);

        JSONArray jsonArray = JSON.parseArray(jsonString);
        //下面三个解析出来的效果一样
        List<Model> modelResult = JSON.parseArray(jsonString, Model.class);
        List<Model> modelResult2 = JSON.parseObject(jsonString, new TypeReference<List<Model>>() {
        });
        List<Model> modelResult3 = JSON.parseObject(jsonString, new TypeReference<List<Model>>() {
        }.getType());
    }

}
