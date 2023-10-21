package com.cslc.Package3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Greatest3Controller extends HttpServlet {
    @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int x=Integer.parseInt(request.getParameter("n1"));
         int y=Integer.parseInt(request.getParameter("n2"));
         int z=Integer.parseInt(request.getParameter("n3"));
         Greatest3 gobj=new Greatest3();
         String result=gobj.large(x,y,z);
         response.getWriter().print(result);

      }

}
