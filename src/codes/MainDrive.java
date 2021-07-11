package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
		int[] myLottoNumbers = new int[6];
		
		Scanner myScan = new Scanner(System.in);
		
		for(int i = 0 ; i < myLottoNumbers.length; i++) {
			
			while(true) {
				
//				System.out.print(i + "번째 숫자를 입력하세요 : ");   -> i번째 하면 i가 0일떄 0번째 숫자라고 나옴!
				System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
				int inputNumber = myScan.nextInt();
				
				boolean isRangeOk = (1 <= inputNumber) && (inputNumber <= 45);
				boolean isDupliOk = true;
				
				for(int num : myLottoNumbers) {
					if(num == inputNumber) {
						isDupliOk = false;
						break;
					}
				}
				
				if(isDupliOk && isRangeOk) {
					myLottoNumbers[i] = inputNumber;
					break;
				}				
			}		
		}
	}
}
