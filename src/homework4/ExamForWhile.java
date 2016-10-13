package homework4;

import java.util.*;

public class ExamForWhile {

	public static void main(String[] args){
		int selected;
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("1. 1부터 입력한 수까지 더하기");
			System.out.println("2. 최대값/최소값 구하기");
			System.out.println("3. 입력받은 숫자의 합계와 평균 구하기");
			System.out.println("4. 원하는 구구단 출력하기");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 프로그램 종료");
			System.out.println("원하는 메뉴는 >> ");
			selected = s.nextInt();
			if(selected == 1)
				new SumOfNumbers().input();
			/*else if(selected == 2)
				new MaxAndMin().input();
			else if(selected == 3)
				new SumAndAvg().input();
			else if(selected == 4)
				new GuGuDan().input();
			else if(selected == 5)
				new GuGuDan2().input();
			*/
			else if(selected == 6){
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			else
				System.out.println("잘못 입력하셨습니다. 다시 입력 바랍니다.");
		} while(selected != 6);
	}
}
