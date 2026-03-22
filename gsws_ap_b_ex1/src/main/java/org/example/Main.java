package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot p1 = context.getBean("parrot1", Parrot.class);
//        System.out.println(p1.getName());
//
//        Parrot p2 = context.getBean("parrot2", Parrot.class);
//        System.out.println(p2.getName());

        Parrot p3 = context.getBean(Parrot.class);
        System.out.println(p3.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

        Parrot x = new Parrot();
        x.setName("Kiki");
        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        Parrot p = context.getBean("parrot1", Parrot.class);
        System.out.println(p.getName());
    }
}