package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;

	private Scanner sc = new Scanner(System.in);

	private Product cart[];

	private String selUser;

	// ������
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
		System.out.println("[0]���� ȭ��  - ���� ����");
		System.out.println("[1]��ǰ ��� - ��ǰ ����");
		System.out.println("[2]üũ �ƿ� - ��ٱ���");
		System.out.print("���� : ");
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
		
		CellPhone c1 = new CellPhone("������ ��Ʈ5", 1000000, "SKT");
		CellPhone c2 = new CellPhone("���� ������7", 980000, "KT");
		SmartTV t1 = new SmartTV("�Ｚ 3D Smart TV", 5000000, "4K");
		SmartTV t2 = new SmartTV("LG Smart TV", 2500000, "Full HD");
	}

	@Override
	public void start() {

	}

	public void productList() {
		
		
		
		System.out.println("MyShop : ��ǰ��� - ��ǰ����");
		System.out.println("========================");
		System.out.println();
		
	}

	public void checkOut() {

	}

}
