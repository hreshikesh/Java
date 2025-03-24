package com.xworkz.specifiers.Tree.TreeRunner;
import com.xworkz.specifiers.Tree.Parts.Fruits;
import com.xworkz.specifiers.Tree.Parts.Leaves;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree("Mango Tree", 50, "30m");
        tree.displayTreeDetails();
        tree.grow();

        Leaves leaves = new Leaves("Broadleaf", 5000, "Green");
        leaves.leafDetails();

        Fruits fruit = new Fruits("Mango", "Sweet", "Summer");
        fruit.fruitDetails(leaves);
    }
}
