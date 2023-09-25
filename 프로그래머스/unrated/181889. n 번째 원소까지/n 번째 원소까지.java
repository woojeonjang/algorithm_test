import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // int[] answer = new int[n]; 
        
        // for(int i = 0; i < answer.length; i++) {
            // answer[i] = num_list[i];
        // }
        // return answer;
        
        int[] answer = Arrays.copyOfRange(num_list, 0, n);
        return answer;
    }//main
}//class