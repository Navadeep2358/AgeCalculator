package com.las6;

import java.time.LocalDate;
import java.time.Period;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JavaCode extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String mail = req.getParameter("mail");
        String dob = req.getParameter("dob");

        // Calculate age
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(dob);
        int age = Period.between(birthDate, currentDate).getYears();

        // Output HTML
        out.println("<html><body style='background-color:pink; text-align:center;'>");
        out.println("<h2>Age Calculator</h2>");
        out.println("<h3>Hello, " + name + "!</h3>");
        out.println("<p>Email: " + mail + "</p>");
        out.println("<p>Date of Birth: " + dob + "</p>");
        out.println("<p>Your Age: " + age + "</p>");
        out.println("</body></html>");
    }
}
