/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res=new ArrayList<>();
        ser(root,res);
        return String.join(",",res);
    }
    public void ser(TreeNode root, List<String> res)
    {
        if(root==null){res.add("N");return;}
        res.add(String.valueOf(root.val));
        ser(root.left,res);
        ser(root.right,res);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] d=data.split(",");
        int[] i={0};
        return des(d,i);
    }
    public TreeNode des(String[] d,int[] i) {
        if(d[i[0]].equals("N")){i[0]++;return null;}
        TreeNode x=new TreeNode(Integer.parseInt(d[i[0]]));
        i[0]++;
        x.left=des(d,i);
        x.right=des(d,i);
        return x;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));