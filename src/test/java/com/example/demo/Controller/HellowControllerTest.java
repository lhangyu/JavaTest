package com.example.demo.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HellowControllerTest {

    public HellowController hellowController=new HellowController();
    @Test
    public void  test(){

        int test = hellowController.test(1, 2);
        System.out.println(test);
    }


}