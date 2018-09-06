package collectionofprogram;
 
//this is class for Nodes
class NodeType
{
	int value;//value of node
	String nodename;//node name for our reference
	
	NodeType LeftSideChild;//variable of type NodeType class
	NodeType RightSideChild;
	
	NodeType(int value,String nodename)//constructor 
	{
		this.value=value;//this.value refers to class instance 
		this.nodename=nodename;
		
	}
public String toString()//toString called by references
{
	return nodename+":"+value;
}
}
public class ExampleBinaryTree {
    NodeType root;//variable of type NodeType class
    
    
    public void nodeaddition(int value,String nodename)//function to build tree
    {
    	NodeType nodedetails=new NodeType(value,nodename);//calling constructor of NodeType
    	if(root==null)//check if root node is null or not
    	{
    		root=nodedetails;//assign values to root
    	}
    	else//if root is not empty
    	{ 
    		NodeType currentNode=root;
    		NodeType parentnode;
    		
    		while(true)
    		{ parentnode=currentNode;
    		
    			if(value<currentNode.value)
    			{
    				currentNode=currentNode.LeftSideChild;
    				if(currentNode==null)
    				{
    					parentnode.LeftSideChild=nodedetails;
    					
    					return;
    				}
    			}
    			else
    			{
    				currentNode=currentNode.RightSideChild;
    				if(currentNode==null)
    				{
    					parentnode.RightSideChild=nodedetails;
    					
    					return;
    				}
    			}
    		}
    	}
    }
    //InOrder Traverse :Left -> root-> Right
    public void TraverseInOrder(NodeType currentNode)
    {
    	if(currentNode!=null)
    	{    
    		TraverseInOrder(currentNode.LeftSideChild);//reference for toString method
    		System.out.println(currentNode);
    		TraverseInOrder(currentNode.RightSideChild);//reference for toString method
    		
    	}
    }
    // Pre-Order traverse : Root-> Left -> Right
    public void TraversePreOrder(NodeType currentNode)
    {
    	if(currentNode!=null)
    	{  
    		System.out.println(currentNode);
    		TraversePreOrder(currentNode.LeftSideChild);//reference for toString method
    	
    		TraversePreOrder(currentNode.RightSideChild);//reference for toString method
    		
    	}
    	
    }
    //Post-Order traverse : Left-> Right ->Root
    public void TraversePostOrder(NodeType currentNode)
    {
    	if(currentNode!=null)
    	{  
    		
    		TraversePostOrder(currentNode.LeftSideChild);//reference for toString method
    	
    		TraversePostOrder(currentNode.RightSideChild);//reference for toString method
    		System.out.println(currentNode);
    	}
    	
    }
    
    //function to find the node
    public  String IsthereNode(int valuetofind)
    {
    	NodeType currentNode=root;
    	if(currentNode.value==valuetofind)
    	{
    	 return "found";
    	}
    	else
    	{
    		while(currentNode!=null)
    		{  
    			if(valuetofind<currentNode.value)
    			{if(currentNode.LeftSideChild!=null)
    				{currentNode=currentNode.LeftSideChild;
    				if(currentNode.value==valuetofind)
    				{
    					 return "found";
    				}
    				
    				}
    			else
    			{
    				return "not Found";
    			}
    			}
    			else
    			{  if(currentNode.RightSideChild!=null)
    				{currentNode=currentNode.RightSideChild;
    				if(currentNode.value==valuetofind)
    				{
    					 return "found";
    				}
    			}
    			else {
    				return "not found";
    			}
    			}
    		}
    	}
    	return "notfound";
    }

    //other function to find the node
    public String IsthereNode2(int valuetofind)
    {
   	 NodeType currentNode=root;
   	 
   	 while(currentNode.value!=valuetofind)
   	 {
   		 if(valuetofind<currentNode.value)
   		 {
   			 currentNode=currentNode.LeftSideChild;
   		 }
   		 else
   		 {
   			 currentNode=currentNode.RightSideChild;
   		 }
   		 
   		 if(currentNode==null)
   		 {
   			 return "not Found";
   		 }
   	 }
   	 return "found";
    }
    
    public void deleteNode(int valuetodelete)
    {
   NodeType currentNode=root;
   NodeType parent=root;
   boolean yesleft=true;//to check: node is at left side or not
   
   
   while(currentNode.value!=valuetodelete)
   {
	   parent=currentNode;
	   
	   if(valuetodelete<currentNode.value)
	   {
		   yesleft=true;
		   currentNode=currentNode.LeftSideChild;
		   
		   
	   }
	   else
	   {
		   yesleft=false;
		   currentNode=currentNode.RightSideChild;
		   
	   }
	   
	   if(currentNode==null)
		   System.out.println("Node not found");
	   
	   
	   
   }
   
    if(currentNode.LeftSideChild==null && currentNode.RightSideChild==null)
    {
    	if(currentNode==root)
    	{
    		root=null;
    	}
    	
    	else if(yesleft)
    	{
    		parent.LeftSideChild=null;
    	}
    	else
    	{
    		parent.RightSideChild=null;
    	}
    }
    else if(currentNode.LeftSideChild==null)
    {
    	if(currentNode==root)
    	{
    		root=currentNode.RightSideChild;
    	}
    	else if(yesleft)
    	{
    		parent.LeftSideChild=currentNode.RightSideChild;
    	}
    	else
    	{
    		parent.RightSideChild=currentNode.RightSideChild;
    	}
    }
    
    else if(currentNode.RightSideChild==null)
    {
    	if(currentNode==root)
    	{
    		root=currentNode.LeftSideChild;
    	}
    	else if(yesleft)
    	{
    		parent.LeftSideChild=currentNode.LeftSideChild;
    	}
    	else
    	{
    		parent.RightSideChild=currentNode.LeftSideChild;
    	}
    }
    else
    {
    	NodeType swap=assignNode(currentNode);
    	if(currentNode==root)
    	{
    		root=swap;
    	}
    	else if(yesleft)
    	{
    		parent.LeftSideChild=swap;
    	}
    	else
    	{
    		parent.RightSideChild=swap;
    	}
    	
    	swap.LeftSideChild=currentNode.LeftSideChild;
    			
    }
    
    }
    
    public NodeType assignNode(NodeType swap)
    {
    	NodeType workingParent=swap;
    	NodeType working=swap;
    	NodeType currentNode=swap.RightSideChild;
    	
    	while(currentNode!=null)
    	{
    		workingParent=working;
    		working=currentNode;
    		currentNode=currentNode.LeftSideChild;
    		
    	}
    	
    	if(working !=swap.RightSideChild)
    	{
    		workingParent.LeftSideChild=working.RightSideChild;
    		working.RightSideChild=swap.RightSideChild;
    	}
    	return working;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleBinaryTree ebt=new ExampleBinaryTree();
		ebt.nodeaddition(123, "startroot");//adding nodes:starting from root
		ebt.nodeaddition(322, "A");//adding nodes
		ebt.nodeaddition(1, "B");
		ebt.nodeaddition(211, "C");
		ebt.nodeaddition(23, "D");
		ebt.nodeaddition(32, "E");
		 System.out.println("InOrder:");
	    ebt.TraverseInOrder(ebt.root);
	    System.out.println("PreOrder:");
	    ebt.TraversePreOrder(ebt.root);
	    System.out.println("PostOrder:");
	    ebt.TraversePostOrder(ebt.root);
      
	    System.out.println(ebt.IsthereNode(3245));
	    System.out.println(ebt.IsthereNode(32));
	    System.out.println(ebt.IsthereNode2(3245));
	    System.out.println(ebt.IsthereNode2(32));
	    ebt.deleteNode(32);
	    System.out.println("InOrder:");
	    ebt.TraverseInOrder(ebt.root);
	}

}
