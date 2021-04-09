package com.example.cookielogin;

import javax.servlet.http.Cookie;

public class CookieUtilities {
	 // Other methods in this class shown in earlier chapters.

	 public static String getCookieValue(Cookie[] cookies,
	                   String cookieName,
	                   String defaultValue) {
	  for(int i=0; i<cookies.length; i++) {
	   Cookie cookie = cookies[i];
	   if (cookieName.equals(cookie.getName()))
	    return(cookie.getValue());
	  }
	  return(defaultValue);
	 }

	 public static Cookie getCookie(Cookie[] cookies,
	                 String cookieName) {
	  for(int i=0; i<cookies.length; i++) {
	   Cookie cookie = cookies[i];
	   if (cookieName.equals(cookie.getName()))
	    return(cookie);
	  }
	  return(null);
	 }
	}