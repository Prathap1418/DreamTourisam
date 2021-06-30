package tour.servlet.booking;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tour.models.Booking;
import tour.dao.BookingDao;




@WebServlet("/insertuserhallBook")
public class UserInsertBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookingDao BookingDao;
	
	public void init() {
		BookingDao = new BookingDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		String user = request.getParameter("user");
		String email = request.getParameter("email");
		String tourpack = request.getParameter("tourpack");
		String start = request.getParameter("start");
		int days = Integer.parseInt(request.getParameter("days"));
		String bookingdate = (request.getParameter("bookingdate"));
		String status = (request.getParameter("status"));
		int Amount = Integer.parseInt(request.getParameter("Amount"));

		
		Booking Booking = new Booking(  user, email, tourpack, start, days, bookingdate, status, Amount);
		try {
			BookingDao.insertRooms(Booking);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("listUserRoomBook");
	
	}

	

}