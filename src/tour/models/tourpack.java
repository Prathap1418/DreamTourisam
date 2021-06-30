package tour.models;

public class tourpack {
	public int id;
	public String name;
	public String description;
	public String hotel;
	public String destination;
	public int cost;
	public int days;
	public String start;

	public tourpack(String name, String description, String destination, String hotel, int cost, int days, String start) {
		super();
		this.name = name;
		this.description = description;
		this.hotel = hotel;
		this.destination = destination;
		this.cost = cost;
		this.days = days;
		this.start = start;
	}

	public tourpack(int id, String name, String description, String destination, String hotel, int cost, int days, String start) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.hotel = hotel;
		this.destination = destination;
		this.cost = cost;
		this.days = days;
		this.start = start;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getDestinations() {
		return destination;
	}

	public void setDestinations(String destination) {
		this.destination = destination;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
