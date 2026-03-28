package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "koko";
    private Person person;
    @Autowired
    public Parrot(Person person){
        this.person = person;
    }




    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public  String toString(){
        return "Parrot: " + name;
    }
}
