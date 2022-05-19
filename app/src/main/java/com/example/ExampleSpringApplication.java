package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication
@ComponentScan(nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)   // 別パッケージ同一クラス名のクラスがインジェクション対象になっている場合は完全修飾名の指定が必要
public class ExampleSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleSpringApplication.class, args);
    }

}
