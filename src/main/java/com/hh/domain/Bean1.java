package com.hh.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/14 9:49
 **/
public class Bean1 {
  /*  public static void main(String[] args) {
        Connection conn;
        //获取数据连接
        conn = DriverManager.getConnection("url", "user", "password");
        try{
            //设置事务隔离级别
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

           //sql代码执行①

            Savepoint savePoint1 = conn.setSavepoint("savePoint1");

            //sql代码执行②

        }catch(Exception e){
            //如果执行了回滚事务，回滚到①处的savePoint1,①之前的sql操作，在整个事务提交后依然提交，但①之后的操作被回滚了
            //回滚事务
            conn.rollback();

        }finally {
            //...
            //提交事务
            conn.commit();
        }
    }
*/

}
