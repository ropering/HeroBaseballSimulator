package simulation;

import java.util.ArrayList;
import java.util.Scanner;
import ability.Body;
import ability.Fly;
import ability.Psycho;
import ability.SuperPower;
import ability.Weapon;
import hero.Hero;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//각 히어로의 능력을 저장하는 Arraylist 배열 변수 생성
		ArrayList<SuperPower> ironManPowers = new ArrayList<SuperPower>();
		ArrayList<SuperPower> captainPowers = new ArrayList<SuperPower>();
		ArrayList<SuperPower> spiderPowers  = new ArrayList<SuperPower>();
		ArrayList<SuperPower> hulkPowers 	= new ArrayList<SuperPower>();
		ArrayList<SuperPower> pantherPowers = new ArrayList<SuperPower>();
		ArrayList<SuperPower> widowPowers 	= new ArrayList<SuperPower>();
		ArrayList<SuperPower> scarletPowers = new ArrayList<SuperPower>();
		ArrayList<SuperPower> thorPowers 	= new ArrayList<SuperPower>();
		ArrayList<SuperPower> strangePowers = new ArrayList<SuperPower>();
		//각 영웅 ArrayList 배열 변수에 능력(클래스) 추가
		ironManPowers.add(new Fly());		ironManPowers.add(new Weapon());
		captainPowers.add(new Body());		captainPowers.add(new Weapon());
		spiderPowers. add(new Body());
		hulkPowers.   add(new Body());
		pantherPowers.add(new Weapon());
		widowPowers.  add(new Body());
		scarletPowers.add(new Psycho());	scarletPowers.add(new Fly());
		thorPowers.   add(new Body());		thorPowers.   add(new Weapon());
		strangePowers.add(new Psycho());	strangePowers.add(new Fly());	
		// 각 영웅의 객체를 만들어 개개인에 맞는 데이터 저장(생성자 사용)
		Hero ironMan = new Hero(		"아이언맨", 		(int)(Math.random()*10)+1, "이 슈트를 입고", 	ironManPowers);
		Hero captainAmerica = new Hero( "캡틴 아메리카", 	(int)(Math.random()*10)+1, "가 방패를 들고", 	captainPowers);
		Hero spiderMan = new Hero(		"스파이더맨", 		(int)(Math.random()*10)+1, "이 거미줄을 타고", 	spiderPowers);
		Hero hulk = new Hero(			"헐크", 			(int)(Math.random()*10)+1, "가 흥분한 채로", 	hulkPowers);
		Hero panther = new Hero(		"블랙 팬서", 		(int)(Math.random()*10)+1, "가 '와칸다 포에버'를 외치며", pantherPowers);
		Hero widow = new Hero(			"블랙 위도우", 	(int)(Math.random()*10)+1, "가 덤블링을 하며", 	widowPowers);
		Hero scarlet = new Hero(		"스칼렛 위치", 	(int)(Math.random()*10)+1, "가 붉은 아우라를 내뿜으며", scarletPowers);
		Hero thor = new Hero(			"토르", 			(int)(Math.random()*10)+1, "가 묠니르를 돌리며", thorPowers);
		Hero strange = new Hero(		"닥터 스트레인지", 	(int)(Math.random()*10)+1, "가 타임스톤을 지니며",strangePowers);
		//선택된 선수를 저장하기 위한 변수 선언 및 초기화
		Hero heroSelect1 = null; 
		Hero heroSelect2 = null;
		
		System.out.println("=========================="); //줄바꿈
		int input1; 	
		// 사용자 선택(타자)
		while(true) {
			System.out.println("1.아이언맨 2.캡틴아메리카 3.스파이더맨 4.헐크 5.블랙 팬서 6.블랙 위도우 7.스칼렛 위치 8.토르 9.닥터 스트레인지");
			System.out.println("내 선수를 선택하세요");
			System.out.println("숫자로 입력하세요");
			input1 = sc.nextInt(); 
			// 예외 처리
			if (input1 > 0 && input1 < 10) {
				break;
			} else {
				System.out.println("선수 명단 내에서 다시 입력해주세요");					pause(1300);
			}
		}
		// 선수 리스트 - 사용자 선택 간 비교 및 출력
		Hero[] listHitter = {ironMan, captainAmerica, spiderMan, hulk, panther, widow, scarlet, thor, strange};
		for (int i=0; i<listHitter.length; i++) {
			if(input1 == i+1) {
				heroSelect1 = listHitter[i];
				System.out.println("타자 선수 " + listHitter[i].getName() + " 선택");	pause(1300);
				System.out.println("___보유 능력___");
				// 선택된 히어로의 능력 출력
				listHitter[i].mySuperPowers();
				break;
			}
		}
		pause(1300);
		System.out.println("==========================");
		pause(1300);
		
		//상대방 투수 선택
		int randomNumber = (int)(Math.random()*9+1);
		// 선수 리스트 - 사용자 선택 간 비교 및 출력
		Hero[] listPitcher = {ironMan, captainAmerica, spiderMan, hulk, panther, widow, scarlet, thor, strange};
		for (int i=0; i<listPitcher.length; i++) {
			
			if(randomNumber == i+1) {
				heroSelect2 = listPitcher[i];
				System.out.println("두구두구...");													pause(1300);
				System.out.println("상대 투수 " + listPitcher[i].getName() + " 출전!!");			pause(1300);
				System.out.println("___보유 능력___");												pause(1300);
				// 선택된 히어로의 능력 출력
				listPitcher[i].mySuperPowers();
				break;
			}
		}
		pause(1300);
		System.out.println("=========================="); //줄바꿈
		pause(1300); // 엔터시 다시 진행
//		System.out.println("게임을 시작합니다");										pause(1300);
		System.out.println(heroSelect1.getName() + heroSelect1.getFeature() +  heroSelect1.getHitterDisplay());
		System.out.println(heroSelect2.getName() + heroSelect2.getFeature() +  heroSelect2.getPitcherDisplay());
		while(true) {
			heroSelect1.setAbility(random());
			System.out.println("=========================="); 						pause(1300); 
			System.out.println("경기를 시작합니다"); 									pause(1300); 
			System.out.println("투수 " + heroSelect2.getName() + " 공을 던집니다!!"); 	pause(1300);
			System.out.println("타자 " + heroSelect1.getName() + " 공을 쳤습니다!"); 	pause(1300);
			System.out.println("=========================="); 						pause(700);
			System.out.print(".");													pause(700);
			System.out.print(".");													pause(700);
			System.out.println(".");												pause(700);
			// 타자 - 투수 간 대결 및 결과 출력
			if (heroSelect1.getAbility() > heroSelect2.getAbility()) {
				System.out.println("홈런~~~!");
				break;
			} else if (heroSelect1.getAbility() == heroSelect2.getAbility()) {
				System.out.println("안타...한번 더?");
				System.out.print("다시 ");
			}
			else {
				System.out.println("아웃ㅠㅠ");
				break;
			}
		}
		sc.close();
	}
	// 프로그램을 1.3초간 정지시키는 함수
	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {}
	}
	public static int random() {
		return (int)(Math.random()*10)+1;
	}
}


