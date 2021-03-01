
public class Exercise2 {

    public static void main(String[] args) {
        String[] marvinsResult = new String[10];
        marvinsResult[0] = "---";
        marvinsResult[1] = "*--";
        marvinsResult[2] = "**-";
        marvinsResult[3] = "***";
        marvinsResult[4] = "***";
        marvinsResult[5] = "**-";
        marvinsResult[6] = "*-";
        marvinsResult[7] = "---";
        marvinsResult[8] = "---";
        marvinsResult[9] = "**-";
        System.out.println(calculateTotalStars(marvinsResult));
    }

    private static int calculateTotalStars(String[] result) {
        int totalStars = 0;
        for (String stage : result) {
            if (stage != null) {
                totalStars += countStarsByStage(stage);
            }
        }
        return totalStars;
    }

    private static int countStarsByStage(String stage) {
        return stage.replace("-", "").length();
    }
}
