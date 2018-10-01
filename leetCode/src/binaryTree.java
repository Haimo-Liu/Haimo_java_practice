public class binaryTree {

    Node root;

    public class Node{
        int value;
        String name;

        Node leftNode;
        Node rightNode;

        public Node(int value, String name){
            this.value = value;
            this.name = name;
        }
    }


    public void addNode(int value, String name){

         Node newNode = new Node(value, name);

         if(root == null){
             root = newNode;
         }

         else {
             Node focusNode = root;
             Node parent;

             while(true){
                 parent = focusNode;

                 if(value == focusNode.value) {
                     return;
                 }

                 if(value < focusNode.value) {
                     focusNode = focusNode.leftNode;
                     if (focusNode == null) {
                         parent.leftNode = newNode;
                         return;
                     }
                 } else{
                     focusNode = focusNode.rightNode;
                     if(focusNode == null){
                         parent.rightNode = newNode;
                         return;
                     }
                 }
             }
         }
    }


    public Node findNode(int key){
        Node focusNode = root;

        while(focusNode.value != key){
            if(key < focusNode.value){
                focusNode = focusNode.leftNode;
            }

            else{
                focusNode = focusNode.rightNode;
            }

            if(focusNode == null){
                return null;
            }
        }

        return focusNode;
    }



    public void inOrderTraverseTree (Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftNode);

            System.out.println(focusNode.name + " makes $" + focusNode.value + " a month");

            inOrderTraverseTree(focusNode.rightNode);
        }

    }

    public void preorderTraverseTree (Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode.name + " makes $" + focusNode.value + " a month");

            preorderTraverseTree(focusNode.leftNode);

            preorderTraverseTree(focusNode.rightNode);
        }

    }


    public void postorderTraverseTree (Node focusNode){
        if(focusNode != null){

            postorderTraverseTree(focusNode.leftNode);

            postorderTraverseTree(focusNode.rightNode);

            System.out.println(focusNode.name + " makes $" + focusNode.value + " a month");

        }

    }


    public static void main(String args[]){

        binaryTree btree = new binaryTree();

        btree.addNode(100, "CEO");
        btree.addNode(80, "CTO");
        btree.addNode(50, "sales man 1");
        btree.addNode(10, "engineer");
        btree.addNode(75, "VP");
        btree.addNode(60, "sales manager");


        btree.inOrderTraverseTree(btree.root);

        //btree.preorderTraverseTree(btree.root);

        //btree.postorderTraverseTree(btree.root);



        System.out.println("search for 50");

        Node found = btree.findNode(50);

        System.out.println(found.name + " makes monthly salary of $" + found.value);



    }
}
