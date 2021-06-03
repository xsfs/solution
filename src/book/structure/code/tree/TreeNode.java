package book.structure.code.tree;

/**
 * 结点
 */
public class TreeNode {

    /**
     * 名称
     */
    private String name;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 左子树
     */
    private TreeNode leftNode;

    /**
     * 右子树
     */
    private TreeNode rightNode;

    public TreeNode(){}
    public TreeNode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
