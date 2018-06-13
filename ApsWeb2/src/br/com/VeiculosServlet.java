package br.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebInitParam;

@WebServlet(name = "VeiculosServlet",
urlPatterns = { "/VeiculosServlet" },
initParams = {
@WebInitParam(name = "tipo", value = "value1"),
@WebInitParam(name = "modelo", value = "value2"),
@WebInitParam(name = "fabricante", value = "value3"),
@WebInitParam(name = "cor", value = "value3"),
@WebInitParam(name = "placa", value = "value3")}
)
public class VeiculosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public VeiculosServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request(request, response);
    }
    protected void request(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		request.setAttribute("tipo", request.getParameter("tipo"));
    		HttpSession session = request.getSession();
    		session.setAttribute("modelo", request.getParameter("modelo"));
    		request.getRequestDispatcher("cadastrado.jsp").forward(request,
    		response);
    }

}
