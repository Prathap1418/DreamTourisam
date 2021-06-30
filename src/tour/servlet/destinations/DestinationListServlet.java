package tour.servlet.destinations;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tour.dao.DestinationDao;
import tour.models.Destinations;


@WebServlet("/list-destination")
public class DestinationListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DestinationDao DestinationDao;

	public void init() {
		DestinationDao = new DestinationDao();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		List<Destinations> listRooms = DestinationDao.selectAllRooms();
		
		// System.out.print(listUser);
		request.setAttribute("listRooms", listRooms);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DestinationList.jsp");
		dispatcher.forward(request, response);
		
	}

	
}