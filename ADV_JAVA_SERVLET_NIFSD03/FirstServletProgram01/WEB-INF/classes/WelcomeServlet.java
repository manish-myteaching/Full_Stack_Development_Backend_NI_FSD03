import jakarta.servlet.*;
import java.io.*;

public class WelcomeServlet implements Servlet{

public void init(ServletConfig config){  
 System.out.println("servlet is initialized");  
}  
  
public void service(ServletRequest req,ServletResponse res)  throws IOException,ServletException{  
 System.out.println("############service method###############");  
res.setContentType("text/html");   
PrintWriter out=res.getWriter();  
out.print("<html><body>");  
out.print("<h1>Welcome To Servlet Programming...!</h1>");  
out.print("</body></html>");  
}
  
public void destroy(){System.out.println("servlet is destroyed");}  
public ServletConfig getServletConfig( ){return null;}  
public String getServletInfo(){return "";}  
}