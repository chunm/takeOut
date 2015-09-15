/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Michael
 */
public class TakeOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String test = "']\",";
        try {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.replace("\"jsp\":\"[", "\"jsp\":[");
                line = line.replace(test, "]");
                System.out.println(line);
            }
        } finally {
            br.close();
        }
    }
    
}
