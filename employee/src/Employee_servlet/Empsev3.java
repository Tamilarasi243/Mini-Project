package Employee_servlet;

import java.io.IOException;

@WebServlet(name="emp_agetwo",urlPatterns="/age_one")
public class Empsev3 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
		System.out.println("hai");
		RequestDispatcher dispatcher=req.getRequestDispatcher("/age.html");
		dispatcher.forward(req, resp);
		
	}

}
