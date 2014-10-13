import com.algorithms.*;

import java.io.*;

class Solution {
    public void solve(InputReader in, PrintWriter out) {

        BinaryTree bt = new BinaryTree();

        int noOfElements = in.nextInt();

        while (noOfElements-- != 0) {
            bt.addNode(in.nextInt(), in.next());
        }

        bt.inOrderTraverseTree(bt.root);

        bt.findMin(bt.root);
        bt.findMax(bt.root);

    }
}