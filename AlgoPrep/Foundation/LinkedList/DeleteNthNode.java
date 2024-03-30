
//https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	    if (head == null){
	        return head;
	    }
	    if(head.next == null && x>=2){
	        return head;
	    }
	    if(x==1){
	        return head.next;
	    }
	    
	    int count =1;
	    Node prev = null;
	    Node temp = head;
        while(count!=x){
            prev = temp;
            temp = temp.next;
            count+=1;
        }
        prev.next = temp.next;
        temp.next=null;
        return head;
    }
}
