/*
 * 
 */
package composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * The Class TreeNode.
 */
public class TreeNode {

	/** The name. */
	private String name;

	/** The parent. */
	private TreeNode parent;

	/** The children. */
	private Vector<TreeNode> children = new Vector<>();

	/**
	 * Adds the node.
	 *
	 * @param node
	 *            the node
	 */
	public void addNode(TreeNode node) {
		children.add(node);
		node.setParent(this);
	}

	/**
	 * Removes the node.
	 *
	 * @param node
	 *            the node
	 */
	public void removeNode(TreeNode node) {
		children.remove(node);
		node.setParent(null);
	}

	/**
	 * Gets the children.
	 *
	 * @return the children
	 */
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the parent.
	 *
	 * @return the parent
	 */
	public TreeNode getParent() {
		return parent;
	}

	/**
	 * Sets the parent.
	 *
	 * @param parent
	 *            the new parent
	 */
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	/**
	 * Sets the children.
	 *
	 * @param children
	 *            the new children
	 */
	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}

	/**
	 * Instantiates a new tree node.
	 *
	 * @param name
	 *            the name
	 */
	public TreeNode(String name) {
		super();
		this.name = name;
	}

	/**
	 * toString
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("name=" + name + " parent=");
		if (parent == null) {
			result.append("null");
		} else {
			result.append(parent.getName());
		}
		result.append(" children=[" + printChildren() + "]");
		return result.toString();
	}

	/**
	 * Prints the children.
	 *
	 * @return the string
	 */
	private String printChildren() {
		StringBuffer result = new StringBuffer();
		for (TreeNode child : children) {
			result.append("[" + child + "]");
		}
		return result.toString();
	}
}
