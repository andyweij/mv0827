

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import model.NameCity;
/**
 * Servlet implementation class ServerJsonServlet
 */
@WebServlet("/ServerJsonServlet")
public class ServerJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerJsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InputStream  in=request.getInputStream();
		InputStreamReader sr=new InputStreamReader(in,"utf-8");
		BufferedReader br=new BufferedReader(sr);
		String jtxt="";
		String tmpStr=null;
		while((tmpStr=br.readLine())!=null) {
			  jtxt+=tmpStr;
		}
		Gson g=new Gson();
		NameCity nc=g.fromJson(jtxt, NameCity.class);
		response.getWriter().append("Served at: ").append(nc.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
