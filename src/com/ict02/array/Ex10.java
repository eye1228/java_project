package com.ict02.array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//��ȣ ���� ���� ���� ���� �Է� �ޱ�
		//��ȣ ���� ��� ���� ���� ���ϰ� ����(���� �������� ����)
		
		int[][] arr = new int[5][5];
		
		int kor;
		int eng;
		int math;
		
		System.out.println("5���� �л����� ������ �Է��϶�.");
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print("���� : ");
			kor = sc.nextInt();
			System.out.print("���� : ");
			eng = sc.nextInt();
			System.out.print("���� : ");
			math = sc.nextInt();
			arr[i][0] = i + 1;
			arr[i][1] = kor + eng + math;
			arr[i][2] = (int)(arr[i][1] / 3 * 10.0) / 10;
			if(arr[i][2] >= 90) {
				arr[i][3] = 'A';
			} else if(arr[i][2] >= 80){
				arr[i][3] = 'B';
			} else if(arr[i][2] >= 70){
				arr[i][3] = 'C';
			} else {
				arr[i][3] = 'F';
			}
			arr[i][4] = 1;
		}
		//����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][1] > arr[j][1] && i != j)
				{
					arr[j][4]++;
				}
			}			
		}
		
		
		
		
		
		
		
		
		
		//����
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][4] < arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}			
		}
		System.out.println("�� ȣ\t�� ��\t�� ��\t�� ��\t�� ��");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3)
				{
					System.out.print((char)arr[i][j] + "\t");
				}else {
					System.out.print(arr[i][j] + "\t");	
				}				
			}			
			System.out.println();
		}
	}
}
