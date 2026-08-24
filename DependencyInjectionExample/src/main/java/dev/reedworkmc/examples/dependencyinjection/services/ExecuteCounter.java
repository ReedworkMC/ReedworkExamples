package dev.reedworkmc.examples.dependencyinjection.services;

import dev.reedworkmc.examples.externallib.FileFromExternalLib;
import dev.reedworkmc.reedwork.annotation.Singleton;

@Singleton
public final class ExecuteCounter {

    private int executionCount;

    private final FileFromExternalLib fileFromExternalLib;

    public ExecuteCounter(FileFromExternalLib fileFromExternalLib) {
        this.fileFromExternalLib = fileFromExternalLib;
    }

    public void increment() {
        executionCount += fileFromExternalLib.getAmountToAdd();
    }

    public int getExecutionCount() {
        return executionCount;
    }
}
