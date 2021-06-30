package tour.models;

public class Hotel {
	public int id;
	public String roomtype;
	public String name;
	public String facilities;
	public int cost;
	public int beds;

	public Hotel(int id, String name, String roomtype, String facilities, int cost, int beds) {
		super();
		this.id = id;
		this.name = name;
		this.roomtype = roomtype;

		this.facilities = facilities;
		this.cost = cost;
		this.beds = beds;
	}

	public Hotel(String name, String roomtype, String facilities, int cost, int beds) {
		super();
		this.name = name;
		this.roomtype = roomtype;

		this.facilities = facilities;
		this.cost = cost;
		this.beds = beds;
	}

	public int getBeds() {
		return beds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
