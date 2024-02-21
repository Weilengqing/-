package com.zzl.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class myDataBase {
   private static String url;//���ݿ��ַ
   private static String driver;
   private static String user;
   private static String password;//���ݿ��¼����

   static {
      //��ȡ�����ļ�
      Properties properties = new Properties();
      FileInputStream file = null;
      try {
         file = new FileInputStream("D:\\java\\ũ���˿�ͳ��ϵͳ\\src\\jdbc.properties");
         //���÷���,�����ļ�file
         properties.load(file);
         //��ȡ�ļ�����
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
   //��ȡConnection�����ݿ⽨����ϵ
   public static Connection getConnection() {
      Connection connection = null;
      try {
         //������������Ӧ��driver
         Class.forName(driver);
         connection = DriverManager.getConnection(url, user, password);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return connection;
   }
   //�ر�������
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
