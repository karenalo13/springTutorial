package main;

import ProjectConfig.ProjectConfig;
import model.Produs;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.ProduseRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(var context=new AnnotationConfigApplicationContext(ProjectConfig.class)){
            var prodrepo=context.getBean(ProduseRepo.class);
            var p=new Produs();
            p.setNume("cartof");
            p.setPret(1.5);
            prodrepo.insert(p);
            List<Produs> produse=prodrepo.selectAll();
            produse.forEach(System.out::println);
        }
    }
}
