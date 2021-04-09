package com.example.cookielogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieLogin
 */
@WebServlet("/cookie-login")

public class CookieLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		if(request.getParameter("username") != null) {
			String cookieName = request.getParameter("username");
			Cookie[] cookies = request.getCookies();
			
			String countString = CookieUtilities.getCookieValue(cookies, cookieName, "1");
			
			int count = 1;
			try {
			count = Integer.parseInt(countString);
			} catch(NumberFormatException nfe) { }
			Cookie c = new Cookie(cookieName, String.valueOf(count+1));
			response.addCookie(c);
			response.setContentType("text/html");
			
			out.println("<!DOCTYPE html>"+
			"<html lang='tr'>"+
			"<head>"+
			  "<title>Welcome</title>"+
			  "<meta charset='UTF-8'>"+
			  "<meta name='viewport' content='width=device-width, initial-scale=1'>"+
			  "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>"+
			  "<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>"+
			  "<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>"+
			"</head>"+
			"<body>"+ 
			"<div class='container'>"+
			  "<h2>WELCOME " + cookieName + "!</h2>"+
			  "<div class='well'> You have logged in " +count + " times.</div>"+
			"</div>"+
			"</body>"+
			"</html>");
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


