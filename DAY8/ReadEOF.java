// package DAY8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReadEOF {
    public static void main(String[] args) throws IOException{

        BufferedReader bIn = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String eachLine ="";
        int lNo = 1;
        
        //while((eachline = bIn.readLine()) != null)
        while(!(eachLine = bIn.readLine()).equals("EOF")){
            System.out.println(lNo+" "+eachLine);
            lNo++;
        }
        bIn.close();
    }
}
