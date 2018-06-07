package sn.objis.gestionStock.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public enum roles{
		admin,
		user,
		manager
		
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperation des valeurs saisies
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		RequestDispatcher rd;
		
		try {
			//Transmission des valeurs au serveur pour pour l'authentification
			request.login(login, password);
			//Redirection vers l'espace de travail des utilisateurs
			if (request.isUserInRole(roles.admin.toString())) {
				rd = request.getRequestDispatcher("admin/admin.jsp");
				rd.forward(request, response);
				
				
			}else if(request.isUserInRole(roles.manager.toString())) {
				rd = request.getRequestDispatcher("manager/manager.jsp");
				rd.forward(request, response);
			} else {
				rd = request.getRequestDispatcher("user/formulaire.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur d'authentification !!");
			rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}
	

}
