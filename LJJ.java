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
			System.out.println("���޼���  ���� ���ϴ� ���α׷��� �����մϴ�!");
			
			System.out.println("[�ý���] ù°���� �Է� ���ּ���");
			
			FirstMessage = scan.nextDouble();
			
			System.out.println("[�ý���] ���� �Է� ���ּ���.");
			
			RatioMessage = scan.nextDouble();
			
			if( RatioMessage > -1 && RatioMessage < 1)//�����ϴ��� ���� �˻�
			{
				//���������� ���� �� ��,,
				System.out.println("[�ý���] ����� "+FirstMessage/(1-RatioMessage));
				System.out.println("---------------------------------------");
				
			}	
			else
			{
				//�߻��� ��,,
				System.out.println("[�ý���] |r| < 1 ���� ���� ���� ���� �ʾ� �� ���޼��� �߻��մϴ�. �� ���� ������ ���մϴ�.");
				System.out.println("---------------------------------------");
			}
			
		  }

	}

}
