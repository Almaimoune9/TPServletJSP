package projet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MonServlet
 */
@WebServlet("/MonServlet")
public class MonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Utilisateur utilisateur = new Utilisateur();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	List <Utilisateur> liste = new ArrayList();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String pseudo=request.getParameter("pseudo");
		String email=request.getParameter("email");
		String motdepass=request.getParameter("motdepass");
		
	     Utilisateur utilisateur1 = new Utilisateur(nom, prenom, pseudo, email, motdepass);
	     liste.add(utilisateur1);
	     request.setAttribute("liste", liste);
	      HttpSession session = request.getSession();
	     session.setAttribute("nom", nom);
	     request.getRequestDispatcher("Accueil.jsp").forward(request, response);
//	     response.sendRedirect("Accueil.jsp");
	    
		
		
	}
	

}
