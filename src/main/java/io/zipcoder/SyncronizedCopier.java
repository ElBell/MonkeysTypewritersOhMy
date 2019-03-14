package io.zipcoder;

public class SyncronizedCopier extends Copier{
    public SyncronizedCopier(String toCopy) {
        super(toCopy);
    }
    @Override
    synchronized public void run() {
        while (stringIterator.hasNext()) {
            copied += stringIterator.next() + " ";
        }
    }
}
