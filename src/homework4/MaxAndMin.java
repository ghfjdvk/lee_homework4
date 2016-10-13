package homework4;

import java.util.*;

public class MaxAndMin {
	String inputNum;
	int max=0, min=100;
	int temp;
	Scanner s = new Scanner(System.in);
	
	void input(){
		do {
			System.out.println("0~100 사이의 숫자를 입력(Q: 종료)");
			this.inputNum = s.nextLine();
			if(this.inputNum.equals("Q") || this.inputNum.equals("q"))
				break;
			else if(Integer.parseInt(this.inputNum)>100 || Integer.parseInt(this.inputNum)<0)
			{
				System.out.println("0에서 100 사이의 숫자만 입력하셔야 합니다.");
				continue;
			}
			
			if(Integer.parseInt(this.inputNum)>= max)
				max = Integer.parseInt(this.inputNum);
			if(Integer.parseInt(this.inputNum)<= min)
				min = Integer.parseInt(this.inputNum);	
		}
		while (true);
		if(max!=0 && min!=100)
			System.out.println("가장 큰 수는 " + max + "이고, 작은 수는 " + min + "입니다.");
		return;
	}
}
