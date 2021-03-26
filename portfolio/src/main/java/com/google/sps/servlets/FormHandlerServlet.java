package com.google.sps.servlets;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.KeyFactory;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Get the value entered in the form.
    String name = Jsoup.clean(request.getParameter("name"), Whitelist.none());
    String email = Jsoup.clean(request.getParameter("email"), Whitelist.none());
    String message = Jsoup.clean(request.getParameter("message"), Whitelist.none());
    
    
    Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
    KeyFactory keyFactory = datastore.newKeyFactory().setKind("Task");
    
    FullEntity taskEntity =
    Entity.newBuilder(keyFactory.newKey())
        .set("name", name)
        .set("email", email)
        .set("message", message)
        .build();
    datastore.put(taskEntity); 

    response.sendRedirect("thankYou.html");
  // response.setContentType("text/html");
 //  response.getWriter().println("You submitted: "+name+"<br />"+email+"<br />"+message+"<br />");
  // response.getWriter().println("<br />Thank You!");
 
}

}

