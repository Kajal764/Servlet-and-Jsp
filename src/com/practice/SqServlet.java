package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int result = 0;
		Cookie cookies[] = req.getCookies();

		for (Cookie c : cookies) {
			if (c.getName().equals("sum"))
				result = Integer.parseInt(c.getValue());
		}
		int square = result * result;
		PrintWriter out = res.getWriter();

		out.print("square result " + square);
	}
}
