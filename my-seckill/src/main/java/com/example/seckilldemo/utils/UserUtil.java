package com.example.seckilldemo.utils;

import com.example.seckilldemo.entity.TUser;
import com.example.seckilldemo.vo.RespBean;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成用户工具类
 */
public class UserUtil {
//    private static void createUser(int count) throws Exception {
//        List<TUser> users = new ArrayList<>(count);
//        for(int i = 0; i < count; i++) {
//            TUser user = new TUser();
//            user.setId(13000000000L + i);;
//            user.setNickname("user" + i);;
//            user.setSalt("1a2b3c");
//            user.setPassword(MD5Util.inputPassToDBPass("123456", user.getSalt()));
//            users.add(user);
//        }
//        System.out.println("Create user...");
//        Connection connection = getConn();
//        String sql = "insert into t_user(id, nickname, salt, password, register_date, login_count) values(?,?,?,?,?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        for(int i = 0; i < users.size(); i++) {
//            TUser user = users.get(i);
//            preparedStatement.setLong(1, user.getId());
//            preparedStatement.setString(2, user.getNickname());
//            preparedStatement.setString(3, user.getSalt());
//            preparedStatement.setString(4, user.getPassword());
//            preparedStatement.setTimestamp(5, new Timestamp(user.getRegisterDate().getTime()));
//            preparedStatement.setInt(6, user.getLoginCount());
//            preparedStatement.addBatch();
//        }
//        preparedStatement.executeBatch();
//        preparedStatement.clearParameters();
//        connection.close();
//        System.out.println("insert into db");
//
//        //登录，生成UserTicket
//        String urlString = "http://localhost:8080/login/doLogin";
//        File file = new File("E:\\JAVA\\Users\\config.txt");
//        if (file.exists()) {
//            file.delete();
//        }
//        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
//        randomAccessFile.seek(0);
//        for (int i = 0; i < users.size(); i++) {
//            TUser tUser = users.get(i);
//            URL url = new URL(urlString);
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            httpURLConnection.setRequestMethod("POST");
//            httpURLConnection.setDoOutput(true);
//            OutputStream outputStream = httpURLConnection.getOutputStream();
//            String params = "mobile=" + tUser.getId() + "&password=c38dc3dcb8f0b43ac8ea6a70b5ec7648";
//            outputStream.write(params.getBytes());
//            outputStream.flush();
//            InputStream inputStream = httpURLConnection.getInputStream();
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            byte[] buff = new byte[1024];
//            int len = 0;
//            while ((len = inputStream.read(buff)) >= 0) {
//                byteArrayOutputStream.write(buff, 0, len);
//            }
//            inputStream.close();
//            byteArrayOutputStream.close();
//            String respone = new String(byteArrayOutputStream.toByteArray());
//            ObjectMapper mapper = new ObjectMapper();
//            RespBean respBean = mapper.readValue(respone, RespBean.class);
//            String userTicket = (String) respBean.getObject();
//            System.out.println("create userTicket:" + tUser.getId());
//            String row = tUser.getId() + "," + userTicket;
//            randomAccessFile.seek(randomAccessFile.length());
//            randomAccessFile.write(row.getBytes());
//            randomAccessFile.write("\r\n".getBytes());
//            System.out.println("write to file :" + tUser.getId());
//        }
//        randomAccessFile.close();
//        System.out.println();
//    }
//
//    private static Connection getConn() throws Exception {
//        String url = "jdbc:mysql://127.0.0.1:3306/myseckill?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
//        String username = "root";
//        String password = "123456";
//        String driver = "com.mysql.cj.jdbc.Driver";
//        Class.forName(driver);
//        return DriverManager.getConnection(url, username, password);
//    }

}
