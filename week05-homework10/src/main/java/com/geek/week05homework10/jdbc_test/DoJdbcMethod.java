package com.geek.week05homework10.jdbc_test;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 类描述：
 *
 * @ClassName DoJdbcMethod
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/5 17:20
 * @Version 1.0
 */
public class DoJdbcMethod {
          public static void main(String[] args) {
//          getAll();
//          getById();
          getByH2();
     }

     private static void getByH2() {
          Properties properties = new Properties();
          try{
               InputStream is = DoJdbcMethod.class.getClassLoader().getResourceAsStream("hikari.properties");
               properties.load(is);
          } catch (IOException e) {
               e.printStackTrace();
          }
          if(properties!=null){
               HikariConfig hikariConfig = new HikariConfig(properties);
               HikariDataSource hikariDataSource = new HikariDataSource((hikariConfig));
               Connection connection = null;
               Statement statement = null;
               try {
                    connection = hikariDataSource.getConnection();
                    statement = connection.createStatement();
                    PreparedStatement preparedStatement = connection.prepareStatement("select * from emp where eid = ?");
                    preparedStatement.setObject(1,11);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                         System.out.println(resultSet.getObject(1)+"\t\t"+resultSet.getObject(2)+"\t\t"+resultSet.getObject(3));
                    }
                    connection.close();
               } catch (SQLException e) {
                    e.printStackTrace();
               }
               finally {
                    if(connection!=null) {
                         try {
                              connection.close();
                         } catch (SQLException e) {
                              e.printStackTrace();
                         }
                    }
               }
          }
     }

     public static String getAll(){
          try {
               Connection connection = jdbc.practice_01.JDBCUtils.getConnection();
               Statement statement = connection.createStatement();
               ResultSet resultSet = statement.executeQuery("select * from emp");
               System.out.println("jdbc查询：");
               while(resultSet.next()){
                    System.out.println(resultSet.getObject(1)+"\t\t"+resultSet.getObject(2)+"\t\t"+resultSet.getObject(3));
               }
               jdbc.practice_01.JDBCUtils.closeResource(connection,statement,resultSet);
               return resultSet.toString();
          } catch (SQLException e) {
               e.printStackTrace();
          }
          return null;
     }

     private static void getById() {
          try {
               Connection connection = jdbc.practice_01.JDBCUtils.getConnection();
               Statement statement = connection.createStatement();
               String sql = "select * from emp where eid = ?";
               PreparedStatement preparedStatement = connection.prepareStatement(sql);
               preparedStatement.setObject(1,11);
               ResultSet resultSet = preparedStatement.executeQuery();
               System.out.println("jdbc查询：");
               while(resultSet.next()){
                    System.out.println(resultSet.getObject(1)+"\t\t"+resultSet.getObject(2)+"\t\t"+resultSet.getObject(3));
               }
               jdbc.practice_01.JDBCUtils.closeResource(connection,statement,resultSet);
          } catch (SQLException e) {
               e.printStackTrace();
          }
     }

}
