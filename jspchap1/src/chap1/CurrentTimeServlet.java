package chap1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrentTimeServlet
 */
// http://localhost:8080/jspchap1/CurrentTimeServlet
@WebServlet("/CurrentTimeServlet") //요청 url 설정
public class CurrentTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CurrentTimeServlet() {
        super();
    }
    //요청 방법(method)이 get 방식인 경우 호출되는 메서드
	protected void doGet(HttpServletRequest request, 
			 HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=EUC-KR");
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR_OF_DAY);
		int m = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		//PrintWriter : 문자형 출력스트림.
		// out : 브라우저에 내용을 출력하는 출력 스트림.
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>현재시간</title></head>");
		out.println("<body>");
		out.println
		("<h1>현재시간은 " + h + "시 " + m + "분 " + s +"초 입니다.</h1>");
		out.println("</body></html>");
	}
    //요청 방법(method)이 POST 방식인 경우 호출되는 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
