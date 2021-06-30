package tour.servlet.tourpack;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tour.dao.PackageDao;
import tour.models.Destinations;
import tour.models.tourpack;

@WebServlet("/update-tourpack")
public class PackageUpdateServlet extends HttpServlet {
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
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");

		
		String destination = request.getParameter("destination");
		String hotel = request.getParameter("hotel");
		int cost = Integer.parseInt(request.getParameter("cost"));
		int days = Integer.parseInt(request.getParameter("days"));

		String start = request.getParameter("start");
		tourpack tourpack = new tourpack(id,name, description,destination, hotel, cost,days,start);
		try {
			PackageDao.updateRooms(tourpack);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("list-tourpack");

	}

}