package edu.kis.vh.nursery;

/**
 * Klasa działajaca w oparciu o metode FIFO.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();


    /**
     * Metoda która zwraca elemnt zgodnie z zasada FIFO
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}