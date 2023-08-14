import java.util.*;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int matchCount = 0;
        int zeroCount = 0;

        // 직접적으로 일치하는 숫자의 수와 0의 개수를 구합니다.
        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
                continue;
            }
            for (int win_num : win_nums) {
                if (num == win_num) {
                    matchCount++;
                    break;
                }
            }
        }

        // 최고 순위와 최저 순위를 계산합니다.
        int highRank = calculateRank(matchCount + zeroCount);
        int lowRank = calculateRank(matchCount);

        return new int[] {highRank, lowRank};
    }

    // 일치하는 숫자의 수를 바탕으로 순위를 반환하는 함수입니다.
    private int calculateRank(int count) {
        switch (count) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
