package homework4;

import java.util.*;

public class SumOfNumbers {
	
	String inputNum;
	int sum;
	Scanner s = new Scanner(System.in);
	
	void input(){
		do {
			System.out.println("마지막 수를 입력(Q: 종료)");
			this.inputNum = s.nextLine();
			if(this.inputNum.equals("Q") || this.inputNum.equals("q"))
				break;
			
			for(int i = 0; i <= Integer.parseInt(inputNum); i++)
				sum += i;
			
			System.out.println("총 합은 " + sum + "입니다.");
			sum = 0;
		}
		while (true);
		
		return;
	}
}
