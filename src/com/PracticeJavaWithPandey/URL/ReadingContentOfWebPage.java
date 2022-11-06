package com.PracticeJavaWithPandey.URL;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ReadingContentOfWebPage  {
    public static void main(String[] args) throws  IOException {
        String urlOfWebsite = "https://www.t20worldcup.com/";
        try{
            URL url = new URL(urlOfWebsite);
            // read / retrieve content of webpage
            Scanner  scn = new Scanner(url.openStream());

            //use of Dtring Buffer class to hold the result

            StringBuffer buffer = new StringBuffer();

            while(scn.hasNext()){
                buffer.append(scn.next());
            }


            //get result in String from Striung Buffer

            String result = buffer.toString();
            System.out.println(result);

        }
        catch (MalformedURLException ignored){

        }
    }
}
