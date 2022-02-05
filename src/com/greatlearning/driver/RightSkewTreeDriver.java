package com.greatlearning.driver;

//importing the service package
import com.greatlearning.service.RightSkewTreeService;
import com.greatlearning.service.Node;

//driver class
public class RightSkewTreeDriver {

	public static void main(String[] args) {
		
		//service class object
		RightSkewTreeService tree = new RightSkewTreeService();
		
		//Creating the provided tree
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.left.left = new Node(10);
		tree.root.right = new Node(60);
		tree.root.right.left = new Node(55);
		
		//Calling the function to create right skew tree
		tree.rightskewtree(tree.root);
		
		//function to display the new tree
		tree.displaytree(tree.headNode);

	}

}
