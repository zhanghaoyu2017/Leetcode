package com.hiasenna.puyuan;

import java.sql.*;

/**
 * @ClassName Person
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/9/17-21:11
 * @Version 1.0
 **/
public class Person {
    private String name;
    private String age;
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

class Test {
    public static void main(String[] args) {
        String str = "#name:jack;#age:24;#birthday:1995/10/24 00:00:00;";
        String[] info = str.split(";");
        Person person = new Person();
        person.setName(info[0].replace("#name:", ""));
        person.setAge(info[1].replace("#age:", ""));
        person.setBirthday(info[2].replace("#birthday:", ""));

        String name = person.getName();
        String age = person.getAge();
        String birthday = person.getBirthday();

        //jdbc

        Connection conn = null;
        Statement stmt = null;
        String url = "mysql://127.0.0.1:3306/test";
        String username = "root";
        String pwd = "000000";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, username, pwd);
            //增加Person
            String inset_sql = "insert into person (name, age, birthday) values(name,age,birthday)";
            int i = stmt.executeUpdate(inset_sql);
            if (i>0){
                System.out.println("success");
            }
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


