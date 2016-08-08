/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebapp.helloweb.controller;

//import demo.cs3520.csu.edu.Book;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author anu
 * 
 * 
 */
public class BookList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Book> books = new ArrayList< Book >();
        books.add(new Book("1000", "Java Book","richard",1050));
        books.add(new Book("2000", "python book","david",500));
        books.add(new Book("3000", "C++ Book","dan",2300));
        books.add(new Book("4000", "C# Book","michael",1400));
        books.add(new Book("5000", "JSP Book","williams",320));
        String limit = request.getParameter("limit");
        //int highvar = Integer.parseInt(limit);
        //System.out.println("PIKKI" + highvar);
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/list.jsp");
        HttpSession session = request.getSession();
        session.setAttribute("highvar", String.valueOf(limit));

        request.setAttribute("books", books);

        rd.forward(request, response);

    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

