package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count_game = 0;
		int count_out = 0;
		
		int[] ball = new int[3];//����
		for (int i = 0; i < ball.length; i++) {
			ball[i] = r.nextInt();			
		}
		
		int[] my_ball = new int[3];//�Է�
		for (int i = 0; i < my_ball.length; i++) {
			my_ball[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < my_ball.length; i++) {
			if(ball[i] != my_ball[i]) {
				break;
			}
			count++;
		}
		
		if(count != 3) {
			System.out.println("�ƿ�!");
			count_game++;
			count_out++;
		}else {//���⼭���� ���� ���� �´��� �Ǻ� ������.
			
		}
		
		System.out.println("���� ����� ���� Ƚ���� " + count_game);
		
	}
}
