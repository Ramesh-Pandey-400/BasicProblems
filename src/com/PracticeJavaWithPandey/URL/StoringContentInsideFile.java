package com.PracticeJavaWithPandey.URL;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;

public class StoringContentInsideFile {

    //method which will return result in the for of String
    static String getContent() throws IOException{
        String urlOfWebsite = "https://www.sbicard.com/en/personal/offers.page#all-offers";
        String result = " ";
        try{
            URL url = new URL(urlOfWebsite);
            // read / retrieve content of webpage
            Scanner scn = new Scanner(url.openStream());

            //use of String Buffer class to hold the result

            StringBuffer buffer = new StringBuffer();

            while(scn.hasNext()){
                buffer.append(scn.next());
                if(scn.hasNextLine()){
                    buffer.append("\n");
                }
            }
            //get result in String from String Buffer
           result = buffer.toString();
        }
        catch (MalformedURLException ignored){

        }
        return result;
    }
        public static void main(String[] args) throws IOException {

        String result = getContent();
        // set Path of File
            try {
                // iof file is not present then new File will be created with SampleFirst.txt name
                FileWriter fw  = new FileWriter("D:\\Important\\Java Practice\\BasicProblems\\StoredContent\\SampleFirst.txt");
                //writing inside file
                fw.write(result);
                fw.close();
                System.out.println("File Written Successfully!!");
            }
            catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }
        }
}
