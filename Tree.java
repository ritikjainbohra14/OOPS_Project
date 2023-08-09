import java.awt.Color;

public class Tree {

    private double heightFt;
    
    private double trunkDiameterInches;
    
    private TreeType treeType;
    
    static Color Trunk_color = new Color(102, 51, 0);
    
    Tree(double heightFt, double trunkDiameterInches, TreeType treeType ){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }
    
    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }
    
    static void announcecTree(){
        System.out.println("Look out for that tree!");
    }
    
    void announceTallTree(Tree tree1){
        if(tree1.heightFt >= 100){
            System.out.println("Thats the tall tree" + tree1.treeType);
        }
    }
    
    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }
    
    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }
    
    public double getHeightFt() {
        return heightFt;
    }
    
    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }


}
