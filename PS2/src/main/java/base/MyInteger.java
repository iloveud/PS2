package base;

import java.util.Scanner;

public class MyInteger {

		private int iValue;

		private boolean isEven(){
			if (iValue%2 == 0) {
				return true;
			}
			else {
				return false;
			}
		}
			
		private boolean isOdd(){
			if (iValue%2 == 1){
				return true;
			}
			else {
				return false;
			}
		}
		
		private boolean isPrime(int a){
			for (int i = 2;i < iValue;){
				a = iValue%i;
				i=i+1;
				}
				if (a == 0){
					return false;
				}
				else{
					return true;
				}
				}
		
	}
			
	