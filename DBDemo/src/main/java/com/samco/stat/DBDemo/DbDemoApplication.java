package com.samco.stat.DBDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO upicollect2 (ï»¿userId, amount, statusMessage, insertDate)\n"
		 		+ "VALUES (?, ?, ?,?);";
		 //String itr;
		 //List<String> str = jdbctemplate.query(sql, args, null);
		 
		 int result = jdbctemplate.update(sql, "123t52", "345", "success","04/01/2022");
         
	        if (result > 0) {
	            System.out.println("A new row has been inserted.");
	        	System.out.println("Checking for git....");
		}
		
	}

}
