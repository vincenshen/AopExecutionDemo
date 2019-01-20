package com.vmware.AopExecutionDemo.service;

import com.vmware.AopExecutionDemo.annotation.AdminOnlyMethod;
import com.vmware.AopExecutionDemo.log.Loggable;
import org.springframework.stereotype.Service;

@Service
public class ProductService  implements Loggable {

    public String getName(){
        System.out.println("execute get name");
        return "product service";
    }

    public void exDemo() throws IllegalAccessException{
        System.out.println("execute exception demo");
    }

    public int findById(int id){

        System.out.println("execute find by id");

        return 10;
    }

    public void findByTwoArgs(int id,String name){
        System.out.println("execute find by id and name");
    }

    @AdminOnlyMethod
    @Override
    public void log() {
        System.out.println("log from product service");
    }
}
