package jd;

public interface Config {
    /** MySQL */
    static boolean isMySql() {
        return false;
    }

    // public static final String URL = "jdbc:mysql://localhost:3306/me";
    // or, if in my.ini there is no -> default-time-zone="+02:00"
    // public static final String URL = "jdbc:mysql://localhost:3306/me?serverTimezone=Europe/Rome";

    /** Oracle DB */
    static boolean isOracle() {
        return false;
    }

    // public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521/xe";

    /** SQLite */
    static boolean isSqLite() {
        return true;
    }

    public static final String URL = "jdbc:sqlite:me.db";

    // User access info
    public static final String USER = "me";
    public static final String PASSWORD = "password";
}
