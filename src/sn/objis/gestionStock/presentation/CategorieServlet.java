package sn.objis.gestionStock.presentation;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestionStock.domain.Categorie;
import sn.objis.gestionStock.service.IServiceCategorieImpl;

/**
 * Servlet implementation class CategorieServlet
 */
@WebServlet("/categorie")
public class CategorieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategorieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("admin/categorie.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//REcuperation des donnees saisies
		String libelleRecup = request.getParameter("categorie");
		//Etablissement de la connexion
		Connection con = (Connection) getServletContext().getAttribute("connexion");
		IServiceCategorieImpl service = new IServiceCategorieImpl(con);
		
		Categorie cat = new Categorie(libelleRecup);
		service.add(cat);
		
		//Ajout des donnees dans un scope
		request.setAttribute("categorie", service.getAll());
		//Redirection vers la page creation catégorie
		RequestDispatcher rd = request.getRequestDispatcher("admin/categorie.jsp");
		rd.forward(request, response);
	}

}
