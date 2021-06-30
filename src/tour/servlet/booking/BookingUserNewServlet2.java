package tour.servlet.booking;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tour.dao.PackageDao;
import tour.dao.BookingDao;
import tour.models.Booking;
import tour.models.tourpack;

@WebServlet("/new-userbooking")
public class BookingUserNewServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookingDao BookingDao;
	private tour.dao.PackageDao PackageDao;
	public void init() {
		BookingDao = new BookingDao();
		PackageDao = new PackageDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		Cookie c1[] = request.getCookies();

		System.out.println("Cookies get for Room Booking ");
		System.out.println(c1[0].getValue());
		String loginuser = c1[0].getValue();
		System.out.println("Request");
		int id = Integer.parseInt(request.getParameter("id"));
		tourpack tourpack1 = PackageDao.selectRoom(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewUserbook.jsp");
		request.setAttribute("pack", tourpack1);
		request.setAttribute("user", loginuser);
		dispatcher.forward(request, response);
	}

}