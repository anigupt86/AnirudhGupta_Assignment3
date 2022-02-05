package com.greatlearning.service;

//service class
public class RightSkewTreeService {
	
	//declaring variables
	public Node root;
	public static Node prevNode = null;
	public static Node headNode = null;
	
	public void rightskewtree(Node root) {
		
		//checking if the root is null
		if (root == null)
		return;
		
		//traversing through the right branch
		rightskewtree(root.left);
		
		//Moving the left branch leaf to righ branch
		Node rightNode = root.right;
		
		//Creating the right tree
		if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
		
		//Storing the value in the right tree
		rightskewtree(rightNode);
		
}
	//function to display the tree
	public void displaytree(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        displaytree(root.right);       
    }
}
