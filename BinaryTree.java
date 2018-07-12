
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
				System.out.println("입력하신 데이터 값이 이미 존재합니다.");
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
			System.out.println("트리가 만들어지지 않았습니다.");
			return;
		}else {
			if(node==null) {
				System.out.println("입력하신 테이터 값이 트리에 없습니다.");
			}else {
				if(data==node.data) {
					System.out.println("입력하신 테이터 값이 트리에 있습니다.");
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
			System.out.println("트리가 만들어지지 않았습니다");
		}else {
			if(rootNode==null) {
				System.out.println("입력하신 테이터 값이 트리에 없습니다.");
			}else {
				if(data==rootNode.data) {
					if(data==1) {
						
					}
					System.out.println("입력하신 테이터 값이 트리에서 삭제되었습니다.");
					
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
			System.out.println("트리가 만들어지지 않았습니다.");
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
	

