package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
		int[] lottoNumbers = new int[6];
		
		for(int i = 0 ; i < lottoNumbers.length; i++) {
			
			while(true) {
				
				int lottoNumber = (int)(Math.random()*45+1);
				
				boolean isDuplicateOk = true;
				
				for(int num : lottoNumbers) {
					if(num == lottoNumber) {
						isDuplicateOk = false;
						break;
					}
				}
				if(isDuplicateOk) {
					lottoNumbers[i] = lottoNumber;
					break;
				}	
			}
		}
		
//		for(int num : lottoNumbers) {
//			System.out.println(num);
//		}   => 코드 맞게 짰나 모르나 확인용
		
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
				else if(!isDupliOk) {
					System.out.println("중복된 숫자입니다.");
				}
				else {
					System.out.println("범위안의 숫자를 입력하세요.");
				}
			}		
		}
		
		int sameNumberCount = 0;
		
//		내입력:1,2,3,4,5,6    당첨:4,5,6,7,8,9  
//		1,4 1,5 1,6 ... = 바쁜 반복 j
//		1-2-3--4-...    = 덜 바쁜 반복 i
//		for(int i = 0 ; i < myLottoNumbers.length; i++ ) {
//			for(int j= 0 ; j < lottoNumbers.length; j++) {
//				
//				if(myLottoNumbers[i] == lottoNumbers[j]) {
//					sameNumber++;
//				}
//			}
//		}   -> 로또게임에서 위치는 상관없어서 굳이 i,j 반복문 안써도 됨
		
		for(int num : myLottoNumbers) {
			for(int lottoNum : lottoNumbers) {
				if(num == lottoNum) {
					sameNumberCount++;
				}
			}
		}
		
		if(sameNumberCount==6) {
			System.out.println("1등");
		}
		else if(sameNumberCount==5) {
			System.out.println("3등");
		}
		else if(sameNumberCount==4) {
			System.out.println("4등");
		}
		else if(sameNumberCount==3) {
			System.out.println("5등");
		}
		else {
			System.out.println("낙첨");
		}		
	}
}
