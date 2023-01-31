package logic;

import utilities.SuperbowlStatRow;
import utilities.DataImports;

import java.math.BigInteger;
import java.util.ArrayList;

public class BruteForceFormulaFinder {

    ArrayList<SuperbowlStatRow> historicalRows;
    int maxTrueReached;


    BruteForceFormulaFinder(){
        historicalRows = DataImports.importSuperbowlStats();
        maxTrueReached = 1;
    }

    public void findFormula(){
        //
    }

    public static void main(String[] args){
        BruteForceFormulaFinder bfff = new BruteForceFormulaFinder();
        bfff.lazyFindFormula();
    }

    public void runStupidLogic(
            long a,
            long b,
            long c,
            long d,
            long e,
            long f,
            long g,
            long h,
            long i){
        if(a==1 && h==5 && i==19){
            System.out.println("AAAAAA");
        }

        int currentTrueReached = 0;
        boolean atLeastOneFalse = false;
        for (SuperbowlStatRow ssr : historicalRows) {
            int teamNameLength = ssr.winningTeamName.length();
            int numBondMovies = ssr.officialBondMoviesJan1;
            int numDurantRings = ssr.durantChampionshipsWonJan1;
            int superbowlNumber = ssr.superbowlNumber;
            int teamDivisionLength = ssr.division.length();
            long formulaResult = ((teamNameLength + a) * b) + ((numDurantRings + c) * d)
                    + ((numBondMovies + e) * f)
                    + (teamDivisionLength - g)
                    - superbowlNumber;
            boolean conferenceStartsWithA = ssr.conference.toLowerCase().startsWith("a");
            boolean formulaResultIsEven = formulaResult % h == 0 || formulaResult % i == 0;
            if (conferenceStartsWithA != formulaResultIsEven) {
                atLeastOneFalse = true;
                break;
            } else {
                currentTrueReached++;
                if (currentTrueReached > maxTrueReached) {
                    maxTrueReached = currentTrueReached;
                    System.out.println("maxTrueReached: " + maxTrueReached + " h: " + h + " i: " + i);
                }
            }
        }
        if (!atLeastOneFalse) {
            System.out.println("a:\t" + a + "\tb:\t" + b + "\tc:\t" + c + "\td:\t" + d);
            return;
        }
    }

    public void lazyFindFormula(){
        int x = 10;


        for(int a=-x; a<x; a++){
            System.out.println("a = " + a);
            for(int b=-x; b<x; b++){
                System.out.println("b = " + b);
                for(int c=-x; c<x; c++){
                    for(int d=-x; d<x; d++){
                        for(int e=-x; e<x; e++){
                            for(int f=-x; f<x; f++){
                                for(int g=-x; g<x; g++){
                                    for(int h=1; h<x; h++){
                                        for(int i=1; i<x; i++){
                                            runStupidLogic(a,b,c,d,e,f,g,h,i);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("max reached = " + maxTrueReached);
    }
}
