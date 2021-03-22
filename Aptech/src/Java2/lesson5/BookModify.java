/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson5;

import com.mysql.cj.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class BookModify {
    static int check = 0;
    
    public static void insert(Book book){
        Connection conn = null;
        try {
            //Mo ket noi den database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/T2008A", "root", "");
            
            //Query
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement("insert into book(title, price, nxb, author, publish_date) values (?, ?, ?, ?, ?)");
            statement.setString(1, book.title);
            statement.setString(2, String.valueOf(book.price));
            statement.setString(3, book.manu);
            statement.setString(4, book.author);
            statement.setString(5, book.publishDate);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static List<Book> getBookList(String searching){
        List<Book> bookList = new ArrayList<>();
        Connection conn = null;
        try {
            //Mo ket noi den database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/T2008A", "root", "");
            
            //Query
            String sql = "select * from book";
            if(!searching.isEmpty()){
                sql += " where title like '%"+searching+"%'";
            }
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next() ){
                Book book = new Book(resultSet.getInt("id"), 
                        resultSet.getString("title"), 
                        resultSet.getFloat("price"), 
                        resultSet.getString("nxb"), 
                        resultSet.getString("author"), 
                        resultSet.getString("publish_date"));
                bookList.add(book);
                check++;
            }
            if(check == 2 && MainFrame.kiemtra == 1 ){
                statement = (PreparedStatement) conn.prepareStatement("select * from book");
                resultSet = statement.executeQuery();
                while(resultSet.next()){
                    Book book = new Book(resultSet.getInt("id"), 
                            resultSet.getString("title"), 
                            resultSet.getFloat("price"), 
                            resultSet.getString("nxb"), 
                            resultSet.getString("author"), 
                            resultSet.getString("publish_date"));
                    bookList.add(book);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return bookList;
    }
    
    public static void delete(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/T2008A", "root", "");
            PreparedStatement stm = (PreparedStatement) conn.prepareStatement("delete from book");
            stm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
}
