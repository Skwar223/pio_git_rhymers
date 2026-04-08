package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
class DefaultRhymersFactory implements RhymersFactory {

    @Override
    DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}