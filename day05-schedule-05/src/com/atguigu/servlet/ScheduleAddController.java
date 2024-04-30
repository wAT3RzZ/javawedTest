package com.atguigu.servlet;

import com.atguigu.pojo.SysUser;
import com.atguigu.service.impl.ScheduleServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @classname javawedTest
 * @Auther d3Lap1ace
 * @Time 30/4/2024 14:46 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@WebServlet("/schedule/add")
public class ScheduleAddController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        String title = req.getParameter("title");
        SysUser user = (SysUser)req.getSession().getAttribute("user");
        ScheduleServiceImpl scheduleService = new ScheduleServiceImpl();
        scheduleService.addSchedule(title,user.getUid());
        resp.sendRedirect(req.getContextPath()+"/schedule/slow");
    }
}
