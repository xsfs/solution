package book.structure.code.tree;

import java.util.LinkedList;

/**
 * 二叉树
 */
public class BinaryTree {

    /**
     * 前序遍历
     * @param root
     * @return
     */
    public String preOrder(TreeNode root){
        StringBuilder stringBuilder = new StringBuilder(root.getName());
        if(root.getLeftNode() != null){
            stringBuilder.append(preOrder(root.getLeftNode()));
        }
        if(root.getRightNode() != null){
            stringBuilder.append(preOrder(root.getRightNode()));
        }
        return stringBuilder.toString();
    }

    /**
     * 中序遍历
     * @param root
     * @return
     */
    public String middleOrder(TreeNode root){
        StringBuilder stringBuilder = new StringBuilder();
        if(root.getLeftNode() != null){
            stringBuilder.append(middleOrder(root.getLeftNode()));
        }
        stringBuilder.append(root.getName());
        if(root.getRightNode() != null){
            stringBuilder.append(middleOrder(root.getRightNode()));
        }
        return stringBuilder.toString();
    }

    /**
     * 后序遍历
     * @param root
     * @return
     */
    public String postOrder(TreeNode root){
        StringBuilder stringBuilder = new StringBuilder();
        if(root.getLeftNode() != null){
            stringBuilder.append(postOrder(root.getLeftNode()));
        }
        if(root.getRightNode() != null){
            stringBuilder.append(postOrder(root.getRightNode()));
        }
        stringBuilder.append(root.getName());
        return stringBuilder.toString();
    }

    /**
     * 层序遍历
     * @param root
     * @return
     */
    public String levelOrder(TreeNode root){
        LinkedList<TreeNode> nodeLinkedList = new LinkedList<>();
        nodeLinkedList.add(root);
        StringBuilder stringBuilder = new StringBuilder();
        while(nodeLinkedList.size() > 0){
            TreeNode node = nodeLinkedList.pop();
            stringBuilder.append(node.getName());
            if(node.getLeftNode() != null){
                nodeLinkedList.add(node.getLeftNode());
            }
            if(node.getRightNode() != null){
                nodeLinkedList.add(node.getRightNode());
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.init();
        //前序遍历
        System.out.println("前序遍历:"+binaryTree.preOrder(root));
        //中序遍历
        System.out.println("中序遍历:"+binaryTree.middleOrder(root));
        //后序遍历
        System.out.println("后序遍历:"+binaryTree.postOrder(root));
        //层序遍历
        System.out.println("层序遍历:"+binaryTree.levelOrder(root));
    }

    /**
     * 数据初始化
     * @return
     */
    public TreeNode init(){
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");
        TreeNode nodeH = new TreeNode("H");
        TreeNode nodeI = new TreeNode("I");
        nodeA.setLeftNode(nodeB);
        nodeA.setRightNode(nodeC);
        nodeB.setLeftNode(nodeD);
        nodeD.setLeftNode(nodeG);
        nodeD.setRightNode(nodeH);
        nodeC.setLeftNode(nodeE);
        nodeC.setRightNode(nodeF);
        nodeE.setRightNode(nodeI);
        return nodeA;
    }
}
