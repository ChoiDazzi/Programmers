class Solution {
    public int[] solution(int start, int end_num) {
        int length = start-end_num+1;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = start;
            
            start--;
        }
        
        return answer;
    }
}