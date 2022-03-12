package rip.crystal.practice.game.kit.command;

import rip.crystal.practice.game.kit.Kit;
import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.practice.api.command.BaseCommand;
import rip.crystal.practice.api.command.Command;
import rip.crystal.practice.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class KitDeleteCommand extends BaseCommand {

	@Command(name = "kit.delete", permission = "hysteria.kit.admin")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();
		String[] args = commandArgs.getArgs();

		if (args.length == 0) {
			player.sendMessage(CC.RED + "Please usage: /kit remove (kitName)");
			return;
		}

		Kit kit = Kit.getByName(args[0]);
		if (kit == null) {
			player.sendMessage(CC.RED + "A kit with that name doesn't exists.");
			return;
		}

		kit.delete();
		player.sendMessage(CC.RED + "You deleted this kit.");
	}
}
