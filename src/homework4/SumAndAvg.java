package homework4;

import java.util.Scanner;

public class SumAndAvg {
	
	String inputNum;
	int sum=0, cnt=0;
	double avg = 0.0;
	Scanner s = new Scanner(System.in);
	
	void input(){
		do {
			System.out.println("숫자를 입력(Q: 종료)");
			this.inputNum = s.nextLine();
			if(this.inputNum.equals("Q") || this.inputNum.equals("q"))
				break;
			
			sum += Integer.parseInt(inputNum);
			cnt++;
			avg = (double)sum / (double)cnt;
			
		}
		while (true);
		
		System.out.printf("총 합계는  %d이며, 평균은 %.2f입니다.\n",sum, avg);
		
		return;
	}
}
