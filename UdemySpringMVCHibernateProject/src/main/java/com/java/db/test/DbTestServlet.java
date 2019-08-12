/*package com.java.db.test;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

*//**
 * Servlet implementation class DbTestServlet
 *//*
public class DbTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    *//**
     * Default constructor. 
     *//*
    public DbTestServlet() {
        // TODO Auto-generated constructor stub
    }

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		spring.jooq.sql-dialect=org.hibernate.dialect.MySQLDialect
				spring.datasource.driver-class-name=com.mysql.jdbc.Driver
				spring.datasource.url=jdbc:mysql://localhost:3306/Hibrernate_DB
				spring.datasource.username=root
				spring.datasource.password=root
				String username = "root";
				String password = "root";
				String url="jdbc:mysql://localhost:3306/Hisdsdfsd";
				String driver= "com.mysql.jdbc.Driver"; 
				try
				{
					Class.forName(driver);
					java.sql.Connection con = DriverManager.getConnection(url, username, password);
					
				}
				catch(Exception ex)
				{
					throw new ServletException(ex);
				}
				
				System.out.println("Mineeeeeeeeeeeeeeeee");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
*/