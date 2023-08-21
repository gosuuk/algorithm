import java.util.*;

class Solution {
    public String solution(String s) {
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Collections.min(list)).append(" ").append(Collections.max(list));

        return sb.toString();
    }
}