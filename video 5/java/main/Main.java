package main;

import ProjectConfi.ProjectConfig;
import ServicesProduct.ServiceProduct;
import models.Produs;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try(var context=new AnnotationConfigApplicationContext(ProjectConfig.class)){
            var service=context.getBean(ServiceProduct.class);

            var p =new Produs();
            p.setNume("Inghetata");
            p.setPret(3);
            service.addOneProduct(p);
            p.setNume("raft");
            p.setPret(30);
            service.addOneProductWithException(p);
        }
    }
}
