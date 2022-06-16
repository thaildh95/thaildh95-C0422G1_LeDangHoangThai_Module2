package ss8_clean_code.bai_tap;

public class TennisGame {final static int LOVE = 0;
    final static int FIFTEEN = 1;
    final static int THIRTY = 2;
    final static int FORTY = 3;

    public static String getDeuceScore(int score) {
        switch (score) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";

            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String getFinishScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            return "Advantage " + player1Name;
        } else if (minusResult == -1) {
            return "Advantage " + player2Name;
        } else if (minusResult >= 2) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    public static String unequalScore(int player1Score, int player2Score) {
        int tempScore;
        StringBuilder score = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                score.append("-");
                tempScore = player2Score;
            }
            switch (tempScore) {
                case LOVE: score.append("Love");
                    break;
                case FIFTEEN: score.append("Fifteen");
                    break;
                case THIRTY: score.append("Thirty");
                    break;
                case FORTY: score.append("Forty");
                    break;
            }
        }
        return score.toString();
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score;
        boolean isDeuce = player1Score == player2Score;
        if (isDeuce) {
            score = getDeuceScore(player1Score);
        } else if (player1Score > FORTY || player2Score > FORTY) {
            score = getFinishScore(player1Name, player2Name, player1Score, player2Score);
        } else {
            score = unequalScore(player1Score, player2Score);
        }
        return score;
    }
}
