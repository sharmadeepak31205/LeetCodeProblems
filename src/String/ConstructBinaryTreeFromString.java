package String;

import LeetCode.TreeNode;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class ConstructBinaryTreeFromString {

    private static int index = 0;
//    public static TreeNode str2tree(String st) {
//        if (index == st.length()) return null;
//
//        StringBuilder num = new StringBuilder(); //extract number
//
//        while (index < st.length()) {
//
//            char c = st.charAt(index);
//
//            if(c!='('&&c!=')') {
//                num.append(c);
//                index++;
//            }
//
//            else break;
//        }
//
//        TreeNode node = new TreeNode(Integer.parseInt(num.toString())); // create new node
//
//        if (index < st.length() && st.charAt(index) == '('){// check parenthesis type
//
//            index++;
//            node.left = str2tree(st);// create left child node
//            index++;
//
//            if (index < st.length() && st.charAt(index) == '('){
//                index++;
//                node.right = str2tree(st);// create right child node
//                index++;
//            }
//        }
//        return node; // if meets ')', return to parent node
//    }

    public static TreeNode str2tree(String st) {
        if(index == st.length()) return null;

        StringBuilder sb = new StringBuilder();
        while(index < st.length()){
            if(st.charAt(index) != '(' && st.charAt(index) != ')'){
                sb.append(st.charAt(index));
                index++;
            }
            else{
                break;
            }
        }

        TreeNode node = new TreeNode(Integer.parseInt(sb.toString()));

        if(index < st.length() && st.charAt(index) == '('){
            index++;
            node.left = str2tree(st);
            index++;

            if(index < st.length() && st.charAt(index) == '('){
                index++;
                node.right = str2tree(st);
                index++;
            }
        }

        return node;
    }

    public static void main(String[] args){
        TreeNode root = str2tree("1(2)(3)");
    }
}
