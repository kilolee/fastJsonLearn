package com.kilo.normal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Created by kilo on 2020/2/26.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        test_normalUse();
        test_DateFormat();
        test_serializerFeature();
        test_toJsonBytes();
        test_jsonWriteArray();
        test_jsonWriteObject();
        test_jsonReadArray();
        test_jsonReadObject();
    }

    public static void test_normalUse() {
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.addUser(guestUser);
        group.addUser(rootUser);

        String jsonString = JSON.toJSONString(group);
        System.out.println(jsonString);

        Group group2 = JSON.parseObject(jsonString, Group.class);
        System.out.println(group2);
    }

    public static void test_DateFormat() {
        Country country = new Country();
        country.setName("China");
        country.setDate(new Date());
        String jsonString = JSON.toJSONStringWithDateFormat(country, "yyyY-MM-dd HH:mm:ss");
        System.out.println(jsonString);
        Country country1 = JSON.parseObject(jsonString, Country.class);
        System.out.println(country1);
    }

    public static void test_serializerFeature() {
        Model model = new Model();
        String jsonString = JSON.toJSONString(model, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty);
        System.out.println(jsonString);
    }

    public static void test_toJsonBytes() {
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.addUser(guestUser);
        group.addUser(rootUser);

        byte[] bytes = JSON.toJSONBytes(group);
        System.out.println(bytes.toString());
    }

    public static void test_jsonWriteArray() throws IOException {
        JSONWriter writer = new JSONWriter(new FileWriter("D:/huge_jsonArray.json"));
        writer.startArray();
        for (int i = 0; i < 100; i++) {
            writer.writeValue(new User((long) i, "Tony"));
        }
        writer.endArray();
        writer.close();
    }

    public static void test_jsonWriteObject() throws IOException {
        JSONWriter writer = new JSONWriter(new FileWriter("D:/huge_jsonObject.json"));
        writer.startObject();
        for (int i = 0; i < 100; i++) {
            writer.writeKey("x" + i);
            writer.writeValue(new User((long) i, "Tony"));
        }
        writer.endObject();
        writer.close();
    }

    public static void test_jsonReadArray() throws FileNotFoundException {
        JSONReader reader = new JSONReader(new FileReader("D:/huge_jsonArray.json"));
        reader.startArray();
        while (reader.hasNext()) {
            User user = reader.readObject(User.class);
            System.out.println(user);
        }
        reader.endArray();
        reader.close();
    }

    public static void test_jsonReadObject() throws FileNotFoundException {
        JSONReader reader = new JSONReader(new FileReader("D:/huge_jsonObject.json"));
        reader.startObject();
        while (reader.hasNext()) {
            String key = reader.readString();
            User user = reader.readObject(User.class);
            System.out.println(key);
            System.out.println(user);
        }
        reader.endObject();
        reader.close();
    }
}
