package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
  @Autowired
  private ConcreteDependance1 dependance1;
  @Autowired
  private ConcreteDependance2 dependance2;
}
