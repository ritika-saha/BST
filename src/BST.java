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


    public int nodeCount(TreeNode<T> root){
        if(root == null){
            return 0;
        }
        int leftSize = nodeCount(root.left);
        int rightSize = nodeCount(root.right);

        return leftSize+rightSize+1;

    }


     public int height(TreeNode<T> root){
        if(root ==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }

     public boolean searchNode(TreeNode<T> root, T data){
        if(root == null){
            return false;
        }
        if(root.data.equals(data)){
            return true;
        }
        if(data.compareTo(root.data) < 0){
            return searchNode(root.left,data);
        }else{
            return searchNode(root.right,data);
        }

    }
}
