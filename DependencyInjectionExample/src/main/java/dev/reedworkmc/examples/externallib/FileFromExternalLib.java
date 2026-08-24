package dev.reedworkmc.examples.externallib;

public final class FileFromExternalLib {

    private int amountToAdd;

    public FileFromExternalLib(int amountToAdd) {
        this.amountToAdd = amountToAdd;
    }

    public int getAmountToAdd() {
        return amountToAdd;
    }

    public void setAmountToAdd(int amountToAdd) {
        this.amountToAdd = amountToAdd;
    }
}
