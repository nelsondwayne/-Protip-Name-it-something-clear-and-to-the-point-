import java.sql.*;

public class AddATable {
   Connection conn = null;
   static Statement stmt = null;
	
	public static void main(String[] arguments) {
       String data = "jdbc:derby:derbyDB;create=true";
       try (
           Connection conn = DriverManager.getConnection(
               data, "user1", "USER1");
           Statement st = conn.createStatement()) {

           Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();

            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            		
            System.out.println("Creating table in given database..." + data);
            String sql = ("CREATE TABLE STOCKS " 
            			+" (TICKER VARCHAR(10), "
            			+" PRICE VARCHAR(10), "
            			+" DATE VARCHAR(10), "
            			+" CHANGE VARCHAR(10),"
            			+" LOW VARCHAR(10),"
            			+" HIGH VARCHAR(10),"
            			+" PRICEOPEN VARCHAR(10),"
            			+" VOLUME VARCHAR(10))");
            stmt.executeUpdate(sql);
            
            System.out.println("Created table in given database..." + data);
            st.close();
        } catch (SQLException s) {
            System.out.println("SQL Error: " + s.toString() + " "
                + s.getErrorCode() + " " + s.getSQLState());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString()
                + e.getMessage());
        }
    }
}