package homework4;

import java.util.*;

public class ExamForWhile {

	public static boolean isNumber(String str) {
	        if(str==null || str.equals(""))
	            return false;
	    
	        for(int i=0; i<str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            if(ch<'0' || ch>'9') {
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static void main(String[] args){
		String selected;
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("1. 1부터 입력한 수까지 더하기");
			System.out.println("2. 최대값/최소값 구하기");
			System.out.println("3. 입력받은 숫자의 합계와 평균 구하기");
			System.out.println("4. 원하는 구구단 출력하기");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 프로그램 종료");
			System.out.println("원하는 메뉴는 >> ");
			selected = s.nextLine();
			if(!isNumber(selected) || Integer.parseInt(selected) > 6 || Integer.parseInt(selected) < 1){
				System.out.println("잘못 입력하셨습니다. 다시 입력 바랍니다.");
				continue;
			}
			if(Integer.parseInt(selected) == 1)
				new SumOfNumbers().input();
			else if(Integer.parseInt(selected) == 2)
				new MaxAndMin().input();
			
			else if(Integer.parseInt(selected) == 3)
				new SumAndAvg().input();
			
			else if(Integer.parseInt(selected) == 4)
				new GuGuDan().input();
			else if(Integer.parseInt(selected) == 5)
				new GuGuDan2().input();
			else if(Integer.parseInt(selected) == 6){
				System.out.println("프로그램을 종료합니다.");
				s.close();
				System.exit(0);
			}
			
		} while(true);
	}
}
