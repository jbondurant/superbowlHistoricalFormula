package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataImports {

    public static void main(String[] args) {
        importSuperbowlStats();
    }

    public static ArrayList<SuperbowlStatRow> importSuperbowlStats() {
        String line = "";
        String splitBy = ",";
        try {
            ArrayList<SuperbowlStatRow> superbowlStatRows = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("/Users/justinbondurant/IdeaProjects/superbowlHistoricalFormula/src/main/DataFiles/superbowlAllStats.csv"));
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(splitBy);
                if(!tokens[2].equals("")){
                    superbowlStatRows.add(new SuperbowlStatRow(tokens));
                }
            }
            return superbowlStatRows;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
