package dev.reedworkmc.examples.command.commands;

import dev.reedworkmc.reedwork.annotation.Command;
import dev.reedworkmc.reedwork.annotation.CommandHandler;
import dev.reedworkmc.reedwork.annotation.SubCommand;
import dev.reedworkmc.reedwork.command.CommandContext;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;

@Command(
        value = "helloreedwork",
        description = "Send a welcome message to a player",
        permission = "minecraft.commands.op", // reedwork.example.hello
        cooldown = 10,
        aliases = {"hellorw", "hrw"}
)
public final class HelloReedworkCommand {

    private static final Component HELLO_MESSAGE = Component.text("Hello from Reedwork!", NamedTextColor.YELLOW);

    @CommandHandler
    public boolean greetSelf(CommandContext context) {
        context.player().sendMessage(HELLO_MESSAGE);
        return true;
    }

    @SubCommand("<target>")
    public boolean greetTarget(CommandContext context, Player target) {
        target.sendMessage(HELLO_MESSAGE);

        context.player().sendMessage("Hello message sent to " + target.getName());
        return true;
    }
}
