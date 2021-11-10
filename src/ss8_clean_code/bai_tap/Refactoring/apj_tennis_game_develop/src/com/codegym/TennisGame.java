package ss8_clean_code.bai_tap.Refactoring.apj_tennis_game_develop.src.com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String score = "";
        int tempScore=0;
        boolean hoa = playerScore1 == playerScore2;
        boolean danTruoc = (playerScore1 >= 4 || playerScore2 >= 4);
        if (hoa)
        {
            score = goiTiNguoiChoi(playerScore1);
        }
        else if (danTruoc)
        {
            score = tiSoCuoiGame(playerScore1, playerScore2);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = playerScore1;
                else { score+="-"; tempScore = playerScore2;}
                score = goiTiSoGame(score, tempScore);
            }
        }
        return score;
    }

    private static String goiTiSoGame(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                score+="Love";
                break;
            case 1:
                score+="Fifteen";
                break;
            case 2:
                score+="Thirty";
                break;
            case 3:
                score+="Forty";
                break;
        }
        return score;
    }

    private static String tiSoCuoiGame(int playerScore1, int playerScore2) {
        String score;
        int minusResult = playerScore1-playerScore2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String goiTiNguoiChoi(int playerScore1) {
        String score;
        switch (playerScore1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }


}