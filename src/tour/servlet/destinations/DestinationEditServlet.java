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


@WebServlet("/edit-destination")
public class DestinationEditServlet extends HttpServlet {
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
		int id = Integer.parseInt(request.getParameter("id"));
		Destinations Destinations = DestinationDao.selectRoom(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewDestination.jsp");
		request.setAttribute("user", Destinations);
		dispatcher.forward(request, response);
		
	}

	

}