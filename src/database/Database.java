package database;


import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class  Database {
    private volatile static Database instance = null;

    private Connection c = null;
    private Statement stmt = null;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();


    private Database() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:GameDatabase.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();


           this.createTable();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }

    private void createTable(){
        if(c != null){
            try{
                String Sql = "CREATE TABLE TabelJoc " +
                        "(Data_conectare TEXT NOT NULL, " +
                       "Timp_obținut TEXT NOT NULL );";

/*
                String completedLevelsSql = "CREATE TABLE completed_levels " +
                        "(id_completed INT  PRIMARY KEY NOT NULL, " +
                        "level_code    INT              NOT NULL, " +
                        "id_player     INT              NOT NULL, " +
                        "score         INT              NOT NULL);";
*/
                stmt.executeUpdate(Sql);
                c.commit();

                System.out.println("Database tables if didn't exist before, have been created successfully!");


            }catch (Exception e){
                System.out.println( e.getMessage() );
            }
        }
    }


    public void addTime(String timp) {
        int id = 1;

                try {

                    String sql = "INSERT INTO TabelJoc (Timp_obținut, Data_conectare) VALUES ("+timp+",'"+ dtf.format(now).toString() +"');";                    stmt.executeUpdate(sql);
                    c.commit();

                } catch ( Exception e ) {
                    System.out.println(e.getMessage());
                }

    }
    public void Close(){
        if(c != null){
            try {
                stmt.close();
                c.close();
                System.out.println("The connection has successfully been closed!");
            }
            catch(Exception e){
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            }
        }
    }
}




