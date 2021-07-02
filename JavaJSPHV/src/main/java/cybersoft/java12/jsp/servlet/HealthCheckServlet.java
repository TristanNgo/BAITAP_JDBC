package cybersoft.java12.jsp.servlet;

import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java12.jsp.dbconnection.MySqlConnection;
@WebServlet(name ="healthCheckServlet", urlPatterns ="/health")
public class HealthCheckServlet extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			Connection testConnection = MySqlConnection.getConnection();
			if(testConnection != null) {
				resp.getWriter().append("Database connection has been created successful");
			} else {
				resp.getWriter().append("Database connection has been created unsuccessful");
			}
		}
}
