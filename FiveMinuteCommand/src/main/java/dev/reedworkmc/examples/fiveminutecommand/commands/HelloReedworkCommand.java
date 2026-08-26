package dev.reedworkmc.examples.fiveminutecommand.commands;

import dev.reedworkmc.reedwork.annotation.Command;
import dev.reedworkmc.reedwork.annotation.CommandHandler;
import dev.reedworkmc.reedwork.command.CommandContext;
import net.kyori.adventure.text.Component;

@Command("hello")
public class HelloReedworkCommand {

    @CommandHandler
    public boolean execute(CommandContext context) {
        context.sender().sendMessage(Component.text("Hello Reedwork!"));
        return true;
    }
}
