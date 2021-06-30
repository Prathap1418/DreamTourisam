package tour.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tour.dbconnection.DbConnection;
import tour.models.Destinations;

public class DestinationDao {

	// rooms
	private static final String INSERT_rooms_SQL = "INSERT INTO destination" + " (name,description,cost) VALUES "
			+ " ( ?,?, ?);";

	private static final String SELECT_rooms_BY_ID = "select id,name,description,cost from destination where id =?";
	private static final String SELECT_ALL_erooms = "select * from destination";
	private static final String DELETE_rooms_SQL = "delete from destination where id = ?;";
	private static final String UPDATE_rooms_SQL = "update destination set name = ?,  description = ?,cost = ?  where id = ?;";

	public DestinationDao() {
	}

	DbConnection dbconnection = new DbConnection();

// insert Rooms
	public void insertRooms(Destinations Destinations) throws SQLException {
		System.out.println(INSERT_rooms_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_rooms_SQL)) {
			preparedStatement.setString(1, Destinations.getName());
			preparedStatement.setString(2, Destinations.getDescription());
			preparedStatement.setInt(3, Destinations.getCost());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
	}

	// select Room
	public Destinations selectRoom(int id) {
		Destinations Destinations = null;
		// Step 1: Establishing a Connection
		try (Connection connection = dbconnection.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_rooms_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {

				String name = rs.getString("name");
				String description = rs.getString("description");
				int cost = rs.getInt("cost");

				Destinations = new Destinations(id, name, description, cost);
			}

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return Destinations;
	}

	// select All Rooms
	public List<Destinations> selectAllRooms() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Destinations> Destinations = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = dbconnection.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_erooms);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String description = rs.getString("description");

				int cost = rs.getInt("cost");

				Destinations.add(new Destinations(id, name, description, cost));
			}
		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return Destinations;
	}

	// Delete rooms
	public boolean deleteRoom(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_rooms_SQL);) {

			statement.setInt(1, id);
			System.out.println(statement);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	// Update Room
	public boolean updateRooms(Destinations Destinations) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_rooms_SQL);) {
			statement.setString(1, Destinations.getName());
			statement.setString(2, Destinations.getDescription());

			statement.setInt(3, Destinations.getCost());
			statement.setInt(4, Destinations.getId());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

}