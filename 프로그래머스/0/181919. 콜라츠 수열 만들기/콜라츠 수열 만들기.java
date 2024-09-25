import java.util.*;

class Solution {
    // public int[] solution(int n) {
    public List solution(int n) {
        // int[] answer = {};
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(n);
                
        while(n != 1) { // 1이 아니면 계속 루프를 돈다.
            if(n % 2 == 0) {
                n /= 2;
                answer.add(n);
            } else {
                n = n * 3 + 1;
                answer.add(n);
            }
            
        }
        
        return answer;
    }
}