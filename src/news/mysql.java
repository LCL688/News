package news;
import java.sql.*;

public class mysql {

	public static void main(String[] args){
        try{
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");              
            String url="jdbc:mysql://localhost:3306/news?characterEncoding=utf-8";    //JDBC��URL    
            Connection conn;
            conn = DriverManager.getConnection(url,"root","pwy4225054");
            Statement stmt = conn.createStatement(); //����Statement����
            String sql = "select * from employee where name='Tom'";    //Ҫִ�е�SQL          
            ResultSet rs = stmt.executeQuery(sql);//�������ݶ���             
                while (rs.next()){
                	if(rs.getString(1).equalsIgnoreCase("Tom"))
                        System.out.print(rs.getString(1));
                }
                rs.close();
                stmt.close();
                conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}
