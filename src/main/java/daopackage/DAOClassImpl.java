package main.java.daopackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Configurable
public class DAOClassImpl implements DAOClass {

	/*@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;*/
	
	@Override
	public String getData() {
		//Autowired not working
		//Autowiring was earlier not working because this object was initialised using new. Details on serviceClass
		/*
		String url = "jdbc:mysql://mysql:3306/sampledb";
		String username = "root";
		String password= "password"; 
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(new DriverManagerDataSource(url, username, password));
		*/
		String data="";
		String sqlQuery = "select name from employee where id = 1";
		Map<String, Object> paramMap = new HashMap<>();
		/*List<String> listData = namedParameterJdbcTemplate.query(sqlQuery, paramMap, new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				String data = rs.getString("name");
				return data;
			}
		});
		
		data = listData.get(0);*/
		
		return data;
	}

}
