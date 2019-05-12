package entity;

import java.util.Date;

/**
 * @author Xiang Lan
 * Created on 2019-05-10 02:03
 */
public class Users extends base {

    private String userName;
    private String passWord;
    private String email;
    private String gender;
    private Date birthday;
    private String[] habits;
    private String intro;
    private boolean isAccept;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public boolean isAccept() {
        return isAccept;
    }

    public void setAccept(boolean accept) {
        isAccept = accept;
    }

    @Override
    public int nihao() {
        return 0;
    }
}
