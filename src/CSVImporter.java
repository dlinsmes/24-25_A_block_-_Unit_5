import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class CSVImporter {

    //anything on this class file that's brand new is not on the test

    public static ArrayList<String []> getData(String filename) {
        ArrayList<String [] > data = new ArrayList<String []>();

        //attempt to run the code in the try section
        //and if anything causes a crash, run the catch section
        //instead
        try {
            File f = new File(filename);
            Scanner s = new Scanner(f);

            //continue reading the file as long as
            //there are more lines to read
            while(s.hasNextLine()) {
                String line = s.nextLine();
                //parse the line into different elements that
                //are separated by commas
                String [] dataRow = line.split(",");
                data.add(dataRow);
            }

        }
        catch(Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }


        return data;
    }


}
