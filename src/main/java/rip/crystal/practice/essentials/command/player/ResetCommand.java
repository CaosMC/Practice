package rip.crystal.practice.essentials.command.player;

import rip.crystal.practice.Locale;
import rip.crystal.practice.cPractice;
import rip.crystal.practice.player.profile.Profile;
import rip.crystal.practice.utilities.MessageFormat;
import rip.crystal.practice.utilities.PlayerUtil;
import rip.crystal.practice.api.command.BaseCommand;
import rip.crystal.practice.api.command.Command;
import rip.crystal.practice.api.command.CommandArgs;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ResetCommand extends BaseCommand {

    @Command(name = "reset", permission = "hysteria.command.reset")
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        String[] args = commandArgs.getArgs();

        if (args.length == 0) {
            PlayerUtil.reset(player);
            player.teleport(cPractice.get().getEssentials().getSpawn());
            return;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            new MessageFormat(Locale.PLAYER_NOT_FOUND
                    .format(Profile.get(player.getUniqueId()).getLocale()))
                    .send(player);
            return;
        }

        PlayerUtil.reset(target);
        target.teleport(cPractice.get().getEssentials().getSpawn());
    }
}
