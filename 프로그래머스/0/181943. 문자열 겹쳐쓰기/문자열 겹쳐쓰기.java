class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // 1. my_string의 처음부터 s 위치까지 자르고, overwrite_string을 이어 붙인다.
        String answer = my_string.substring(0, s) + overwrite_string;
        
        // 2. 만약 원래 문자열 길이가 덮어쓴 문자열의 길이보다 길다면, 나머지 부분을 추가한다.
        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        
        // 3. 결과 문자열을 반환한다.
        return answer;
    }
}