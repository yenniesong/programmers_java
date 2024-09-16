class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<=e; j++) {
                if(j % k == 0) {// arr[j]를 넣으면 변한 값에 계속 반복이라 결과값 다르게 나옴
                    arr[j] += 1;
                }
            } 
        }
        
        // answer = Arrays.copyOf(arr, arr.length); // Arrays.copyOf()로 배열 복사
        
        return arr;
    }
}