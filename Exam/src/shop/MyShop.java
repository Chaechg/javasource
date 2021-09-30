package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;

	private Scanner sc = new Scanner(System.in);

	private Product cart[];

	private String selUser;

	// 생성자
	public MyShop() {
		super();
		this.title = title;
		this.sc = sc;
		this.cart = cart;
		this.selUser = selUser;
	}

	@Override
	public void setTitle(String title) {
		System.out.println("Welcome to MyShop");
		System.out.println("=====================");
		System.out.println("[0]메인 화면  - 계정 선택");
		System.out.println("[1]상품 목록 - 상품 선택");
		System.out.println("[2]체크 아웃 - 장바구니");
		System.out.print("선택 : ");
		int selctNo1 = sc.nextInt();
		
		if (selctNo1 == 0) {
			start();
		}else if (selctNo1 == 1) {
			productList();
		}else if (selctNo1 ==2) {
			checkOut();
		}else {
			setTitle(title);
		}

	}

	@Override
	public void genUser() {
		

	}

	@Override
	public void genProduct() {
		
		CellPhone c1 = new CellPhone("갤럭시 노트5", 1000000, "SKT");
		CellPhone c2 = new CellPhone("애플 아이폰7", 980000, "KT");
		SmartTV t1 = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		SmartTV t2 = new SmartTV("LG Smart TV", 2500000, "Full HD");
	}

	@Override
	public void start() {

	}

	public void productList() {
		
		
		
		System.out.println("MyShop : 상품목록 - 상품선택");
		System.out.println("========================");
		System.out.println();
		
	}

	public void checkOut() {

	}

}
