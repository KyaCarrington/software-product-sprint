package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
   
    ArrayList<String> thisMessage = new ArrayList<String>(Arrays.asList("I love UVA basketball","I just got the covid vaccine", "I am from Northern Virginia"));

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //Converting messages to Json 
    Gson gson = new Gson();
    String json = gson.toJson(thisMessage);

    response.setContentType("text/html;");
    response.getWriter().println(json);
  }
}
