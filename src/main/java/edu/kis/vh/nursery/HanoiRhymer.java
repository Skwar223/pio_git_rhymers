package edu.kis.vh.nursery;

class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    int reportRejected() {

        return totalRejected;
    }

    void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
