package com.example.bibliotecaonline;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    Connection con;
    String username, pass, ip, port, database;

    public Connection conectionclass()
    {
        ip = "172.1.1.0";
        database = "Biblioteca";
        username = "sa";
        pass = "gabita24";
        port="1433";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;

        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL="jdbc:jtds:sqlserver://"+ ip + ":" + port + ";"+ "databasename="+database+"; user="+username+"; password= "+pass+";";
            connection= DriverManager.getConnection(ConnectionURL);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return connection;
    }
}
