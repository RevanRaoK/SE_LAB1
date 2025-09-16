package com.example.attendance.controller;

import com.example.attendance.model.Student;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AttendanceServlet extends HttpServlet {
    private List<Student> students = new ArrayList<>();

    @Override
    public void init() {
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        for (Student s : students) {
            if (s.getId() == id) {
                s.setPresent(true);
            }
        }
        req.setAttribute("students", students);
        req.getRequestDispatcher("attendance.jsp").forward(req, resp);
    }
}
