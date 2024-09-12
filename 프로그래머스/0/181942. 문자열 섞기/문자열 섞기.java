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

// 다른 방법의 풀이 (공부하면 좋을 코드)
// class Solution {
//     public String solution(String str1, String str2) {
        
//         String answer = "";
//         for(int i = 0; i < str1.length(); i++){
//             answer += String.valueOf(str1.charAt(i)) + str2.charAt(i);
//         }
        
//         return answer;
//     }
// }

// .split() 사용
// class Solution {
//     public String solution(String str1, String str2) {
    
//         StringBuilder sb = new StringBuilder();

//         String[] str1arr = str1.split("");
//         String[] str2arr = str2.split("");
        
//         for (int i=0; i < str1.length(); i++) {
//             answer += str1arr[i]+str2arr[i];
//         }

//         return sb.toString();
//     }
// }
// .toCharArray() 사용
// class Solution {
//     public String solution(String str1, String str2) {
    
//     	StringBuilder sb = new StringBuilder();
        
//         char[] chars1 = str1.toCharArray();
//         char[] chars2 = str2.toCharArray();

//         for (int i=0; i<chars1.length; i++) {
//             sb.append(chars1[i]).append(chars2[i]);
//         }

//         return sb.toString();
//     }
// }
