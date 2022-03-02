package rip.crystal.practice.party.command.subcommands;

import rip.crystal.practice.profile.Profile;
import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class PartyChatCommand extends BaseCommand {

	@Command(name = "party.chat", aliases = {"p.chat"})
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();
		String[] args = commandArgs.getArgs();

		if (args.length == 0) {
			player.sendMessage(CC.RED + "Please insert a valid message.");
			return;
		}

		Profile profile = Profile.get(player.getUniqueId());
		StringBuilder builder = new StringBuilder();

		for (String arg : args) {
			builder.append(arg).append(" ");
		}

		if (profile.getParty() != null) {
			profile.getParty().sendChat(player, builder.toString());
		}
	}
}
