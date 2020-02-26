package com.kilo.jsonfield;

import com.alibaba.fastjson.JSON;

/**
 * Created by kilo on 2020/2/26.
 */
public class Main {

    public static void main(String[] args) {
        test_alternaNames();
        test_jsonDirect();
        test_unwrapped();
    }


    public static void test_alternaNames(){
        String jsonVal0 = "{\"id\":5001,\"name\":\"Jobs\"}";
        String jsonVal1 = "{\"id\":5382,\"user\":\"Mary\"}";
        String jsonVal2 = "{\"id\":2341,\"person\":\"Bob\"}";

        Model obj0 = JSON.parseObject(jsonVal0, Model.class);


        Model obj1 = JSON.parseObject(jsonVal1, Model.class);


        Model obj2 = JSON.parseObject(jsonVal2, Model.class);

        Model model = new Model(1001,"Tom");
        String jsonModel = JSON.toJSONString(model);
        System.out.println(jsonModel);
    }


    public static void test_jsonDirect() {
        Model model = new Model();
        model.setId(1001);
        model.setValue("{'name':'Lucky',age:20,marry:null}");

        String jsonString = JSON.toJSONString(model);
        System.out.println(jsonString);
    }


    public static void test_unwrapped(){
        VO vo = new VO();
        vo.setId(123);
        vo.setLocaltion(new Localtion(127, 37));

        String jsonString = JSON.toJSONString(vo);
//        Assert.assertEquals("{\"id\":123,\"latitude\":37,\"longitude\":127}", text);

        VO vo2 = JSON.parseObject(jsonString, VO.class);
        System.out.println(vo2);
    }
}

