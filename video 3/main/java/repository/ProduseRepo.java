package repository;


import model.Produs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProduseRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insert(Produs p){
        String str="insert into produse values(null,?,?);";
        jdbcTemplate.update(str,p.getNume(),p.getPret());

    }

    public List<Produs> selectAll(){
        String s="Select * from produse";
        return jdbcTemplate.query(s, new RowMapper<Produs>() {
            @Override
            public Produs mapRow(ResultSet resultSet, int i) throws SQLException {
                var p=new Produs();
                p.setId(resultSet.getInt("id"));
                p.setPret(resultSet.getDouble("pret"));
                p.setNume(resultSet.getString("nume"));

                return p;
            }
        });
    }
}
