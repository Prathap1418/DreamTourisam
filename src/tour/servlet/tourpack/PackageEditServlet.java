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
import tour.models.tourpack;


@WebServlet("/edit-tourpack")
public class PackageEditServlet extends HttpServlet {
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
		tourpack tourpack1 = PackageDao.selectRoom(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewPackage.jsp");
		request.setAttribute("user", tourpack1);
		dispatcher.forward(request, response);
		
	}


}