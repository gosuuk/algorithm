import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
    
        String answer = "";
        String []res =new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            res[i]=String.valueOf(numbers[i]);
          
        }
        Arrays.sort(res, (a,b)->{
            return (a+b).compareTo(b+a);
        }
        );
        
       //정렬한 값 더하기
       
        for(int i=numbers.length-1; i>=0; i--){
            answer+=res[i];
        }
        if(answer.charAt(0)=='0') return "0";
        
        return answer;
    }
}