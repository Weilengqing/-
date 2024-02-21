package com.zzl.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class myDataBase {
   private static String url;//数据库地址
   private static String driver;
   private static String user;
   private static String password;//数据库登录密码

   static {
      //读取配置文件
      Properties properties = new Properties();
      FileInputStream file = null;
      try {
         file = new FileInputStream("D:\\java\\农村人口统计系统\\src\\jdbc.properties");
         //调用方法,加载文件file
         properties.load(file);
         //读取文件内容
         url = properties.getProperty("url");
         driver = properties.getProperty("driver");
         user = properties.getProperty("user");
         password = properties.getProperty("password");

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (file != null) {
            try {
               file.close();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      }
   }
   //获取Connection与数据库建立联系
   public static Connection getConnection() {
      Connection connection = null;
      try {
         //搜索并加载相应的driver
         Class.forName(driver);
         connection = DriverManager.getConnection(url, user, password);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return connection;
   }
   //关闭数据流
   public static void close(PreparedStatement ps,Connection connection){
      if (ps!=null){
         try {
            ps.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      if (connection!=null){
         try {
            connection.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

}
