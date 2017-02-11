/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import static javafx.css.StyleOrigin.USER_AGENT;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author cleyb
 */
public class Mensagem {
    
    private static final String USER_AGENT = "Mozilla/5.0";
    
    public static String sendGet() throws Exception {
        

        String url = "http://localhost/videoAulaAlura/credito.php";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        return response.toString();

    }
    
    public static String enviarMensagem(String msg) throws MalformedURLException, IOException{
        URL targetURL = new URL("http://localhost/teste.php");
        String data = "dados=" + msg;
        HttpURLConnection conn = (HttpURLConnection) targetURL.openConnection();
        conn.setDoOutput(true);
        conn.setInstanceFollowRedirects(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("charset", "UTF-8");
        conn.setRequestProperty("Content-Length", Integer.toString(data.length()));

        conn.setUseCaches(false);
        try (OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream())) {
            out.write(data);
        }
        String valor = "";
        //reading code after POST request (here I want to have value from "test" field
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                conn.getInputStream()))) {
            String currentLine;
            while ((currentLine = in.readLine()) != null) {
                valor= currentLine;
            }
        }

        //print result
        return valor.toString();
    }
    
}
