package people.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import people.domain.FareDTO;
import people.domain.PeopleDTO;

public class PeopleModel {

	static float fare = 1250;

	private static PeopleModel instance = new PeopleModel();

	static ArrayList<PeopleDTO> peopleList = new ArrayList<PeopleDTO>();
	static ArrayList<FareDTO> peopleFare = new ArrayList<FareDTO>();

	// step03 - file로부터 read해서 출력

	// split 메소드를 이용해서, data에 있는 정보들을 나눠서 개수를 확인해봐라

	// read 객체
	static BufferedReader in = null;

	// data.txt 파일에 2byte로 출력
	static BufferedWriter out = null;
	static {
		try {
			in = new BufferedReader(new FileReader("people3.csv"));
			out = new BufferedWriter(new FileWriter("peopledata1.txt")); // Buffering기능을 쓰면서 2byte 출력 가능 생성(초기화)
			String data = in.readLine();
			data = in.readLine();
			String[] splitData = data.split(",");
			while (data != null) {
				// System.out.println(data);
				splitData = data.split(",");
				data = in.readLine();
				peopleList.add(new PeopleDTO(Integer.parseInt(splitData[0]), Integer.parseInt(splitData[1]),
						Integer.parseInt(splitData[2]), Integer.parseInt(splitData[3]), Integer.parseInt(splitData[4]),
						Integer.parseInt(splitData[5]), Integer.parseInt(splitData[6]),
						Integer.parseInt(splitData[7])));

				out.flush();// 데이터 손실을 위해서 목적지에 데이터 출력 보장
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();// 사용했던 시스템 자원을 반환하기
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PeopleModel getInstance() {
		return instance;
	}

	PeopleModel() {
	}

	// 모든 people 반환
	public static ArrayList<PeopleDTO> getAllpeople() { // <ProbonoProject>로 제너릭을 안 쓸 경우 되긴하지만 ProbonoProject 타입이 사라져
														// 이상한게 된다.
		return peopleList;
	}

	// people 검색
	public static PeopleDTO getpeople(int year) {
		PeopleDTO people = null;
		for (int i = 0; i < peopleList.size(); i++) { // size는
			if ((peopleList.get(i).getYear()) == (year)) {
				people = peopleList.get(i);
				break;
			}
		}
		return people;
	}
	
	
	//Frae people 반환
	
	public static FareDTO getFarePeople(int year) {
		FareDTO people = null;
		for (int i = 0; i < peopleFare.size(); i++) { // size는
			if ((peopleFare.get(i).getYearFare()) == (year)) {
				people = peopleFare.get(i);
				break;
			}
		}
		return people;
	}

	// 추가
	public static void peopleAdd(PeopleDTO one) {
		peopleList.add(one);
	}
	
	public static void fareAdd(FareDTO one) {
		peopleFare.add(one);
	}

	// people 수정 - 역 / 연도 / 월이 같을 경우 수정
	// lineName / year / month 가 맞아야 수정가능

	public static boolean peopleUpdate(int year, PeopleDTO people) {
		for (int i = 0; i < peopleList.size(); i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			if (year == (peopleList.get(i).getYear())) {
				System.out.println("-----------------------------------------");
				peopleList.get(i).setYear(people.getYear());
				peopleList.get(i).setTotalPeople(people.getTotalPeople());
				peopleList.get(i).setTotalRate(people.getTotalRate());
				peopleList.get(i).setYoung(people.getYoung());
				peopleList.get(i).setSenior(people.getSenior());
				peopleList.get(i).setYoungRate(people.getYoungRate());
				peopleList.get(i).setSeniorRate(people.getSeniorRate());
				peopleList.get(i).setTotalSenior(people.getTotalSenior());

				return true;

			}
			// System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");

		}
		return false;

	}
	
	//Fare 업데이트 
	
	public static boolean fareUpdate(int year, FareDTO people) {
		for (int i = 0; i < peopleFare.size(); i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			if (year == (peopleFare.get(i).getYearFare())) {
				System.out.println("-----------------------------------------");
				peopleFare.get(i).setYearFare(year);
				peopleFare.get(i).setFare100(people.getFare100());
				peopleFare.get(i).setFare80(people.getFare80());
				peopleFare.get(i).setFare50(people.getFare50());
				peopleFare.get(i).setFare30(people.getFare30());

				return true;

			}
			// System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");

		}
		return false;

	}
	
	
	

	// 삭제 부분
	public static boolean peopleDelete(int year) {
		int count = peopleList.size(); // projectList.size()이걸 변수로 저장해서 쓰면 projectList.size()를 쓸 때마다 계속 속도가 느려진다.
		for (int i = 0; i < count; i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			if (year == (peopleList.get(i).getYear())) {
				peopleList.remove(i);

				return true;

			}
			// System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");

		}
		return false;

	}
	
	
	
	// 삭제 부분
	public static boolean fareDelete(int year) {
		int count = peopleFare.size(); // projectList.size()이걸 변수로 저장해서 쓰면 projectList.size()를 쓸 때마다 계속 속도가 느려진다.
		for (int i = 0; i < count; i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			if (year == (peopleFare.get(i).getYearFare())) {
				peopleFare.remove(i);

				return true;

			}
			// System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");

		}
		return false;

	}

	// people 개수
	public static int peopleListSize() {
		return peopleList.size();
	}

	// subwayList.add(new SubwayDTO (1 , 4, "12" ,"bas", 21, 31,191));
	public static void fareDTOadd() {
		int count = peopleList.size(); // projectList.size()이걸 변수로 저장해서 쓰면 projectList.size()를 쓸 때마다 계속 속도가 느려진다.
		for (int i = 0; i < count; i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			peopleFare.add(
					new FareDTO(peopleList.get(i).getYear(), 
							1.250* peopleList.get(i).getTotalSenior(),  
							1.000* peopleList.get(i).getTotalSenior() ,
							 0.675* peopleList.get(i).getTotalSenior(),
							0.375* peopleList.get(i).getTotalSenior()) );

		}

	}

	public static ArrayList<FareDTO> getAllFarepeople() { // <ProbonoProject>로 제너릭을 안 쓸 경우 되긴하지만 ProbonoProject 타입이 사라져
		// 이상한게 된다.
		return peopleFare;
	}

}// 마지막 부분
