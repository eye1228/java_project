package com.ict03.class02;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int game = 1;
		
		while(game == 1) {
			System.out.print("�ϳ��� ���ÿ� : ����(0) ����(1) ��(2) >>>");
			int rcp = sc.nextInt();
			
			
			int c_rcp = r.nextInt(3);
			
			
			if(rcp == c_rcp) {
				System.out.println("���º� �Դϴ�.");
			}else if((rcp == 0 && c_rcp == 2) || (rcp == 1 && c_rcp == 0) || 
					(rcp == 2 && c_rcp == 1)) {
				System.out.println("����� �¸� �Դϴ�.");
			}else if((rcp == 0 && c_rcp == 1) || (rcp == 1 && c_rcp == 2) || 
					(rcp == 2 && c_rcp == 0)){
				System.out.println("����� �й� �Դϴ�.");
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			System.out.print("��� �ϽÁٽ��ϱ�? yes(1), no(2) >>> ");
			game = sc.nextInt();
		}	
	}
}


