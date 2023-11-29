public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("WELCOME TO BST PROGRAM");
       BST<Integer> bst1=new BST<>();
       
       bst1.insert(56);
       bst1.insert(30);
       bst1.insert(70);

       System.out.println("Inorder Traversal of the BST :-");
       bst1.inorder(bst1.root);

       System.out.println("\n----------------------------------------------");
       
       BST<Integer> bst=new BST<>();
       
       bst.insert(56);
       bst.insert(30);
       bst.insert(70);
       bst.insert(22);
       bst.insert(40);
       bst.insert(60);
       bst.insert(95);
       bst.insert(11);
       bst.insert(65);
       bst.insert(3);
       bst.insert(16);
       bst.insert(63);
       bst.insert(67);

        System.out.println("Inorder Traversal of the BST :-");
        bst.inorder(bst.root);

        int nodeCount= bst.nodeCount(bst.root);

        int height=bst.height(bst.root);

        System.out.println("\nThe height of the bst is : "+height );
        System.out.println("Number of nodes in the BST is : "+nodeCount);


        System.out.println("Searching in the BST----");
        System.out.println(bst.searchNode(bst.root, 63)?"NODE "+63+" FOUND !!!":"NODE "+63+" NOT FOUND ---");

    }
}
