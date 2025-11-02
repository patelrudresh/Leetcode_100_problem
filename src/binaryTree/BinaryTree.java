package binaryTree;

public class BinaryTree {
	Node root;

	public void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
	System.out.println(node.data);
	inorder(node.right);
		
	}

	

	

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);        // Root node banaya (data = 1)
		tree.root.left = new Node(2);   // Root ka left child = 2
		tree.root.right = new Node(3);  // Root ka right child = 3
		tree.root.left.left = new Node(4);   // Node 2 ka left child = 4
		tree.root.left.right = new Node(5); 	
		
		System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        }

}
