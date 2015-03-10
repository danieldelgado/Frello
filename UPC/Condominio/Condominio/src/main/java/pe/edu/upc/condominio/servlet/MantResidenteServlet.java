package pe.edu.upc.condominio.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pe.edu.upc.condominio.util.Constantes;

public class MantResidenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger(MantResidenteServlet.class);

	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		logger.debug("Service");

		RequestDispatcher requestDispatcher;
		requestDispatcher = req.getRequestDispatcher(Constantes.RESIDENTE);
		requestDispatcher.forward(req, resp);
	}

}
