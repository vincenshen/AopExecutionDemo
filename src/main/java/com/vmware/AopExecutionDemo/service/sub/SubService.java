package com.vmware.AopExecutionDemo.service.sub;


import com.vmware.AopExecutionDemo.annotation.AdminOnlyClass;
import com.vmware.AopExecutionDemo.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * Created by cat on 2017-02-19.
 */

@AdminOnlyClass
@Component
public class SubService extends ProductService {

    public void demo(){
        System.out.println("execute sub service method");
    }
}
