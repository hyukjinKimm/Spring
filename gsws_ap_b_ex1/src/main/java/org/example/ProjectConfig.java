package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

//    @Bean
//    Parrot parrot1() {
//        var p = new Parrot();
//        p.setName("koko");
//        return p;
//    }
//    @Bean
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//    @Bean(name="riki")
//    Parrot parrot3() {
//        var p = new Parrot();
//        p.setName("Riki");
//        return p;
//    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
