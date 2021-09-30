package shop;

import java.util.Scanner;

public class MyShop implements Ishop {

	private static final PayType CARD = null;
	private static final PayType CASH = null;
	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// 장바구니 배열
	private Product[] carts = new Product[10]; // 괄호의 위치는 상관 없음

	// 회원정보 배열 - 회원이름, 결제타입
	private User users[] = new User[2];

	// 상품정보 배열 - 상품이름, 가격, 상세정보
	private Product products[] = new Product[5]; // => product type의 객체를 생성 but, 추상클래스이다.
													// =>추상클래스는 자식 클래스의 객체 생성을 통해 부모를 실행하는 형태여야 한다.

	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void genUser() {
		// 고객 2명 생성
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		// 상품 5개 생성
		// SmartTv(3개), CellPhone(2개)
		products[0] = new CellPhone("Z플립", 15000000, "SKT");
		products[1] = new CellPhone("아이폰14", 1520000, "KT");
		products[2] = new SmartTv("삼성 3D Tv", 3500000, "4K");
		products[3] = new SmartTv("LG 스마트 Tv", 3000000, "4K");
		products[4] = new SmartTv("삼성 울트라 Tv", 2800000, "Full HD");
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("===========================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] 종 료");
		System.out.print("선택 : ");

		String input = sc.next(); // 문자열로 받기 - 0,1,x
		System.out.println("### " + input + " 선택 ###");

		// 사용자가 0,1 선택한 경우 => product list를 보여주는 식으로
		// x를 입력한 경우 => 종료
		switch (input) {
		case "x":
			System.exit(0);
			break;
		default: // "0", "1"이 들어오는 경우
			selUser = input;
			productList();
			break;
		}
	}

	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("===========================");
		// 상품정보 출력 => printDetail, printExtra를 사용
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDatail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");

		// 사용자 입력 => 상품선택 0~4(장바구니에 현재 선택한 제품 담기), h(메인화면), c
		String input = sc.next();
		System.out.println("### " + input + " 선택 ###");
		// 문자열로 들어왔으므로, index를 쓸 수 없다. products["0"]
		// "0" => 0 문자열을 숫자로 처리. Integer.parseInt()를 쓴다.

		switch (input) {
		case "h":
			// 메인화면 보여주기
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			// 사용자가 선택한 상품을 carts에 담기
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break; // 하나만 담고 for문을 빠져나와야 한다.
				}
			}
			// 상품목록 보여주기
			productList();
			break;
		}
	}

	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("===========================");

		int total = 0;
		// 장바구니 목록 출력
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d) \n", i, carts[i].getPname(), carts[i].getPrice());
				total += carts[i].getPrice(); // 총 결제금액
			}
		}
		System.out.println("===========================");
		System.out.println("결제 방법 : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : " + total);
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.print("선택 : ");

		String input = sc.next();

		// p(상품목록화면), q(결제가 완료되었습니다. 종료합니다.)
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다. 종료합니다.");
			break;
		default:
			break;
		}

	}
}
