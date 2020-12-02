package MySQL;
import java.sql.*;
public class Demo1 {
    public static void main(String[] args)
    {
        try
        {
            String host ="jdbc:mysql://localhost:3306/songs";
            String uName = "root";
            String uPass = "";

            Connection conn = DriverManager.getConnection(host, uName, uPass);

            Statement st=conn.createStatement();
            String sql = "SELECT  * FROM songs";
            ResultSet rs = st.executeQuery(sql);

           // Class.forName(myDriver);
            while (rs.next())
            {
                int song_id = rs.getInt("song_id");
                String Artist = rs.getString("Artist");
                String Style = rs.getString("Style");
                String Title = rs.getString("Title");
                String p= song_id + " "+ Artist+" "+Style+" "+Title;
                System.out.println(p);
            }
            //st.close();
            }
            catch (SQLException err)
            {

                //System.err.println("Got an exception ");
                //System.err.println(e.getMessage());
                System.out.println(err.getMessage());
            }
    }
}
