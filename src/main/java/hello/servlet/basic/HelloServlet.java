package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {//서블릿이 호출되면 service 메서드가 호출된다. Ctrl+O
        //http요청이오면 was가 req,resp객체를 만들어서 서블릿에 던져줌
        //웹브라우저가 요청메세지를 만들어서 서버에 던짐 > request에 담김

        System.out.println("HelloServlet.service"); //soutm
        System.out.println("request = " + request);//soutv
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //header에 들어감
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        //http message body에 데이터 들어감
        response.getWriter().write("hello "+username);




    }
}
