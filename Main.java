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
		System.out.println("1.삽입   2.찾기    3.보기   4.종료");
		try {
		select = sc.nextInt();
		if(select==1) {
			System.out.println("데이터 값을 입력해주세요.");
			data = sc.nextInt();
			tree.insert(data);
		}else {
			if(select==2) {
				System.out.println("데이터 값을 입력해주세요.");
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
							System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
						}
					}
			}
		}
		}catch(InputMismatchException e) {
			System.out.println("슷자를  입력해주세요. 프로그램이 종효됩니다.");
			break;
		}
		}
		sc.close();
	}

}
