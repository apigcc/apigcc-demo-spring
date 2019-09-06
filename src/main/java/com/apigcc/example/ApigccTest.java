package com.apigcc.example;

import com.apigcc.core.Apigcc;
import com.apigcc.core.Context;

import java.nio.file.Paths;

public class ApigccTest {

    public static void main(String[] args) {
        new ApigccTest().testApigcc();
    }

    public void testApigcc() {

        Context context = new Context();
        context.setId("apigcc");
        context.setName("示例接口文档");
        context.addSource(Paths.get("src", "main", "java"));
        context.addJar(Paths.get("src/main/resources/lib/apigcc-model-1.0-SNAPSHOT.jar"));
        context.setDescription("示例接口文档，使用默认模板");

        Apigcc apigcc = new Apigcc(context);
        apigcc.parse();
        apigcc.render();

        System.out.println("BUILD SUCCESS");
    }

}