public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("WELCOME TO BST PROGRAM");
       BST<Integer> bst=new BST<>();
       
       bst.insert(56);
       bst.insert(30);
       bst.insert(70);

       System.out.println("Inorder Traversal of the BST :-");
       bst.inorder(bst.root);
    }
}
