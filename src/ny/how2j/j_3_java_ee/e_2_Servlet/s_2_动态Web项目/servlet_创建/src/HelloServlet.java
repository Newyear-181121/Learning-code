import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        try {
            response.setContentType("text/html; charset=UTF-8");    //设置这个才能正常显示中文。
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println("<h1>文件布置成功</h1>");

            response.getWriter().println(new Date().toString());

            response.getWriter().println("<h1>服务器启动成功</h1>");

            response.setContentType("text/html; charset=UTF-8");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
