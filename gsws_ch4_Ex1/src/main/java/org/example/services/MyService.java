package org.example.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class MyService {

    public MyService() {
        System.out.println("MyService instance created!");
    }

}
