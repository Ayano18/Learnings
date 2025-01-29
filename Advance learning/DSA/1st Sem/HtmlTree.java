import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class HtmlTree {
    private static JTree tree;

    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("HTML");

        DefaultMutableTreeNode head = new DefaultMutableTreeNode("HEAD");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("BODY");

        root.add(head);
        root.add(body);

        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("META");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("TITLE");
        head.add(meta);
        head.add(title);

        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("UL");
        DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("LI");
        DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("LI");
        DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("H1");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("H2");

        body.add(ul);
        body.add(h1);
        body.add(h2);

        ul.add(li1);
        ul.add(li2);

        DefaultMutableTreeNode liH2 = new DefaultMutableTreeNode("LI");
        h2.add(liH2);

        tree = new JTree(root);

        JScrollPane treeView = new JScrollPane(tree);
        JFrame frame = new JFrame("HTML Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(treeView);
        frame.setVisible(true);

    }

}
