package BinarySearchTree;

public class BSTDemo {

    public static void main(String[] args)
    {
        BST bt = new BST();

        bt.Add(bt.root, bt.CreateNode(10));
        bt.Add(bt.root, bt.CreateNode(12));
        bt.Add(bt.root, bt.CreateNode(11));
        bt.Add(bt.root, bt.CreateNode(6));
        bt.Add(bt.root, bt.CreateNode(9));
        bt.Add(bt.root, bt.CreateNode(13));
        bt.Add(bt.root, bt.CreateNode(5));

        System.out.println("Before Deleting Node");
        bt.InOrderPrint(bt.root);

        bt.DeleteNode(bt.root,11);
        System.out.println("Deleting Node");

        System.out.println("After Deleting Node");
        bt.InOrderPrint(bt.root);

        //bt.Search(11,bt.root);





    }

}
