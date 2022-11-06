package com.PracticeJavaWithPandey.URL;
import java.net.*;
public class URLClassDemo {
    public static void main(String[] args) {
        String URLofWebsite = "https://www.sbicard.com/en/personal/offers.page#";

        try {
            URL url = new URL(URLofWebsite);
            System.out.println("Protocol Website Using : "+url.getProtocol());
            System.out.println("Host Name of Website is : "+url.getHost());
            System.out.println("Port Number of Website is : "+url.getPort());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
