package com.charcopy.charcopy;

public class Copier {
    private ISource source;
    private IDestination destination;

    public Copier(ISource source, IDestination destination) {
        this.source = source;
        this.destination = destination;
    }
}
