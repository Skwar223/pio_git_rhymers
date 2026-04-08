package edu.kis.vh.nursery.list;

class IntLinkedList {

    Node last;
    int i;

    void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    boolean isEmpty() {
        return last == null;
    }

    boolean isFull() {
        return false;
    }

    int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
