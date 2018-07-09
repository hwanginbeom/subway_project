package people.view;

import java.util.Scanner;

import people.Model.PeopleModel;
import people.controller.PeopleController;
import people.domain.FareDTO;

public class RunningStartView {

	public static void main(String[] args) {
		PeopleModel.fareDTOadd();

		Scanner scan = new Scanner(System.in);
		int result = 0;
		int addyear = 2045;
		
		while( result != 6) {
		System.out.println("***********메뉴***********");
		System.out.println("  1 - 연도에 따른  모든 데이터 보기");
		System.out.println("  2 - 해당 연도 검색하기 ");
		System.out.println("  3 - 연도 데이터 추가하기");
		System.out.println("  4 - 해당 연도 수정하기");
		System.out.println("  5 - 해당 연도 삭제하기");
		System.out.println("  6 - 프로그램을 종료 하기");
		System.out.println();
		System.out.print(" 메뉴를 선택하세요 :  ");


		result = scan.nextInt();
		switch (result) {

		
		
		
		
		
		
		case 1: 
		
		System.out.println("*** 모든 데이터 출력 ***");
		System.out.println();
		System.out.println();

		System.out.println("*** peopleList 데이터  ***");
		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		PeopleController.all();
		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.println();
		System.out.println();


		

		System.out.println("*** peopleFare 데이터  ***");
		System.out.println("                           ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		PeopleController.allFare();
		System.out.println("                           ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		
		break;
		//검색 - id 로 검색
		case 2:
		while(result!=0) {
			System.out.println("*** 연도를 검색 하시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("*** 연도를 입력하세요 :  ");
		result = scan.nextInt();
//		PeopleController.getpeople(2020);
		PeopleController.getFare(result);
		
		}

		break;

		case 3:

//		//가입
//		PeopleDTO newOne = new PeopleDTO(2100,2020200,303,3030303,4040,1010101,40404,10101010);
//		PeopleController.addpeople(newOne);
//		PeopleController.all();
		while(result!=0) {
		System.out.println("*** 데이터를 추가 하시겠습니까? 1(yes) /0(no) ");
		result = scan.nextInt();
		if(result ==0) {
			break;
		}

		System.out.println("*** "+ addyear +"년도 세금 관련 데이터 추가 값을 넣으세요 ");
		System.out.print("할인 운임 100프로 일 때 수익 : ");
		long result100 = scan.nextInt();

		System.out.print("할인 운임 80프로 일 때 수익 : ");
		long result80 = scan.nextInt();

		System.out.print("할인 운임 50프로 일 때 수익 : ");
		long result50 = scan.nextInt();

		System.out.print("할인 운임 30프로 일 때 수익 : ");
		long result30 = scan.nextInt();

		FareDTO newOne = new FareDTO(addyear,result100,result80,result50,result30);
		addyear++;
		PeopleController.addFare(newOne);
		PeopleController.allFare();

		}

		break;

//
////
////		//수정 - 존재하는 데이터 수정 가능 , 미 존재하는 데이터 수정 시 불가 
////		/*id로 등급을 수정 
////		 * 단 , 정상 수정 ?  비 정상 수정여부에 대한 상황은 반드시 확인 가능해야함 
//////		 */
////		
//		System.out.println("***yea로 검색 ***");
//		PeopleDTO newOne3 = new PeopleDTO(21030,2020200,303,3030303,4040,1010101,40404,10101010);
//
//		PeopleController.peopleUpdate(2100, newOne3);
//		PeopleController.all();
		
		case 4:
			
		while(result!=0) {
			System.out.println("*** 데이터를 수정 하시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
				
		System.out.print("*** 수정 할 연도를 입력하세요 : ");
		int resultyear = scan.nextInt();
		
		System.out.print("할인 운임 100프로 일 때 수익 : ");
		double result100 = scan.nextInt();

		System.out.print("할인 운임 80프로 일 때 수익 : ");
		double result80 = scan.nextInt();

		System.out.print("할인 운임 50프로 일 때 수익 : ");
		double result50 = scan.nextInt();

		System.out.print("할인 운임 30프로 일 때 수익 : ");
		double result30 = scan.nextInt();
		
		FareDTO newOne2 = new FareDTO(resultyear,result100,result80,result50,result30);
		PeopleController.fareUpdate(resultyear, newOne2);
		PeopleController.getFare(resultyear);
		
			}

		break;

		
////
////		
////		//삭제 -  존재하는 데이터 삭제,  미 존재하는 데이터 삭제시도?
//		System.out.println("*** 삭제 ***");
//		PeopleController.peopleDelete(21030);
//		PeopleController.all();
//

		case 5:
		while(result!=0) {
			System.out.println("*** 데이터를 삭제 하시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("*** 삭제 할 년도를 입력하세요 : ");
		int resultyear = scan.nextInt();
		PeopleController.fareDelete(resultyear);
		PeopleController.allFare();
		}
		break;

		
		case 6:
			System.out.println();
			System.out.println("*** 프로그램이 종료 되었습니다. ***");
			break;
		}
		
	}

}
}
