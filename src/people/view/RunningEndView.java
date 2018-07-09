package people.view;

import java.util.ArrayList;

import people.domain.FareDTO;
import people.domain.PeopleDTO;

public class RunningEndView {

	// 전체를 출력
	public static void peopleListView(ArrayList<PeopleDTO> all) {
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i) != null) {
				System.out.println(all.get(i).toString());
			}
		}
	}
	
	// 전체를 출력
	public static void FareListView(ArrayList<FareDTO> all) {
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i) != null) {
				System.out.println(all.get(i).toString());
			}
		}
	}

	// 데이터가 null인 경우 단순 메세지 출력

	// 데이터가 peopleDTO인 경우 해당 데이터 내용 출력
	public static void printOne(PeopleDTO one) {
		System.out.println(one.toString());
	}
	
	//Fare 하나 출력
	
	public static void printOne2(FareDTO one) {
		System.out.println(one.toString());
	}

	public static void printMsg() {
		System.out.println("요청하신 정보가 미 존재합니다.");
	}

	public static void printMsg(String msg) {
		System.out.println(msg);
	}

}
