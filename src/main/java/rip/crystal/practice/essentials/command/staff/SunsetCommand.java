package rip.crystal.practice.essentials.command.staff;

import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.practice.api.command.BaseCommand;
import rip.crystal.practice.api.command.Command;
import rip.crystal.practice.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class SunsetCommand extends BaseCommand {

	@Command(name = "sunset", permission = "hysteria.command.sunset")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();

		player.setPlayerTime(12000, false);
		player.sendMessage(CC.GREEN + "It's now sunset.");
	}
}
