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


@WebServlet("/edit-hotel")
public class HotelEditServlet extends HttpServlet {
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
		Hotel room = HotelDao.selectRoom(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewHotel.jsp");
		request.setAttribute("user", room);
		dispatcher.forward(request, response);
		
	}

	

}