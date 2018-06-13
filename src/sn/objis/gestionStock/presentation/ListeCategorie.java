package sn.objis.gestionStock.presentation;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestionStock.domain.Categorie;
import sn.objis.gestionStock.service.IServiceCategorieImpl;

/**
 * Servlet implementation class ListeCategorie
 */
@WebServlet("/listeCategorie")
public class ListeCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListeCategorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Creation de liste
		List<Categorie> listeCategorie = new ArrayList<>();
		// Etablissement de la connexion
		Connection con = (Connection) getServletContext().getAttribute("connexion");
		IServiceCategorieImpl serv = new IServiceCategorieImpl(con);
		listeCategorie = serv.getAll();
		// Ajout les donnees dans un scope
		request.setAttribute("categorie", listeCategorie);
		// Redirection vers la page creation catégorie
		RequestDispatcher rd = request.getRequestDispatcher("admin/categorie.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
