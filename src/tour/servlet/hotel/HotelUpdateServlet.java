package tour.servlet.hotel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tour.dao.HotelDao;
import tour.models.Hotel;

@WebServlet("/update-hotel")
public class HotelUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HotelDao HotelDao;

	public void init() {
		HotelDao = new HotelDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String roomtype = request.getParameter("roomtype");

		String facilities = request.getParameter("facilities");
		int beds = Integer.parseInt(request.getParameter("beds"));
		int cost = Integer.parseInt(request.getParameter("cost"));

		Hotel room = new Hotel(id,name, roomtype, facilities, beds, cost);
		try {
			HotelDao.updateRooms(room);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("list-hotels");

	}

}