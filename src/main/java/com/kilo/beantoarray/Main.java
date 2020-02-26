package com.kilo.beantoarray;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Created by kilo on 2020/2/26.
 */
public class Main {
    public static void main(String[] args) {
        test_beanToArray();
    }

    public static void test_beanToArray() {
        Model model = new Model(1001, "gaotie");

        // {"id":1001, "name":"gaotie"}
        String text_normal = JSON.toJSONString(model);
        System.out.println(text_normal);
        // [1001,"gaotie"]
        String text_beanToArray = JSON.toJSONString(model, SerializerFeature.BeanToArray);

        // support beanToArray & normal mode
        Model model1 = JSON.parseObject(text_beanToArray, Model.class, Feature.SupportArrayToBean);
        System.out.println(model1);
    }
}
