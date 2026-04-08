package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

interface RhymersFactory {

    DefaultCountingOutRhymer getStandardRhymer();

    DefaultCountingOutRhymer getFalseRhymer();

    DefaultCountingOutRhymer getFIFORhymer();

    DefaultCountingOutRhymer getHanoiRhymer();

}

