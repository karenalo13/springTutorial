package Repositories;

import models.Produs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(Produs p){
        String s="Insert into produse values(null,?,?);";
        jdbcTemplate.update(s,p.getNume(),p.getPret());
    }

}
