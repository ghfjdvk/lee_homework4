package homework4;

import java.util.Scanner;

public class GuGuDan {

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
	
	String inputNum;
	int max=0, min=100;
	int temp;
	Scanner s = new Scanner(System.in);
	
	void input(){
		do {
			System.out.println("출력하고 싶은 단  (Q: 종료) : ");
			this.inputNum = s.nextLine();
			if(this.inputNum.equals("Q") || this.inputNum.equals("q"))
				break;
			else if(!isNumber(inputNum) || Integer.parseInt(this.inputNum)>9 || Integer.parseInt(this.inputNum)<2)
			{
				System.out.println("2에서 9 사이의 숫자만 입력하셔야 합니다.");
				continue;
			}
			for(int i = 1; i < 10; i++)
				System.out.println(Integer.parseInt(this.inputNum) + " * " + i + " = "+Integer.parseInt(this.inputNum) * i);
		}
		while (true);
		
		return;
	}
}
