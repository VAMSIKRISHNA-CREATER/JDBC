package com.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import com.mysql.cj.jdbc.Driver;
import com.jdbc.dto.Person;


public class PersonDao{
	Scanner scan=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/demo";
	String user="root";
	String password="root";


	public void register() {
		try {
			DriverManager.registerDriver(new Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// create a table
	public void createPersonTable() {
		try {
			register();
			Connection connection=DriverManager.getConnection(url,user,password);
			Statement statement=connection.createStatement();
			statement.execute("Create table person(id int primary key, name varchar(45),age int,email varchar(45),password varchar(45))");
			connection.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// insert data into table
	public int insertData(Person person) {
		try {
			register();
			Connection connection=DriverManager.getConnection(url,user,password);
			PreparedStatement preparedStatement= connection.prepareStatement("insert into person values(?,?,?,?,?)");
			preparedStatement.setInt(1,person.getId() );
			preparedStatement.setString(2, person.getName());
			preparedStatement.setInt(3,person.getAge() );
			preparedStatement.setString(4,person.getEmail() );
			preparedStatement.setString(5,person.getPassword() );
			int res=preparedStatement.executeUpdate();
			connection.close();
			return res;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0; 
	}
	// update data into table
	public int updateData(Person person) {
		try {
			register();
			Connection connection=DriverManager.getConnection(url,user,password);
			PreparedStatement preparedStatement =connection.prepareStatement("update person set name=? where id=?");
			preparedStatement.setString(1,person.getName());
			preparedStatement .setInt(2, person.getId());
			int i=preparedStatement.executeUpdate();
			connection.close();
			return i;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}
	// get the data from person table
	public ArrayList<Person> getPersonData(Person person) {
		ArrayList<Person> al =new ArrayList<Person>();
		register();
		try {
			Connection connection =DriverManager .getConnection(url,user,password);
			PreparedStatement preparedStatement  = connection .prepareStatement("select * from person");
			ResultSet resultSet =preparedStatement.executeQuery();
			while(resultSet.next()) {
				person.setId(resultSet.getInt("id"));
				person.setName(resultSet.getString("name"));
				person.setAge(resultSet.getInt("age"));
				person.setEmail(resultSet.getString("email"));
				person.setPassword(resultSet.getString("password"));
				al.add(person);
			}
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return al;
	}
	// delete the data from person table
	public void deleteDataFromPerson(Person person) {
		register();
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			PreparedStatement preparedStatement  = connection.prepareStatement("delete from person where id=?");
			preparedStatement.setInt(1,person.getId());
			preparedStatement.execute();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// login using password and email
	public Person login(String email,String password1) {
		Person person=new Person();
		register();
			try {
				Connection connection=DriverManager.getConnection(url,user,password);
				PreparedStatement preparedStatement=connection.prepareStatement("select * from person where email=? and password=?");
					preparedStatement.setString(1,email);
					preparedStatement.setString(2,password1);
					ResultSet resultSet =preparedStatement.executeQuery();
					while(resultSet.next()) {
						person.setName(resultSet.getString("name"));
					}
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return person;
		
	}


}
