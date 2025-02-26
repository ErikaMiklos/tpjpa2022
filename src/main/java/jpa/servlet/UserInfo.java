package jpa.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="userinfo", urlPatterns={"/UserInfo"})
public class UserInfo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter p = new PrintWriter(resp.getOutputStream());
        p.print("Hello world");
        p.flush();

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<HTML>\n<BODY>\n" +
                "<H1>Recapitulatif des informations</H1>\n" +
                "<UL>\n" +
                " <LI>Nom: "
                + request.getParameter("name") + "\n" +
                " <LI>Prenom: "
                + request.getParameter("firstname") + "\n" +
                " <LI>Age: "
                + request.getParameter("age") + "\n" +
                "</UL>\n" +
                "</BODY></HTML>");
    }
}
