package dev.reedworkmc.examples.quickstart.commands;

import dev.reedworkmc.examples.quickstart.services.ReedworkItemManager;
import dev.reedworkmc.reedwork.annotation.Command;
import dev.reedworkmc.reedwork.annotation.CommandHandler;
import dev.reedworkmc.reedwork.annotation.SubCommand;
import dev.reedworkmc.reedwork.command.CommandContext;
import org.bukkit.entity.Player;

@Command(
        value = "helloreedwork",
        description = "Send a welcome message to a player",
        permission = "quickstart.command.hello",
        cooldown = 10,
        aliases = {"hellorw", "hrw"}
)
public final class HelloCommand {

    private final ReedworkItemManager reedworkItemManager;

    public HelloCommand(ReedworkItemManager reedworkItemManager) {
        this.reedworkItemManager = reedworkItemManager;
    }

    @CommandHandler
    public boolean addReedworkItem(CommandContext context) {
        context.player().getInventory().addItem(reedworkItemManager.getReedworkItem());
        return true;
    }

    @SubCommand("<target>")
    public boolean addReedworkItemToTarget(CommandContext context, Player target) {
        target.getInventory().addItem(reedworkItemManager.getReedworkItem());
        return true;
    }
}
