package people.view;

import java.util.ArrayList;

import people.domain.FareDTO;
import people.domain.PeopleDTO;

public class RunningEndView {

	// ��ü�� ���
	public static void peopleListView(ArrayList<PeopleDTO> all) {
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i) != null) {
				System.out.println(all.get(i).toString());
			}
		}
	}
	
	// ��ü�� ���
	public static void FareListView(ArrayList<FareDTO> all) {
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i) != null) {
				System.out.println(all.get(i).toString());
			}
		}
	}

	// �����Ͱ� null�� ��� �ܼ� �޼��� ���

	// �����Ͱ� peopleDTO�� ��� �ش� ������ ���� ���
	public static void printOne(PeopleDTO one) {
		System.out.println(one.toString());
	}
	
	//Fare �ϳ� ���
	
	public static void printOne2(FareDTO one) {
		System.out.println(one.toString());
	}

	public static void printMsg() {
		System.out.println("��û�Ͻ� ������ �� �����մϴ�.");
	}

	public static void printMsg(String msg) {
		System.out.println(msg);
	}

}
