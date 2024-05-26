package com.propertyManagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.propertyManagement.bean.property;

public class propertyDao {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/propertymanagement?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "0718657228Ac@";

	
	private static final String INSERT_PROPERTY_SQL = "INSERT INTO add_property" +
		    " (category, type, province, address, noofBedrooms, noofBathrooms, floorArea, sizeofLand, price, features, details, name, email, contactNo) VALUES" +
		    " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_PROPERTY_BY_ID = "SELECT id, category, type, province, address, noofBedrooms, noofBathrooms, floorArea, sizeofLand, price, features, details, name, email, contactNo FROM add_property WHERE id = ?;";

	private static final String SELECT_ALL_PROPERTY = "select * from add_property";
	
	private static final String DELETE_PROPERTY_SQL = "delete from add_property where id = ?;";
	
	private static final String UPDATE_PROPERTY_SQL = "update add_property set category = ?, type = ?, province = ?, address = ?, noofBedrooms = ?, noofBathrooms = ?,floorArea = ?, sizeofLand = ? , price = ? , features = ? , details = ? , name = ?, email = ? , contactNo = ? where id = ?;";
	
	public propertyDao() {
	}
	

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void insertProperty(property property) throws SQLException {
		System.out.println(INSERT_PROPERTY_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PROPERTY_SQL)) {
			preparedStatement.setString(1, property.getCategory());
			preparedStatement.setString(2, property.getType());
			preparedStatement.setString(3, property.getProvince());
			preparedStatement.setString(4, property.getAddress());
			preparedStatement.setString(5, property.getNoofBedrooms());
			preparedStatement.setString(6, property.getNoofBathrooms());
			preparedStatement.setString(7, property.getFloorArea());
			preparedStatement.setString(8, property.getSizeofLand());
			preparedStatement.setString(9, property.getPrice());
			preparedStatement.setString(10, property.getFeatures());
			preparedStatement.setString(11, property.getDetails());
			preparedStatement.setString(12, property.getName());
			preparedStatement.setString(13, property.getEmail());
			preparedStatement.setString(14, property.getContactNo());

			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public property selectProperty(int id) {
		property property = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PROPERTY_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String category = rs.getString("category");
				String type = rs.getString("type");
				String province = rs.getString("province");
				
				String address = rs.getString("address");
				String noofBedrooms = rs.getString("noofBedrooms");
				String noofBathrooms = rs.getString("noofBathrooms");
				
				String floorArea = rs.getString("floorArea");
				String sizeofLand = rs.getString("sizeofLand");
				String price = rs.getString("price");
				
				String features = rs.getString("features");
				String details = rs.getString("details");
				String name = rs.getString("name");
				
				String email = rs.getString("email");
				String contactNo = rs.getString("contactNo");

				property = new property(id, category, type, province, address, noofBedrooms, noofBathrooms, floorArea, sizeofLand, price, features, details, name, email, contactNo);

			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return property;
	}

	public List<property> selectAllProperties() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<property> properties = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PROPERTY);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String category = rs.getString("category");
				String type = rs.getString("type");
				
				String province = rs.getString("province");
				String address = rs.getString("address");
				String noofBedrooms = rs.getString("noofBedrooms");
				
				String noofBathrooms = rs.getString("noofBathrooms");
				String floorArea = rs.getString("floorArea");
				String sizeofLand = rs.getString("sizeofLand");
				
				String price = rs.getString("price");
				String features = rs.getString("features");
				String details = rs.getString("details");
				
				String name = rs.getString("name");
				String email = rs.getString("email");
				String contactNo = rs.getString("contactNo");

				properties.add(new property(id, category, type, province, address, noofBedrooms, noofBathrooms, floorArea, sizeofLand, price, features, details, name, email, contactNo));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return properties;
	}

	public boolean deleteProperty(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement( DELETE_PROPERTY_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	public boolean updateProperty(property property) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_PROPERTY_SQL);) {
			System.out.println("updated property:"+statement);
			
			statement.setString(1, property.getCategory());
			statement.setString(2, property.getType());
			statement.setString(3, property.getProvince());
			statement.setString(4, property.getAddress());
			statement.setString(5, property.getNoofBedrooms());
			statement.setString(6, property.getNoofBathrooms());
			statement.setString(7, property.getFloorArea());
			statement.setString(8, property.getSizeofLand());
			statement.setString(9, property.getPrice());
			statement.setString(10, property.getFeatures());
			statement.setString(11, property.getDetails());
			statement.setString(12, property.getName());
			statement.setString(13, property.getEmail());
			statement.setString(14, property.getContactNo());
			statement.setInt(15, property.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}


	
	
	

}
