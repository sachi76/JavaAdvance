package LLD.singleton;

public class DBConnection {
    public static volatile DBConnection instance = null;
    public String url;
    public String username;
    public String password;

    private DBConnection() {

    };

    public  static DBConnection getInstance() {
        if(instance == null) {
            synchronized(DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
      return instance;
    };


}
