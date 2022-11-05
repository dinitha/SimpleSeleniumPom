package org.framework.enums;

public enum SortBy {

    FEATURED(0),
    LOWTOHIGH(1),
    HIGHTOLOW(2),
    CUSTOEMRREVIEW(3),
    NEWESTARRIVAL(4);
    private final int index;




    SortBy(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
