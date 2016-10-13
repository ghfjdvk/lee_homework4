package homework4;

import java.util.*;

public class GuGuDan2 {
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
			System.out.println("E,e:짝수단, O,o:홀수단  (Q: 종료) : ");
			this.inputNum = s.nextLine();
			if(this.inputNum.equals("Q") || this.inputNum.equals("q"))
				break;
			else if(isNumber(inputNum)){
				System.out.println("E(또는 e), O(또는 o)만 입력해주세요.");
				continue;
			}
			if(this.inputNum.equals("E") || this.inputNum.equals("e")){
			for(int i = 1; i < 10; i++){
						System.out.print(2 + " * " + i + " = " + 2*i + "\t");
						System.out.print(4 + " * " + i + " = " + 4*i + "\t");
						System.out.print(6 + " * " + i + " = " + 6*i + "\t");
						System.out.print(8 + " * " + i + " = " + 8*i + "\t");
						System.out.println();
				}
			}
			else if(this.inputNum.equals("O") || this.inputNum.equals("o")){
				for(int i = 1; i < 10; i++){
					System.out.print(3 + " * " + i + " = " + 3*i + "\t");
					System.out.print(5 + " * " + i + " = " + 5*i + "\t");
					System.out.print(7 + " * " + i + " = " + 7*i + "\t");
					System.out.print(9 + " * " + i + " = " + 9*i + "\t");
					System.out.println();
				}
			}
			else{
				System.out.println("E(또는 e), O(또는 o)만 입력해주세요.");
				continue;
			}
			
		}
		while (true);
		
		return;
	}
}
