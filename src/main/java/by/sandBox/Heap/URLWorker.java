package by.sandBox.Heap;

import com.fasterxml.jackson.databind.util.TokenBufferReadContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.net.URL;
import java.net.URLConnection;

public class URLWorker {
    public static String getURLContent(String urlAdress)
    {
        StringBuffer content = new StringBuffer();
        try {
            URL url = new URL(urlAdress);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                content.append(line+"/n");
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("Neki trЭsh");
        }
        return content.toString();
    }
}
