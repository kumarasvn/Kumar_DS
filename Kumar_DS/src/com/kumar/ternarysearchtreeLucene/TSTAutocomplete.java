/*Write a program for Ternary search tree and implement the following methods
 * 1)insert
 * 2)contains
 * 3)prefix search
 * 4)printInorder
 * */
package com.kumar.ternarysearchtreeLucene;

import java.util.ArrayList;
import java.util.Stack;

public class TSTAutocomplete {

    /*
     * Insert method is used to insert word into Ternary search tree
     */
    public TSTNode insert(TSTNode root, String s, int i) {
        //if string is null or string length is less than or equal to index then return the node
        if (s == null || s.length() <= i) {
            return root;
        }
        if (root == null) {
            root = new TSTNode(s.charAt(i));
        }
        if (s.charAt(i) > root.data)
            root.hiKid = insert(root.hiKid, s, i);
        else if (s.charAt(i) < root.data)
            root.loKid = insert(root.loKid, s, i);
        else {
            if ((i + 1) == s.length()) {
                root.token = s.toString();
                return root;
            }
            root.eqKid = insert(root.eqKid, s, i + 1);
        }
        return root;
    }

    /*
     * this method finds whether a particular pattern is available or not in the
     * given TST
     */
    private TSTNode find(TSTNode root, String s, int i) {
        if (s == null || s.length() == 0)
            return root;
        while (root != null) {
            if (s.charAt(i) < root.data) {
                root = root.loKid;
            } else if (s.charAt(i) == root.data) {
                if (i == s.length() - 1) {
                    break;
                } else {
                    i++;
                }
                root = root.eqKid;
            } else {
                root = root.hiKid;
            }
        }
        return root;
    }

    /*
     * this method finds whether a particular String is available or not in the
     * given TST
     */
    public boolean contains(TSTNode root, String s) {
        TSTNode temp = find(root, s, 0);
        if (temp == null)
            return false;
        else
            return temp.token != null;

    }

    /*
     * returns all the elements that will start with a particular prefix
     */
    public ArrayList<TSTNode> prefixSearch(TSTNode root, String prefix) {
        TSTNode prefixNode = find(root, prefix, 0);
        ArrayList<TSTNode> suggest = new ArrayList<TSTNode>();

        if (prefixNode != null) {

            if (prefixNode.eqKid == null && prefixNode.token == null)
                return suggest;
            if (prefixNode.eqKid == null && prefixNode.token != null) {
                suggest.add(prefixNode);
                return suggest;
            }

            if (prefixNode.token != null) {
                suggest.add(prefixNode);
            }

            if (prefix != null && prefix.length() != 0)
                prefixNode = prefixNode.eqKid;

            Stack<TSTNode> st = new Stack<TSTNode>();
            st.push(prefixNode);
            while (!st.empty()) {
                TSTNode top = st.peek();
                st.pop();
                if (top.token != null) {
                    suggest.add(top);
                }
                if (top.eqKid != null) {
                    st.push(top.eqKid);
                }
                if (top.loKid != null) {
                    st.push(top.loKid);
                }
                if (top.hiKid != null) {
                    st.push(top.hiKid);
                }
            }
        }
        return suggest;

    }
  }
