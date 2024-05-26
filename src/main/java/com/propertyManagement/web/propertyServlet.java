package com.propertyManagement.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.propertyManagement.bean.property;
import com.propertyManagement.dao.propertyDao;

/**
 * Servlet implementation class propertyServlet
 */

@WebServlet("/")
public class propertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private propertyDao PropertyDAO;
	
	public void init() {
		PropertyDAO = new propertyDao();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertProperty(request, response);
				break;
			case "/delete":
				deleteProperty(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateProperty(request, response);
				break;
			default:
				listproperty(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listproperty(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<property> listproperty = PropertyDAO.selectAllProperties();
		request.setAttribute("listproperty", listproperty);
		RequestDispatcher dispatcher = request.getRequestDispatcher("property-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher dispatcher = request.getRequestDispatcher("property-form.jsp");
			dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		property existingProperty = PropertyDAO.selectProperty(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("property-form.jsp");
		request.setAttribute("property", existingProperty);
		dispatcher.forward(request, response);

	}

	private void insertProperty(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String category = request.getParameter("category");
		String type = request.getParameter("type");
		String province = request.getParameter("province");
		String address = request.getParameter("address");
		String noofBedrooms = request.getParameter("noofBedrooms");
		String noofBathrooms = request.getParameter("noofBathrooms");
		String floorArea = request.getParameter("floorArea");
		String sizeofLand = request.getParameter("sizeofLand");
		String price = request.getParameter("price");
		String features = request.getParameter("features");
		String details = request.getParameter("details");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contactNo = request.getParameter("contactNo");

		property newProperty = new property(category,type,province,address, noofBedrooms,noofBathrooms,floorArea, sizeofLand, price, features, details,name, email,contactNo);
		PropertyDAO.insertProperty(newProperty);
		response.sendRedirect("list");
	}

	private void updateProperty(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String category = request.getParameter("category");
		String type = request.getParameter("type");
		String province = request.getParameter("province");
		String address = request.getParameter("address");
		String noofBedrooms = request.getParameter("noofBedrooms");
		String noofBathrooms = request.getParameter("noofBathrooms");
		String floorArea = request.getParameter("floorArea");
		String sizeofLand = request.getParameter("sizeofLand");
		String price = request.getParameter("price");
		String features = request.getParameter("features");
		String details = request.getParameter("details");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contactNo = request.getParameter("contactNo");


		property pro = new property(id,category,type,province,address, noofBedrooms,noofBathrooms,floorArea, sizeofLand, price, features, details,name, email,contactNo);
		PropertyDAO.updateProperty(pro);
		response.sendRedirect("list");
	}

	private void deleteProperty(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		PropertyDAO.deleteProperty(id);
		response.sendRedirect("list");

	}
}
