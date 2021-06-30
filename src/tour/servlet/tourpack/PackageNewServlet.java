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
import tour.dao.HotelDao;
import tour.dao.DestinationDao;
import tour.models.Hotel;



@WebServlet("/new-tourpack")
public class PackageNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DestinationDao DestinationDao;
	private tour.dao.HotelDao HotelDao;
	public void init() {
		DestinationDao = new DestinationDao();
		HotelDao = new HotelDao();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
	
		List<Hotel> listRooms = HotelDao.selectAllRooms();
		
		// System.out.print(listUser);
		request.setAttribute("listRooms", listRooms);
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewPackage.jsp");
		dispatcher.forward(request, response);
	}

	
}