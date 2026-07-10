package com.raghavender.jdbc;

import org.postgresql.core.ConnectionFactory;

import java.sql.*;

public class PostgresJDBC {
    public static void main(String[] args) {


        String sql = "select * from weather";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "Hello*122";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("City       " + "temp_lo   " + "temp_hi  " + "prcp  " + "date");
            while (rs.next()) {
                String city = rs.getString(1);
                String temp_lo = rs.getString(2);
                String temp_hi = rs.getString(3);
                String prcp = rs.getString(4);
                String date = rs.getString(5);

                System.out.println(city + "        " + temp_lo + "  " + temp_hi + "  " + prcp + "  " + date);

            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL error:" + e);


        }
    }
}






