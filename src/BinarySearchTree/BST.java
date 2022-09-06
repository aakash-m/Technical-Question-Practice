package BinarySearchTree;

public class BST {

    public Node root;

    public BST() {
        root = null;
    }

    public Node CreateNode(int value) {
        return new Node(value, null, null);
    }

    public void Add(Node start, Node newNode) {
        if (root == null) {
            root = newNode;
            return;
        }

        //Check left side
        if (newNode.value < start.value) {
            if (start.left == null) {
                start.left = newNode;
            }
            Add(start.left, newNode);
        }

        //Check right side
        if (newNode.value > start.value) {
            if (start.right == null) {
                start.right = newNode;
            }
            Add(start.right, newNode);
        }


    }

    public void Search(int value, Node start) {

        if (start == null) {
            System.out.println("Node is not found");
            return;
        }

        //Found
        if (start.value == value) {
            System.out.println("Node is found");
            return;
        }

        //Search left side
        if (value < start.value) {
            Search(value, start.left);
        }

        //Search right side
        if (value > start.value) {
            Search(value, start.right);
        }

    }

    public Node DeleteNode(Node start, int value){

        if(start==null){
            return null;
        }

        if(value<start.value){
            start.left=DeleteNode(start.left,value);
        }else if(value>start.value){
            start.right=DeleteNode(start.right,value);
        }else {
            //Node with only one child or no child
            if(start.left==null){
                return start.right;
            }else if(start.right==null){
                return start.left;
            }

            //Node with two child
            start.value=minValue(start.right);

            start.right=DeleteNode(start.right,start.value);

        }

        return start;

    }
    int minValue(Node start){
        int minValue = start.value;
        while (start.left!=null){
            minValue=start.left.value;
            start=start.left;
        }
        return minValue;
    }

    public void InOrderPrint(Node start) {

        if (start != null) {

            InOrderPrint(start.left);
            System.out.print(start.value + " ");
            InOrderPrint(start.right);

        }
    }


}
