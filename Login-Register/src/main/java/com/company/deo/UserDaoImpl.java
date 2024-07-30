package com.company.deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImpl implements UserDao{

	
	@Override
	public boolean addUser(User user) {
		 String query = "INSERT INTO input (username, password, email) VALUES (?, ?, ?)";   
		 
		 try (Connection connection = DBUtil.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	            preparedStatement.setString(1, user.getUsername());
	            preparedStatement.setString(2, user.getPassword());
	            preparedStatement.setString(3, user.getEmail());

	            int rowsAffected = preparedStatement.executeUpdate();
	            System.out.println("value entered");
	            return rowsAffected > 0;
		  } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	}
	@Override
	public boolean isValidUser(String username, String password) {
		 String query = "SELECT * FROM input WHERE username = ? AND password = ?";
    	 try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("query executed");
            return resultSet.next();
           
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
	}

	
}