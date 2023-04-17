package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1{
    public ConcreteClass2(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2) {
        super(concreteDependance1, concreteDependance2);
    }
}