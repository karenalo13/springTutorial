package com.example.video10.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.video10.clase.Person;
import com.example.video10.clase.SimplePerson;
@Repository
public class RepoPerson {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Person> getAll() {
	
		
		String select="Select * from persoana;";
		return jdbcTemplate.query(select, new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                var p=new Person();
                p.setId(resultSet.getInt("id"));
                p.setSalariu(resultSet.getDouble("salariu"));
                p.setNume(resultSet.getString("nume"));

                return p;
            }

			
        });
	}


	public void addOne(Person p) {
		String insert="insert into persoana values (null,?,?)";
		jdbcTemplate.update(insert,p.getNume(),p.getSalariu());
		
	}


	public void updateOne(int id, SimplePerson p) {
		String update="UPDATE persoana " + 
				"SET nume = ?, salariu= ? " + 
				"WHERE id = ?;";
		jdbcTemplate.update(update,p.getNume(),p.getSalariu(),id);
		
	}


	public void deleteOne(int id) {
		String delete="DELETE FROM persoana WHERE id = ? ;";
		jdbcTemplate.update(delete,id);
		
	}

}
