package programers;

public class examString {

	public String solution(String my_string, String overwrite_string, int s) {
        String answer = ""; // 사용할 빈 문자열을 생성
        
        for(int i=0; i<s; i++) { // 시작 문자열을 덮어쓸 문자 전까지 씀
            answer += my_string.charAt(i);
        } // for
        
        int j = 0;  // overwrite_string의 시작 인덱스
        while(j<overwrite_string.length()) {  // 위에서 쓴 문자열 다음으로 이어서 들어감
            answer += overwrite_string.charAt(j);
            j++;
        } // while
        
        int k = j+s; // overwrite_string의 문자열이 끝나고부터 이어쓰기 위함.
        while(k<my_string.length()) { 
            answer += my_string.charAt(k);
            k++;
        } // while
        
        
        return answer;  // 다 쓴 값을 반환
        
        
    } // solution
    
} // end class