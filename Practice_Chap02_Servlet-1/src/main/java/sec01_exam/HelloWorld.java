package sec01_exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//URL매핑코드가 @WebServlet어노테이션에 명기되어 있다.
//@WebServlet어노테이션보다 web.xml에서 지정한 매핑코드가 우선순위 훨씬 높다.
//서블릿 파일이 되면 HttpServlet클래스를 자동으로 상속 받는다.
@WebServlet("/Hworld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	//생성자
    public HelloWorld() {
        super();
    }
    //여기서 2가지의 메서드가 나오는데 doGet(),doPost()인데, 이것은 이 서블릿 파일이 처리하는 부분이다.
    //이 서블릿을 호출할때 클라이언트에서 요청이 들어올 때, get방식이냐, Post방식이냐에 따라 호출이 달라진다.
	//보통, doGet()메서드는 폼을 그냥 출력하는 형태로 많이 쓰이고, doPost메서드는 데이터를 가공이나 처리코드
    //실행할 때 많이 사용된다.
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Hellow World");
    	System.out.println("doGet()");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hellow World");
    	System.out.println("do Post()");
	}

	//결론
	//	1.jsp파일 : HTML파일내에 jsp코드를 넣는 것
	//	2.servlet파일 : 자바파일이고, 아울러 반드시 매핑을 해서 사용해야 한다.
}
