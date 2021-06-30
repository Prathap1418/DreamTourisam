package tour.servlet.tourpack;



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

import tour.dao.PackageDao;
import tour.models.tourpack;
import tour.models.User;


@WebServlet("/insert-pack")

public class PackageAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PackageDao PackageDao;

	public void init() {
		PackageDao = new PackageDao();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String destination = request.getParameter("destination");
		String hotel = request.getParameter("hotel");
		int cost = Integer.parseInt(request.getParameter("cost"));
		int days = Integer.parseInt(request.getParameter("days"));
		String start = request.getParameter("start");

		tourpack tourpack = new tourpack(name, description,destination, hotel, cost,days,start);
		try {
			PackageDao.insertRooms(tourpack);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("list-tourpack");

	}

	}

