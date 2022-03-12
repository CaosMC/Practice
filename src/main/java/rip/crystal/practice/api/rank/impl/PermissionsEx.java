package rip.crystal.practice.api.rank.impl;

import rip.crystal.practice.api.rank.RankManager;
import rip.crystal.practice.api.rank.Rank;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

public class PermissionsEx implements Rank {

    @Override
    public String getName(UUID uuid) {
        OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
        return RankManager.getInstance().getChat().getPrimaryGroup(
                String.valueOf(RankManager.getInstance().getPlugin().getServer().getWorlds().get(0).getName()), player);
    }

    @Override
    public String getPrefix(UUID uuid) {
        OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
        return RankManager.getInstance().getChat().getPlayerPrefix(String.valueOf(
                RankManager.getInstance().getPlugin().getServer().getWorlds().get(0).getName()), player);
    }

    @Override
    public String getSuffix(UUID uuid) {
        OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
        return RankManager.getInstance().getChat().getPlayerSuffix(String.valueOf(
                RankManager.getInstance().getPlugin().getServer().getWorlds().get(0).getName()), player);
    }

    @Override
    public String getColor(UUID uuid) {
        OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
        return RankManager.getInstance().getChat().getPrimaryGroup(String.valueOf(
                RankManager.getInstance().getPlugin().getServer().getWorlds().get(0).getName()), player);
    }
}
