class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder jinsu = new StringBuilder();

        while(n>0){
            jinsu.append(n%k);
            n = n/k;
        }
        jinsu=jinsu.reverse();

        String [] primeNumber = jinsu.toString().split("0");

        for(String i : primeNumber){
            if(!i.equals("") && !i.equals("1") && isPrime(Long.parseLong(i))){
                answer ++;
            }
        }
        return answer;
    }

    boolean isPrime(Long n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}