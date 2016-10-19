package tw.com.google.www.Math_100;

import java.util.Scanner;

public class 金字塔 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入金字塔數");
		
		d = input.nextInt();
					
		for(a=1 ; a<=d ; a++){
		//外層迴圈控制數
			
			for(b=1 ; b<=d-a ; b++){
						
			//根據外層行號，輸出星號左邊空格。
				
				System.out.print(" ");
			}
			
				for(c=1 ; c<=2*a-1 ; c++){
				//根據外層行號，輸出星號個數。
					
					System.out.printf("*");
									
				}
				
				System.out.printf("\n");				
			}

		}

	}
