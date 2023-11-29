public class BST<T extends Comparable<T>> {
    TreeNode<T> root;

    public BST(){
        this.root=null;
    }

    private TreeNode<T> buildTree(T data,TreeNode<T> root){
        if(root==null){
            root=new TreeNode<>(data);
            return root;
        }
        if(data.compareTo(root.data)>0){
            root.right = buildTree(data,root.right);
        }else if(data.compareTo(root.data)<0){
            root.left = buildTree(data,root.left);
        }

        return root;
    }

    public void insert(T data){
        this.root=buildTree(data,root);
    }

    public void inorder(TreeNode<T> root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+ "  ");
            inorder(root.right);
        }
    }
}
