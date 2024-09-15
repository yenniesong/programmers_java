class Solution {
    public int[] solution(int[] num_list) {
        // int[] answer = {};
        // 새로운 배열 생성(기존 배열 + 1)
        int[] answer = new int[num_list.length + 1];
        
        int lastElement = num_list[num_list.length - 1];    // 가장 마지막 원소
        int secLastElement = num_list[num_list.length - 2]; // 마지막 원소의 앞 원소
        int newElement;
        
        if(lastElement > secLastElement) {
            newElement = (lastElement - secLastElement);
        } else {
            newElement = (lastElement * 2);
        }
               
        // 기존 배열을 새로운 배열에 복사
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        // 새로운 배열 마지막에 결과 값 추가
        answer[num_list.length] = newElement;
        
        return answer;
    }
}