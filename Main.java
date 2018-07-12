import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		int select = 0;
		int data = 0;
		while(stop == false) {
		System.out.println("1.����   2.ã��    3.����   4.����");
		try {
		select = sc.nextInt();
		if(select==1) {
			System.out.println("������ ���� �Է����ּ���.");
			data = sc.nextInt();
			tree.insert(data);
		}else {
			if(select==2) {
				System.out.println("������ ���� �Է����ּ���.");
				data = sc.nextInt();
				tree.search(data);
			}else {
					if(select==3) {
						tree.tree();
						System.out.println("");
					}else {
						if(select==4) {
							stop = true;
						}else {
							System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
						}
					}
			}
		}
		}catch(InputMismatchException e) {
			System.out.println("���ڸ�  �Է����ּ���. ���α׷��� ��ȿ�˴ϴ�.");
			break;
		}
		}
		sc.close();
	}

}
