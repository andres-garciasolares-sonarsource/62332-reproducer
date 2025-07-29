package com.acme.basic;

import java.io.InputStream;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet()
public class MyServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) {
    try {
      try {

      } catch (Exception e) {

      }

      throw new Exception(); // Sonar raises S1989 (https://rules.sonarsource.com/java/RSPEC-1989/)

    } catch (Exception e) {

    }
  }

}
