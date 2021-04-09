package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class ResponseHeader
 */
@WebServlet("/response-header")
public class ResponseHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseHeader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("FormControlSelect")!= null) {
			String req = request.getParameter("FormControlSelect");		
			switch(req) {
				case "Word":
					response.setContentType("application/vnd.ms-word");
					response.setHeader("Content-Disposition", "attachment; filename=students.docx");
					out.println("Ögrenci No\tAdi\tSoyadi");
					out.println("17060263\tElif\tYener");
					out.println("11111111\tHumeyra\tYilmaz");
					break;
					
				case "Pdf":
					response.setContentType("application/pdf");
					response.setHeader("Content-Disposition", "attachment; filename=students.pdf");
					out.println("Ögrenci No\tAdi\tSoyadi");
					out.println("17060263\tElif\tYener");
					out.println("11111111\tHumeyra\tYilmaz");
					
					
					break;
				case "Excel":
					response.setContentType("application/vnd.ms-excel");
					response.setHeader("Content-Disposition", "attachment; filename=students.xls");
					out.println("Ögrenci No\tAdi\tSoyadi");
					out.println("17060263\tElif\tYener");
					out.println("11111111\tHumeyra\tYilmaz");
					break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
