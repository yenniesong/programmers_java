class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 1; i < numLog.length; i++) {
            int j = numLog[i] - numLog[i-1];
            switch(j) {
                case 1 : answer.append("w");
                    break;
                case -1 : answer.append("s");
                    break;
                case 10 : answer.append("d");
                    break;
                case -10 : answer.append("a");
                    break;  
            }
            
        }
        
        return answer.toString();
    }
}

// 세가지 방법으로 비교해서 풀이해 보겠습니다.
// 처음 for문을 이용하여 0번부터 시작하는 배열을 1번부터 시작하게 하여 그 전 값을 뺀 값이 1, -1, 10, -10인지 if문을 사용하여 비교 후 w, s, d, a를 answer에 하나씩 저장하게 했습니다.
// 하지만 다른 사람 풀이를 보고 switch문을 사용하는게 더 좋은  방법이지 않을까 싶어 switch문 풀이도 가져와 봤습니다.
// 여기서 switch문과 if문의 비교와 switch문에서 String과 StringBuilder를 비교하려고 합니다.
// 풀이를 설명하자면
// 똑같이 for문을 이용해 배열을 순회합니다. 1번부터 끝까지
// 정수로 변수를 선언하고 그 변수에 현재 값과 그 전 값을 뺸 수를 저장합니다.
// 이제 switch문으로 그 저장된 값이 1, -1, 10, -10에 따라 값을 저장하게 하면 됩니다.
// 성능은 switch - StringBuilder -> if - StringBuilder -> switch - String 이렇게 확인했습니다.