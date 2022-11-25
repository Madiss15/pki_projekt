package de.uni_trier.wi2.pki.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Is used to read in CSV files.
 */
public class CSVReader {

    /**
     * Read a CSV file and return a list of string arrays.
     *
     * @param relativePath the path where the CSV file is located (has to be relative path!)
     * @param delimiter    the delimiter symbol which is used in the CSV
     * @param ignoreHeader A boolean that indicates whether to ignore the header line or not, i.e., whether to include the first line into the list or not
     * @return A list that contains string arrays. Each string array stands for one parsed line of the CSV file
     * @throws IOException if something goes wrong. Exception should be handled at the calling function.
     */

    public static List<String[]> readCsvToArray(String relativePath, String delimiter, boolean ignoreHeader){
        List<String[]> readDate = new ArrayList<>();
        int rows = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(relativePath));
            String currentLine = "";
            if(ignoreHeader)
                reader.readLine();
            while ((currentLine=reader.readLine()) !=null){
                readDate.add(currentLine.split(delimiter));
                rows++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found");
            return null;
        } catch (IOException e) {
            System.out.println("File seems corrupted");
            e.printStackTrace();
        }
        System.out.println("------------------------------");
        System.out.println(rows+" Lines read");
        System.out.println("------------------------------");
        return readDate;
    }

}
