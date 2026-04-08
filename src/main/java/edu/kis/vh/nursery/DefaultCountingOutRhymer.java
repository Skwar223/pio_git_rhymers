package edu.kis.vh.nursery;

class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    int total = -1;

    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == -1;
    }

    boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
