class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i = 0; i < included.length; i++) {
            if(included[i]) { // included 배열의 i번째 요소가 true일 때
                answer += a + i * d;    // 등차수열 계산: a + i * d
            }
        }
        return answer;
    }
}

// a는 초항,
// d는 공차,
// i는 현재 반복문의 인덱스 (0부터 시작).
// 즉, i번째 항은 a + i * d로 표현되며, 이 값들을 answer에 더하는 방식입니다. 이 구조는 등차수열의 각 항을 순차적으로 더하는 방식과 동일합니다.

// 예시
// 만약 a = 3, d = 2일 때, 배열의 길이가 5라고 가정해보면:

// i = 0: a + i * d = 3 + 0 * 2 = 3
// i = 1: a + i * d = 3 + 1 * 2 = 5
// i = 2: a + i * d = 3 + 2 * 2 = 7
// i = 3: a + i * d = 3 + 3 * 2 = 9
// i = 4: a + i * d = 3 + 4 * 2 = 11
// 이렇게 등차수열의 항을 계산하는 원리와 동일합니다.

// 결론
// answer += a + i * d;는 등차수열의 일반 항을 계산하는 공식과 같으며, a가 초항이고, i에 따라 항의 위치에 맞게 값이 계산됩니다.