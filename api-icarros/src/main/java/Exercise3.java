
public class Exercise3 {

    public static void main(String[] args) {
        String[] moments = new String[5];
        moments[0] = "12:12";
        moments[1] = "11:22";
        moments[2] = "12:21";
        moments[3] = "11:11";
        moments[4] = "15:38";
        System.out.println(countClockWhistles(moments));
    }

    private static int countClockWhistles(String[] moments) {
        int totalWatchWhistles = 0;
        for (String moment : moments) {
            if (isValidMoment(moment) && isCreepyMoment(moment)) {
                totalWatchWhistles++;
            }
        }
        return totalWatchWhistles;
    }

    private static boolean isValidMoment(String moment) {
        return moment != null && moment.length() == 5 && moment.split(":").length == 2;
    }

    private static boolean isCreepyMoment(String moment) {
        String firstHourPosition = String.valueOf(moment.charAt(0));
        String secondHourPosition = String.valueOf(moment.charAt(1));
        String firstMinutePosition = String.valueOf(moment.charAt(3));
        String secondMinutePosition = String.valueOf(moment.charAt(4));
        return isFormattedAsABAB(firstHourPosition, secondHourPosition, firstMinutePosition, secondMinutePosition)
                || isFormattedAsAABB(firstHourPosition, secondHourPosition, firstMinutePosition, secondMinutePosition)
                || isFormattedAsABBA(firstHourPosition, secondHourPosition, firstMinutePosition, secondMinutePosition)
                || isFormattedAsAAAA(firstHourPosition, secondHourPosition, firstMinutePosition, secondMinutePosition);
    }

    private static boolean isFormattedAsABAB(String firstHourPosition, String secondHourPosition, String firstMinutePosition, String secondMinutePosition) {
        return !firstHourPosition.equals(secondHourPosition)
                && firstHourPosition.equals(firstMinutePosition)
                && !firstHourPosition.equals(secondMinutePosition)
                && !secondHourPosition.equals(firstMinutePosition)
                && secondHourPosition.equals(secondMinutePosition)
                && !firstMinutePosition.equals(secondMinutePosition);
    }

    private static boolean isFormattedAsAABB(String firstHourPosition, String secondHourPosition, String firstMinutePosition, String secondMinutePosition) {
        return firstHourPosition.equals(secondHourPosition)
                && !firstHourPosition.equals(firstMinutePosition)
                && !firstHourPosition.equals(secondMinutePosition)
                && !secondHourPosition.equals(firstMinutePosition)
                && !secondHourPosition.equals(secondMinutePosition)
                && firstMinutePosition.equals(secondMinutePosition);
    }

    private static boolean isFormattedAsABBA(String firstHourPosition, String secondHourPosition, String firstMinutePosition, String secondMinutePosition) {
        return !firstHourPosition.equals(secondHourPosition)
                && !firstHourPosition.equals(firstMinutePosition)
                && firstHourPosition.equals(secondMinutePosition)
                && secondHourPosition.equals(firstMinutePosition)
                && !secondHourPosition.equals(secondMinutePosition)
                && !firstMinutePosition.equals(secondMinutePosition);
    }

    private static boolean isFormattedAsAAAA(String firstHourPosition, String secondHourPosition, String firstMinutePosition, String secondMinutePosition) {
        return firstHourPosition.equals(secondHourPosition)
                && secondHourPosition.equals(firstMinutePosition)
                && firstMinutePosition.equals(secondMinutePosition);
    }
}
