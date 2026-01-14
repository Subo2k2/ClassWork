//Advanced BST – Recursive Approach
public void delete(int value) {
    root = deleteRec(root, value);
}

private Node deleteRec(Node root, int value) {
    if (root == null)
        return null;

    if (value < root.value) {
        root.left = deleteRec(root.left, value);
    }
    else if (value > root.value) {
        root.right = deleteRec(root.right, value);
    }
    else {
        // Case 1: No child
        if (root.left == null && root.right == null)
            return null;

        // Case 2: One child
        if (root.left == null)
            return root.right;
        if (root.right == null)
            return root.left;

        // Case 3: Two children
        int successorValue = findMin(root.right);
        root.value = successorValue;
        root.right = deleteRec(root.right, successorValue);
    }
    return root;
}