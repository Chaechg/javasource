package shop;

import java.util.Scanner;

public class MyShop implements Ishop {

	private static final PayType CARD = null;
	private static final PayType CASH = null;
	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// ��ٱ��� �迭
	private Product[] carts = new Product[10]; // ��ȣ�� ��ġ�� ��� ����

	// ȸ������ �迭 - ȸ���̸�, ����Ÿ��
	private User users[] = new User[2];

	// ��ǰ���� �迭 - ��ǰ�̸�, ����, ������
	private Product products[] = new Product[5]; // => product type�� ��ü�� ���� but, �߻�Ŭ�����̴�.
													// =>�߻�Ŭ������ �ڽ� Ŭ������ ��ü ������ ���� �θ� �����ϴ� ���¿��� �Ѵ�.

	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void genUser() {
		// �� 2�� ����
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		// ��ǰ 5�� ����
		// SmartTv(3��), CellPhone(2��)
		products[0] = new CellPhone("Z�ø�", 15000000, "SKT");
		products[1] = new CellPhone("������14", 1520000, "KT");
		products[2] = new SmartTv("�Ｚ 3D Tv", 3500000, "4K");
		products[3] = new SmartTv("LG ����Ʈ Tv", 3000000, "4K");
		products[4] = new SmartTv("�Ｚ ��Ʈ�� Tv", 2800000, "Full HD");
	}

	@Override
	public void start() {
		System.out.println(title + " : ����ȭ�� - ��������");
		System.out.println("===========================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] �� ��");
		System.out.print("���� : ");

		String input = sc.next(); // ���ڿ��� �ޱ� - 0,1,x
		System.out.println("### " + input + " ���� ###");

		// ����ڰ� 0,1 ������ ��� => product list�� �����ִ� ������
		// x�� �Է��� ��� => ����
		switch (input) {
		case "x":
			System.exit(0);
			break;
		default: // "0", "1"�� ������ ���
			selUser = input;
			productList();
			break;
		}
	}

	public void productList() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("===========================");
		// ��ǰ���� ��� => printDetail, printExtra�� ���
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDatail();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.print("���� : ");

		// ����� �Է� => ��ǰ���� 0~4(��ٱ��Ͽ� ���� ������ ��ǰ ���), h(����ȭ��), c
		String input = sc.next();
		System.out.println("### " + input + " ���� ###");
		// ���ڿ��� �������Ƿ�, index�� �� �� ����. products["0"]
		// "0" => 0 ���ڿ��� ���ڷ� ó��. Integer.parseInt()�� ����.

		switch (input) {
		case "h":
			// ����ȭ�� �����ֱ�
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			// ����ڰ� ������ ��ǰ�� carts�� ���
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break; // �ϳ��� ��� for���� �������;� �Ѵ�.
				}
			}
			// ��ǰ��� �����ֱ�
			productList();
			break;
		}
	}

	public void checkOut() {
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("===========================");

		int total = 0;
		// ��ٱ��� ��� ���
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d) \n", i, carts[i].getPname(), carts[i].getPrice());
				total += carts[i].getPrice(); // �� �����ݾ�
			}
		}
		System.out.println("===========================");
		System.out.println("���� ��� : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("�հ� : " + total);
		System.out.println("[p] ����, [q] ���� �Ϸ�");
		System.out.print("���� : ");

		String input = sc.next();

		// p(��ǰ���ȭ��), q(������ �Ϸ�Ǿ����ϴ�. �����մϴ�.)
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("������ �Ϸ�Ǿ����ϴ�. �����մϴ�.");
			break;
		default:
			break;
		}

	}
}
