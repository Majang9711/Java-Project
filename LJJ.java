package leeJeongGin;
import java.util.Scanner;

import java.util.Scanner;

public class LJJ {

	public static void main(String[] args) {
		
		double FirstMessage;
		double RatioMessage;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i>=0; i++)
		{
			System.out.println("---------------------------------------");
			System.out.println("등비급수의  합을 구하는 프로그램을 시작합니다!");
			
			System.out.println("[시스템] 첫째항을 입력 해주세요");
			
			FirstMessage = scan.nextDouble();
			
			System.out.println("[시스템] 공비를 입력 해주세요.");
			
			RatioMessage = scan.nextDouble();
			
			if( RatioMessage > -1 && RatioMessage < 1)//수렴하는지 조건 검사
			{
				//수렴조건이 만족 할 때,,
				System.out.println("[시스템] 결과는 "+FirstMessage/(1-RatioMessage));
				System.out.println("---------------------------------------");
				
			}	
			else
			{
				//발산할 때,,
				System.out.println("[시스템] |r| < 1 수렴 조건 만족 하지 않아 이 등비급수는 발산합니다. 즉 합을 구하지 못합니다.");
				System.out.println("---------------------------------------");
			}
			
		  }

	}

}
