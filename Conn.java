package hotel.management.system;

import java.sql.*;

public class Conn {
  //jdbc is imp topic 
        //in jdbc connectivty there are 5 steps 
        //step 1: Register the Driver class(mysql driver)
        //step 2: Creating a connection(build connection)
        //step 3: Creating a statement
        //step 4: Excuting mysql queries
        //step 5: Close the connection
    
        Connection c;
        Statement s;
        Conn(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","Plabde@#$2001");
        s = c.createStatement();
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
