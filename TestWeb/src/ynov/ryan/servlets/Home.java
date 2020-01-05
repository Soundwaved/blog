package ynov.ryan.servlets;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Home extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3213797324419322813L;
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String var = req.getParameter("name");
        System.out.println(var);
        req.setAttribute("var1", var+" modified");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Auteur1");
        list.add("Titre Article1");
        list.add("Auteur2");
        list.add("Titre Article2");
        req.setAttribute("tests",list);

   this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward(req, resp);
    }
    @Override 
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
       String test= req.getParameter("test");
       System.out.println(test);
       req.setAttribute("var1", test);
       this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward(req, resp);

}
}