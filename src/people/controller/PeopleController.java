package people.controller;

import people.Model.PeopleModel;
import people.domain.FareDTO;
import people.domain.PeopleDTO;
import people.view.RunningEndView;

public class PeopleController {

	static PeopleModel peopleData = PeopleModel.getInstance();

	// ��ü ���
	public static void all() {

		RunningEndView.peopleListView(PeopleModel.getAllpeople()); // DTO��ü���� �����ͼ�
	}
	public static void allFare() {

		RunningEndView.FareListView(PeopleModel.getAllFarepeople()); // DTO��ü���� �����ͼ�
	}
	

	// �ϳ� ���
	public static void getpeople(int year) {
		PeopleDTO one = PeopleModel.getpeople(year);
		if (one != null) { // �˻� �� �����Ͱ� ���� �� ��� true
			RunningEndView.printOne(one);
		} else {
			RunningEndView.printMsg();
		}
	}
	
	//Fare ���
	
	public static void getFare(int year) {
		FareDTO one = PeopleModel.getFarePeople(year);
		if (one != null) { // �˻� �� �����Ͱ� ���� �� ��� true
			RunningEndView.printOne2(one);
		} else {
			RunningEndView.printMsg("�ش� �����ʹ� �������� �ʽ��ϴ�.");
		}
	}

	// ������ �߰�
	public static void addpeople(PeopleDTO newDTO) {
		PeopleModel.peopleAdd(newDTO);
		RunningEndView.printMsg("�� ���� �߰� ������ ���� �Ϸ�");
	}
	
	public static void addFare(FareDTO newDTO) {
		PeopleModel.fareAdd(newDTO);
		RunningEndView.printMsg("���� ���� ���� ������ ���� �Ϸ�");
	}

	// ����

	public static void peopleDelete( int year) {
		boolean result = PeopleModel.peopleDelete(year);
		if (result) {
			RunningEndView.printMsg("���� ����");
		}
		else {
			RunningEndView.printMsg("���� ����");

		}
		
	}
	
	
	// fare����

	public static void fareDelete( int year) {
		boolean result = PeopleModel.fareDelete(year);
		if (result) {
			RunningEndView.printMsg("���� ����");
		}
		else {
			RunningEndView.printMsg("���� ����");

		}
		
	}

	// ������Ʈ

	public static void peopleUpdate( int year ,PeopleDTO people) {
		boolean result = PeopleModel.peopleUpdate(year,people);
		if (result) {
			RunningEndView.printMsg("���� ����");
		}
		else {
			RunningEndView.printMsg("���� ����");

		}
	}
	
	// Fare������Ʈ

	public static void fareUpdate( int year , FareDTO people) {
		boolean result = PeopleModel.fareUpdate(year, people);
		if (result) {
			RunningEndView.printMsg("���� ����");
		}
		else {
			RunningEndView.printMsg("���� ����");

		}
	}
}
