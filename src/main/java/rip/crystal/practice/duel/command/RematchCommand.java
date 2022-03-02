package rip.crystal.practice.duel.command;

import rip.crystal.practice.Locale;
import rip.crystal.practice.profile.Profile;
import rip.crystal.practice.profile.meta.ProfileRematchData;
import rip.crystal.practice.utilities.MessageFormat;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class RematchCommand extends BaseCommand {

	@Command(name = "rematch")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();

		Profile profile = Profile.get(player.getUniqueId());
		ProfileRematchData rematchData = profile.getRematchData();

		if (rematchData == null) {
			new MessageFormat(Locale.REMATCH_DO_NOT_HAVE_ANYONE.format(profile.getLocale()))
					.send(player);
			return;
		}

		rematchData.validate();

		if (rematchData.isCancelled()) {
			new MessageFormat(Locale.REMATCH_CANCELLED.format(profile.getLocale()))
					.send(player);
			return;
		}

		if (rematchData.isReceive()) {
			rematchData.accept();
		} else {
			if (rematchData.isSent()) {
				new MessageFormat(Locale.REMATCH_IS_SENT.format(profile.getLocale()))
						.send(player);
				return;
			}

			rematchData.request();
		}
	}
}
