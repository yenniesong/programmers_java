class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        // 문자열의 최소 길이 구하기.
        int minLength = Math.min(str1.length(), str2.length());
        
        // 최소길이 만큼 for문 실행.
        for(int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            // String.valueOf()로 char -> String 타입으로 형변환.
            answer += String.valueOf(c1) + String.valueOf(c2);
        }
        return answer;
    }
}