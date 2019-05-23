package Servlet;

import Model.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexsander Rocha
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private void processaRequisicao(String metodoHttp, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uEmail = request.getParameter("email");
        String uSenha = request.getParameter("senha");

        boolean error = false;
        if ((uEmail.length() == 0) || (uSenha.length() == 0)) {
            error = true;
        }

        if (error) {
            request.setAttribute("varMsg", true);
            request.setAttribute("msg", "Campo de E-mail ou Senha inválido");

            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        } else {
            Usuario sistema = new Usuario();
            Usuario login = new Usuario(uEmail, uSenha);

            if (sistema.getEmail().equalsIgnoreCase(login.getEmail())) {
                if (sistema.getSenha().equalsIgnoreCase(login.getSenha())) {
                    request.setAttribute("usuario", login.getNome());

                    RequestDispatcher dispatcher = request.getRequestDispatcher("/area_restrita.jsp");
                    dispatcher.forward(request, response);
                } else {
                    request.setAttribute("varMsg", true);
                    request.setAttribute("msg", "Senha inválida");

                    RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                }
            } else {
                request.setAttribute("varMsg", true);
                request.setAttribute("msg", "E-mail inválido");

                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                dispatcher.forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processaRequisicao("GET", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processaRequisicao("POST", req, resp);
    }

}
