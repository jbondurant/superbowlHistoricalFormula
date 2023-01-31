package utilities;

public class SuperbowlStatRow {
    public int dateYear;
    public int dateMonth;
    public int dateDay;
    public int superbowlNumber;
    public String winningTeamCity;
    public String winningTeamName;
    public String conference;
    public String division;
    public boolean birdTeam;
    public String stadium;
    public String city;
    public String state;
    public int durantAgeJan1;
    public int durantChampionshipsWonJan1;
    public int officialBondMoviesJan1;
    public int unofficialBondMoviesJan1;
    public int allBondMoviesJan1;

    public SuperbowlStatRow(String[] tokens){
        dateYear = Integer.parseInt(tokens[0].substring(0,4));
        dateMonth = Integer.parseInt(tokens[0].substring(4,6));
        dateDay = Integer.parseInt(tokens[0].substring(6,8));
        superbowlNumber = Integer.parseInt(tokens[1]);
        winningTeamCity = tokens[2];
        winningTeamName = tokens[3];
        conference = tokens[4];
        division = tokens[5];
        birdTeam = tokens[6] == "Yes" ? true : false;
        stadium = tokens[7];
        city = tokens[8];
        state = tokens[9];
        durantAgeJan1 = Integer.parseInt(tokens[10]);
        durantChampionshipsWonJan1 = Integer.parseInt(tokens[11]);
        officialBondMoviesJan1 = Integer.parseInt(tokens[12]);
        unofficialBondMoviesJan1 = Integer.parseInt(tokens[13]);
        allBondMoviesJan1 = Integer.parseInt(tokens[14]);
    }
}
