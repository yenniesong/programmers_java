class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(c == '1') {
                mode = 1 - mode;
            } else if(i % 2 == mode) {
                ret += c;
            } 
        }
        
        if(ret.equals("")) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}

//     class Solution {
//     public String solution(String code) {
//         String answer = "";
//         int mode = 0;
//         for (int i = 0; i < code.length(); i++) {
//             if (code.charAt(i) == '1') mode = 1 - mode;
//             else if (i % 2 == mode) answer += code.charAt(i);
//         }
//         return "".equals(answer) ? "EMPTY" : answer;
//     }
// }
// if (code.charAt(i) == '1') mode = 1 - mode;
// 현재 문자가 '1'인 경우 모드를 토글합니다. 즉, 0은 1로, 1은 0으로 바뀝니다.

// else if (i % 2 == mode) answer += code.charAt(i);
// 현재 문자가 '1'이 아니고, 모드에 따라 문자를 선택해야 하는 경우, answer에 현재 문자를 추가합니다. 모드 값과 인덱스의 홀짝 여부를 비교하여 문자 선택 규칙을 적용합니다.

// return "".equals(answer) ? "EMPTY" : answer;
// 결과 문자열이 비어있는 경우 "EMPTY"를 반환하고, 그렇지 않은 경우 결과 문자열을 반환합니다.