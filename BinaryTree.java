
public class BinaryTree {
	Node root;
	public void insert(int data) {
		insertNode(root,data);
	}
	public void insertNode(Node node,int data) {
		if(root==null) {
			root = new Node(data);
		}else {
			if(node.data == data) {
				System.out.println("�Է��Ͻ� ������ ���� �̹� �����մϴ�.");
				return;
			}else {
			if(data < node.data) {
				if(node.left==null) {
					node.left = new Node(data);
				}else {
					insertNode(node.left,data);
				}
			}else {
				if(node.right==null) {
					node.right = new Node(data);
				}else {
					insertNode(node.right,data);
				}
			}
			}
		}
		}
	public void search(int data) {
		searchNode(root,data);
	}
	public void searchNode(Node node,int data) {
		if(root==null) {
			System.out.println("Ʈ���� ��������� �ʾҽ��ϴ�.");
			return;
		}else {
			if(node==null) {
				System.out.println("�Է��Ͻ� ������ ���� Ʈ���� �����ϴ�.");
			}else {
				if(data==node.data) {
					System.out.println("�Է��Ͻ� ������ ���� Ʈ���� �ֽ��ϴ�.");
					return;
				}
				if(data<node.data) {
					searchNode(node.left, data);
				}else {
					searchNode(node.right, data);
				}
			}
		}
	}
	/*public void remove(int data) {
		removeNode(root,data,null);
	}
	public void removeNode(Node rootNode,int data,Node parentNode) {
		if(root==null) {
			System.out.println("Ʈ���� ��������� �ʾҽ��ϴ�");
		}else {
			if(rootNode==null) {
				System.out.println("�Է��Ͻ� ������ ���� Ʈ���� �����ϴ�.");
			}else {
				if(data==rootNode.data) {
					if(data==1) {
						
					}
					System.out.println("�Է��Ͻ� ������ ���� Ʈ������ �����Ǿ����ϴ�.");
					
				}else {
					if(data<rootNode.data) {
						removeNode(rootNode.left,data,rootNode);
					}else {
						removeNode(rootNode.right,data,rootNode);
					}
				}
			}
		}
	}
	public void searchRootNode(Node node) {
		if(node==null) {
			return;
		}else {
			if(node.left!=null) {
				
			}
			if(node.right!=null) {
				
			}
		}
	}*/
	public void tree() {
		first(root);
	}
	public void first(Node node) {
		if(root==null) {
			System.out.println("Ʈ���� ��������� �ʾҽ��ϴ�.");
		}else {
			if(node==null) {
				return;
			}else {
				if(node.left!=null) {
					first(node.left);
				}
				System.out.print(node.data+" - ");
				if(node.right!=null) {
					first(node.right);
				}
			}
		}
	}
}
	

