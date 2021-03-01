import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {
        Integer[] wins = new Integer[3];
        Integer[] ties = new Integer[3];
        wins[0] = 1;
        wins[1] = 2;
        wins[2] = 3;
        ties[0] = 2;
        ties[1] = 3;
        ties[2] = 0;
        System.out.println(countChampionPoint(wins, ties));
    }

    private static int countChampionPoint(Integer[] wins, Integer[] ties) {
        List<Integer> teamScore = new ArrayList<Integer>();
        calculateScoreByTeam(wins, ties, teamScore);
        return findChampionScore(teamScore);
    }

    private static void calculateScoreByTeam(Integer[] wins, Integer[] ties, List<Integer> teamScore) {
        for (int i = 0; i < wins.length; i++) {
            teamScore.add(wins[i] * 3 + ties[i]);
        }
    }

    private static Integer findChampionScore(List<Integer> teamScore) {
        return Collections.max(teamScore);
    }

}
