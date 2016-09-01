package primeiroPacote.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rhuan
 */
public class MeuServlet implements Servlet {

    int contador = 0;

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        contador++;
        // configura os paramentros de retorno
        res.setCharacterEncoding("iso-8859-1");
        res.setContentType("text/html");

        //escreve o conteudo da respsota
        ServletOutputStream saida = res.getOutputStream();

        saida.println("<!DOCTYPE html>");
        saida.println("<html>");

        saida.println("<head>");
        saida.println("<meta charset='iso-8859-1' />");
        saida.println("<title> Meu Servlet!! </title>");
        saida.println("</head>");
        saida.println("<body>");
        saida.println("<h1> Este é meu primeiro Servlet " + contador + "</h1>");

        String usuarioParam = req.getParameter("usuario");
        String senhaParam = req.getParameter("senha");
        saida.println("User : " + usuarioParam);
        saida.println("<br />");
        saida.println("Senha: " + senhaParam);

        saida.println("</body>");
        saida.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

}
