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
import tour.models.Hotel;

public class HotelDao {

	// rooms
	private static final String INSERT_rooms_SQL = "INSERT INTO hotel"
			+ " ( name,roomtype,Facilities,NoBeds,CostPerDay) VALUES " + " ( ?,?, ?,?,?);";

	private static final String SELECT_rooms_BY_ID = "select id,name,roomtype,Facilities,CostPerDay,NoBeds from hotel where id =?";
	private static final String SELECT_ALL_erooms = "select * from hotel";
	private static final String DELETE_rooms_SQL = "delete from hotel where id = ?;";
	private static final String UPDATE_rooms_SQL = "update hotel set name = ?,  roomtype = ?,Facilities = ?,NoBeds = ?,CostPerDay = ?  where id = ?;";

	public HotelDao() {
	}

	DbConnection dbconnection = new DbConnection();

// insert Rooms
	public void insertRooms(Hotel room) throws SQLException {
		System.out.println(INSERT_rooms_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_rooms_SQL)) {
			preparedStatement.setString(1, room.getName());
			preparedStatement.setString(2, room.getRoomtype());

			preparedStatement.setString(3, room.getFacilities());
			preparedStatement.setInt(4, room.getCost());
			preparedStatement.setInt(5, room.getBeds());
	

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
	}

	// select Room
	public Hotel selectRoom(int id) {
		Hotel room = null;
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
				String roomtype = rs.getString("roomtype");

				String name = rs.getString("name");
				String facilities = rs.getString("Facilities");
				int cost = rs.getInt("CostPerDay");
				int beds = rs.getInt("NoBeds");
				room = new Hotel(id, name,roomtype, facilities, cost,beds);
			}

		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return room;
	}

	// select All Rooms
	public List<Hotel> selectAllRooms() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Hotel> rooms = new ArrayList<>();
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
				String roomtype = rs.getString("roomtype");
				int beds = rs.getInt("NoBeds");
				String facilities = rs.getString("Facilities");
				int cost = rs.getInt("CostPerDay");
				
				rooms.add(new Hotel(id, name,roomtype, facilities, cost,beds));
			}
		} catch (SQLException e) {
			dbconnection.printSQLException(e);
		}
		return rooms;
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
	public boolean updateRooms(Hotel room) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = dbconnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_rooms_SQL);) {
			statement.setString(1, room.getName());
			statement.setString(2, room.getRoomtype());
			statement.setString(3, room.getFacilities());
			statement.setInt(4, room.getBeds());
			statement.setInt(5, room.getCost());
			statement.setInt(6, room.getId());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

}