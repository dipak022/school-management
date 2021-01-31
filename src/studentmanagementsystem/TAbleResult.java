
package studentmanagementsystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TAbleResult {
     String Username="root";
        String password=null;
        String url="jdbc:mysql://127.0.0.1/school";
        Connection connection = null;
        PreparedStatement pre;
          public void showtabledata(JTable table, String values){
        
        
          try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Exception "+e);
        }
          try{
            connection = (Connection) DriverManager.getConnection(url, Username, password);
            JOptionPane.showMessageDialog(null,"Connect Database  ");
            //insert(Fullname,Usernames,Phone,Password,cPassword,Gender);
            String sql="SELECT * FROM student";
            pre = connection.prepareStatement(sql);
            pre.setString(1, values);
            ResultSet result=pre.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            Object[] row;
            while(result.next()){
                row=new Object[7];
                row[0]=result.getInt(1);
                row[1]=result.getString(2);
                row[2]=result.getString(3);
                row[3]=result.getString(4);
                row[4]=result.getString(5);
                row[5]=result.getString(6);
                row[6]=result.getString(6);
                model.addRow(row);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Exception "+e);
        }
          
          //startt
          
          
          
        
    }
    
}
