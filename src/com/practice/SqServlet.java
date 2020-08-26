package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int result = Integer.parseInt(req.getParameter("k"));
		int square = result * result;
		PrintWriter out = res.getWriter();

		out.print("square result " + square);
	}
}
