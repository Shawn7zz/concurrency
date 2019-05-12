package servlet;

import entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Xiang Lan
 * Created on 2019-05-10 02:09
 */
public class RegServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users users = new Users();
        String userName, passWord, gender, email, introduce, isAccept;
        Date birthday;
        String[] habits;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        try {
            userName = request.getParameter("username");
            passWord = request.getParameter("password");
            gender = request.getParameter("gender");
            email = request.getParameter("email");
            introduce = request.getParameter("introduce");
            birthday = simpleDateFormat.parse(request.getParameter("birthday"));
            habits = request.getParameterValues("favorite");
            isAccept = request.getParameter("isAccept");
            users.setUserName(userName);
            users.setPassWord(passWord);
            users.setGender(gender);
            users.setEmail(email);
            users.setIntro(introduce);
            users.setBirthday(birthday);
            users.setHabits(habits);
            users.setAccept(isAccept.equals("true"));

//            request.getSession().setAttribute("RegServlet");

            request.getRequestDispatcher("../userinfo.jsp").forward(request,response);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
