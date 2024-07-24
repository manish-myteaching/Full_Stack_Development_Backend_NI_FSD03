import jakarta.servlet.*;
import java.io.*;
import java.util.*;
public class WishServlet  extends GenericServlet
{  
  
  public void init(ServletConfig config) throws ServletException {
    System.out.println("WishServletServlet - Init method");
  }

   public  void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
      String uname=req.getParameter("uname");
      PrintWriter pw=res.getWriter();
      pw.println("<html>");
      pw.println("<marquee><h1>Welcome to FlipKart<h1></marquee>");
      Calendar calendar = Calendar.getInstance();
		int hours = calendar.get(calendar.HOUR_OF_DAY);
		if (hours < 12) {
			pw.println("<h1>Good Morning "+uname+"<h1>");
		} else if (hours > 12 && hours < 16) {
			pw.println("<h1>Good After Noon "+uname+"<h1>");
		} else if (hours > 16 && hours < 20) {
			pw.println("<h1>Good Evening "+uname+"<h1>");
		} else {
			pw.println("<h1>Good Night "+uname+"<h1>");
	}
       pw.println("</html>");
      pw.close();
   }

  public void distroy(){
      System.out.println("Destroy method");
   }
}