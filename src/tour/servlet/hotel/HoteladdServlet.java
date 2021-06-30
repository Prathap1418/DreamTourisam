package tour.servlet.hotel;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tour.dao.HotelDao;
import tour.models.Hotel;
import tour.models.User;


@WebServlet("/insert-hotel")

public class HoteladdServlet extends HttpServlet {
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
		String name = request.getParameter("name");
		String roomtype = request.getParameter("roomtype");
		
		String facilities = request.getParameter("facilities");
		int cost = Integer.parseInt(request.getParameter("cost"));
		int beds = Integer.parseInt(request.getParameter("beds"));
	

		Hotel room = new Hotel(name, roomtype, facilities, beds, cost);
		try {
			HotelDao.insertRooms(room);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("list-hotels");

	}

	}

