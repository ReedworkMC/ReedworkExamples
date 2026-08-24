package dev.reedworkmc.examples.dependencyinjection.commands;

import dev.reedworkmc.examples.dependencyinjection.services.ExecuteCounter;
import dev.reedworkmc.examples.dependencyinjection.services.GreeterService;
import dev.reedworkmc.examples.externallib.FileFromExternalLib;
import dev.reedworkmc.reedwork.annotation.Command;
import dev.reedworkmc.reedwork.annotation.CommandHandler;
import dev.reedworkmc.reedwork.annotation.SubCommand;
import dev.reedworkmc.reedwork.command.CommandContext;
import net.kyori.adventure.text.Component;

@Command("reedwork")
public final class ReedworkCommand {

    private final GreeterService greeterService;
    private final ExecuteCounter executeCounter;
    private final FileFromExternalLib fileFromExternalLib;

    public ReedworkCommand(GreeterService greeterService, ExecuteCounter executeCounter, FileFromExternalLib fileFromExternalLib) {
        this.greeterService = greeterService;
        this.executeCounter = executeCounter;
        this.fileFromExternalLib = fileFromExternalLib;
    }

    @CommandHandler
    public boolean execute(CommandContext context) {
        greeterService.sendGreeting(context.player());
        executeCounter.increment();
        return true;
    }

    @SubCommand("count")
    public boolean count(CommandContext context) {
        context.player().sendMessage(Component.text("Reedwork Command fired " + executeCounter.getExecutionCount() + " times!"));
        return true;
    }

    @SubCommand("amount set <amount>")
    public boolean setAmountToAdd(CommandContext context, Integer amountToAdd) {
        fileFromExternalLib.setAmountToAdd(amountToAdd);
        return true;
    }

    @SubCommand("amount get")
    public boolean getAmountToAdd(CommandContext context) {
        context.player().sendMessage(Component.text("Amount to Add: " + fileFromExternalLib.getAmountToAdd()));
        return true;
    }
}
