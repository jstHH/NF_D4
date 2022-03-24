package jst.tag4;

public class Fakultaet {

    public long faculty(long number) {
        long index = 1;
        long fac = 1;

        while(index <= number) {
            fac = fac * index;
            index++;
        }
        return fac;
    }
}


/*
long fac = 1;
        if (number >= 1) {
            for (int n = 1; n <= number; n++) {
                fac = fac * n;
            }
        }
 */