package tw.com.google.www.Math_100;

import java.util.Scanner;

public class ���r�� {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�п�J���r���");
		
		d = input.nextInt();
					
		for(a=1 ; a<=d ; a++){
		//�~�h�j�鱱���
			
			for(b=1 ; b<=d-a ; b++){
						
			//�ھڥ~�h�渹�A��X�P������Ů�C
				
				System.out.print(" ");
			}
			
				for(c=1 ; c<=2*a-1 ; c++){
				//�ھڥ~�h�渹�A��X�P���ӼơC
					
					System.out.printf("*");
									
				}
				
				System.out.printf("\n");				
			}

		}

	}
