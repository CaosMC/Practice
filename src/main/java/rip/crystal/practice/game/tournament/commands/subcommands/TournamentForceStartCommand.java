package rip.crystal.practice.game.tournament.commands.subcommands;
/*
   Made by Hysteria Development Team
   Created on 10.10.2021
*/

import rip.crystal.practice.game.tournament.Tournament;
import rip.crystal.practice.game.tournament.TournamentState;
import rip.crystal.practice.api.command.BaseCommand;
import rip.crystal.practice.api.command.Command;
import rip.crystal.practice.api.command.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TournamentForceStartCommand extends BaseCommand {

    @Command(name = "tournament.forcestart", permission = "tournament.admin")
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        Tournament<?> tournament = Tournament.getTournament();
        if (tournament == null || tournament.getState() == TournamentState.ENDED) {
            player.sendMessage(ChatColor.RED + "No tournament found.");
            return;
        }

        if(!tournament.isStarted()) {
            tournament.start();
            player.sendMessage(ChatColor.RED + "You have force started the tournament!");
        }
    }
}
