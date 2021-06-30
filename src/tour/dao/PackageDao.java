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
import tour.models.tourpack;

public class PackageDao {

	// rooms
	private static final String INSERT_rooms_SQL = "INSERT INTO package"
			+ " ( name,description,destination,hotel,cost,days,start) VALUES " + " ( ?,?,?, ?,?,?,?);";

	private static final String SELECT_rooms_BY_ID = "select id, name,description,destination,hotel,cost,days,start from package where id =?";
	private static final String SELECT_ALL_erooms = "select * from package";
	private static final String DELETE_rooms_SQL = "delete from package where id = ?;";
	private static final String UPDATE_rooms_SQL = "update package set name = ?,description = ?,destination = ?, hotel = ?, cost = ?,days = ?,start = ?  where id = ?;";

	public PackageDao() {
	}

	DbConnection dbconnection = new DbConnection();

// insert Rooms
	public void insertRooms(tourpack tourpack) throws SQLException {
		System.out.println(INSERT_rooms_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_rooms_SQL)) {
			preparedStatement.setString(1, tourpack.getName());
			preparedStatement.setString(2, tourpack.getDescription());

			preparedStatement.setString(3, tourpack.getDestinations());
			preparedStatement.setString(4, tourpack.getHotel());
			preparedStatement.setInt(5, tourpack.getCost());
			preparedStatement.setInt(6, tourpack.getDays());
			preparedStatement.setString(7, tourpack.getStart());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
	}

	// select Room
	public tourpack selectRoom(int id) {
		tourpack tourpack = null;
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
				System.out.println("name ------------------"+name);
				String description = rs.getString("description");
				System.out.println("description ------------------"+description);
				String hotel = rs.getString("hotel");
				System.out.println("hotel ------------------"+hotel);
				String destinations = rs.getString("destination");
				System.out.println("destination ------------------"+destinations);
				int cost = rs.getInt("cost");
				System.out.println("cost ------------------"+cost);
				int days = rs.getInt("days");
				System.out.println("days ------------------"+days);
				String start = rs.getString("start");
				tourpack = new tourpack(id, name,description,destinations,hotel,cost,days,start);
			}

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return tourpack;
	}

	// select All Rooms
	public List<tourpack> selectAllRooms() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<tourpack> tourpack = new ArrayList<>();
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
				String hotel = rs.getString("hotel");
				String destinations = rs.getString("destination");
				int cost = rs.getInt("cost");
				int days = rs.getInt("days");
				String start = rs.getString("start");
				tourpack.add(new tourpack(id, name,description,destinations,hotel,cost,days,start));
			}
		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return tourpack;
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
	public boolean updateRooms(tourpack tourpack) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_rooms_SQL);
				
				
				) {
			statement.setString(1, tourpack.getName());
			System.out.println("name-------------"+tourpack.getName());
			statement.setString(2, tourpack.getDescription());
			System.out.println("getDescription-------------"+tourpack.getDescription());
			statement.setString(3, tourpack.getDestinations());
			System.out.println("getDestinations-------------"+tourpack.getDestinations());
			statement.setString(4, tourpack.getHotel());
			System.out.println("getHotel-------------"+tourpack.getHotel());
			statement.setInt(5, tourpack.getCost());
			System.out.println("getCost-------------"+tourpack.getCost());
			statement.setInt(6, tourpack.getDays());
			System.out.println("getDays-------------"+tourpack.getDays());
			statement.setString(7, tourpack.getStart());
			statement.setInt(8, tourpack.getId());
			System.out.println("getId-------------"+tourpack.getId());
			rowUpdated = statement.executeUpdate() > 0;
			
			System.out.println(rowUpdated);
		}
		return rowUpdated;
	}

}