class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        // 음료수 값은 먹은 음료수에서 (먹은 꼬치 수 / 10)를 빼야하기 때문에
        // 먹은 꼬치 수 n에 12000을 곱한 값에 (먹은 음료수 - (먹은 꼬치 수 / 10))에 2000원을 곱한값을 더해준다.
        answer = (n * 12000) + ((k - (n / 10)) * 2000);
        
        return answer;
    }
}