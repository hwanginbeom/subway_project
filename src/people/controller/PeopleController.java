package people.controller;

import people.Model.PeopleModel;
import people.domain.FareDTO;
import people.domain.PeopleDTO;
import people.view.RunningEndView;

public class PeopleController {

	static PeopleModel peopleData = PeopleModel.getInstance();

	// 전체 출력
	public static void all() {

		RunningEndView.peopleListView(PeopleModel.getAllpeople()); // DTO객체들을 가져와서
	}
	public static void allFare() {

		RunningEndView.FareListView(PeopleModel.getAllFarepeople()); // DTO객체들을 가져와서
	}
	

	// 하나 출력
	public static void getpeople(int year) {
		PeopleDTO one = PeopleModel.getpeople(year);
		if (one != null) { // 검색 된 데이터가 존재 할 경우 true
			RunningEndView.printOne(one);
		} else {
			RunningEndView.printMsg();
		}
	}
	
	//Fare 출력
	
	public static void getFare(int year) {
		FareDTO one = PeopleModel.getFarePeople(year);
		if (one != null) { // 검색 된 데이터가 존재 할 경우 true
			RunningEndView.printOne2(one);
		} else {
			RunningEndView.printMsg("해당 데이터는 존재하지 않습니다.");
		}
	}

	// 데이터 추가
	public static void addpeople(PeopleDTO newDTO) {
		PeopleModel.peopleAdd(newDTO);
		RunningEndView.printMsg("역 관련 추가 데이터 삽입 완료");
	}
	
	public static void addFare(FareDTO newDTO) {
		PeopleModel.fareAdd(newDTO);
		RunningEndView.printMsg("연도 관련 세금 데이터 삽입 완료");
	}

	// 삭제

	public static void peopleDelete( int year) {
		boolean result = PeopleModel.peopleDelete(year);
		if (result) {
			RunningEndView.printMsg("삭제 성공");
		}
		else {
			RunningEndView.printMsg("삭제 실패");

		}
		
	}
	
	
	// fare삭제

	public static void fareDelete( int year) {
		boolean result = PeopleModel.fareDelete(year);
		if (result) {
			RunningEndView.printMsg("삭제 성공");
		}
		else {
			RunningEndView.printMsg("삭제 실패");

		}
		
	}

	// 업데이트

	public static void peopleUpdate( int year ,PeopleDTO people) {
		boolean result = PeopleModel.peopleUpdate(year,people);
		if (result) {
			RunningEndView.printMsg("수정 성공");
		}
		else {
			RunningEndView.printMsg("수정 실패");

		}
	}
	
	// Fare업데이트

	public static void fareUpdate( int year , FareDTO people) {
		boolean result = PeopleModel.fareUpdate(year, people);
		if (result) {
			RunningEndView.printMsg("수정 성공");
		}
		else {
			RunningEndView.printMsg("수정 실패");

		}
	}
}
