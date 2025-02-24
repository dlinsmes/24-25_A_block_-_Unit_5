import java.util.ArrayList;
//drag your csv file to the top-level project folder on the left
public class CSVTester {
    public static void main(String [] args) {
        ArrayList<String []> demoData = CSVImporter.getData("Demo.csv");

        //start at row 1 (instead of 0) so the header row with column titles
        //doesn't get parsed incorrectly
        for (int i = 1; i < demoData.size(); i++) {

            String [] row = demoData.get(i);

            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + "\t");
            }
            System.out.println();

            //each city needs a string for name, string for lang, int pop

            //in data, the type for everything is string
            //-need to convert to int for population
            int pop = Integer.parseInt(row[2]);

            City c = new City(row[0], row[1], pop);
            System.out.println(c);

            System.out.println();
        }
    }
}
