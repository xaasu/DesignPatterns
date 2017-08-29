package composite;

/**
 * The Class Tree.<br>
 * <b>组合模式。</b>
 */
public class Tree {

	/** The root. */
	public TreeNode root = null;

	/**
	 * Instantiates a new tree.
	 *
	 * @param name
	 *            the name
	 */
	public Tree(String name) {
		root = new TreeNode(name);
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Tree tree1 = new Tree("A");
		TreeNode tree2 = new TreeNode("B");
		TreeNode tree3 = new TreeNode("C");
		TreeNode tree4 = new TreeNode("D");
		tree2.addNode(tree3);
		tree1.root.addNode(tree4);
		tree1.root.addNode(tree2);
		System.out.println(tree1.root);
	}
}
