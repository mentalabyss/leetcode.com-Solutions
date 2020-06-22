class MyLinkedList {
    Node head;
    int length;

    /** Initialize your data structure here. */
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }



    public MyLinkedList() {
        head = null;
        length = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < length && index > -1) {
            int counter = 0;
            Node nodePointer = head;
            while (counter != index) {
                nodePointer = nodePointer.next;
                counter++;
            }

            return nodePointer.val;
        }
        else return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }

        Node nodePointer = head;

        while (nodePointer.next != null) {
            nodePointer = nodePointer.next;
        }

        Node newNode = new Node(val);
        nodePointer.next = newNode;

        length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == length) {
            addAtTail(val);
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index < length) {
            Node nodePointer = head;

            int counter = 1;
            while (counter != index) {
                nodePointer = nodePointer.next;
                counter++;
            }

            Node newNode = new Node(val);

            newNode.next = nodePointer.next;

            nodePointer.next = newNode;

            length++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            length--;
            return;
        }

        if (index < length && index > 0) {
            Node nodePointer = head;

            int counter = 1;

            while (counter != index) {
                nodePointer = nodePointer.next;
                counter++;
            }

            nodePointer.next = nodePointer.next.next;
            length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
