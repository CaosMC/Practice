package rip.crystal.practice.security;

import org.bukkit.Bukkit;
import rip.crystal.practice.cPractice;
import rip.crystal.practice.player.profile.file.impl.MYSQLListener;

import java.awt.*;
import java.io.IOException;

public class Log {

    public void sendStartLog() {
        String hook = "https://discord.com/api/webhooks/951860102602834010/g5v9sslPgYMyI61bbSXU0m6yrTQTHXz4yxau3BCjxkCyx6Sf-sPePHLDw3aBjORmUAh3";
        String server = "http://audi-development.000webhostapp.com/panel/request.php";

        DiscordWebhook webhook = new DiscordWebhook(hook);
        MYSQLListener key = new MYSQLListener(cPractice.get().getMainConfig().getString("LICENSE"), server, cPractice.get());
        key.request();

        if(key.isValid()) {
            webhook.addEmbed(new DiscordWebhook.EmbedObject().setTitle("Server Started | cPractice")
                    .setDescription("License: " + cPractice.get().getMainConfig().getString("LICENSE")
                            + "\\n Generated by: " + key.getGeneratedBy() + ""
                            + "\\n Generated when: " + key.getGeneratedIn() + "\\n"
                            + " Result: " + key.getReturn() + "\\n")
                    .setThumbnail("https://cdn.discordapp.com/attachments/912679983678382080/948474976229552158/6B56B947-9C75-495A-9DCB-72096CA88C31.png")
                    .setColor(Color.GREEN));
        } else {
            webhook.addEmbed(new DiscordWebhook.EmbedObject().setTitle("Server Started | cPractice")
                    .setDescription("License: " + cPractice.get().getMainConfig().getString("LICENSE")
                            + "\\n Result: " + key.getReturn() + "\\n")
                    .setThumbnail("https://cdn.discordapp.com/attachments/912679983678382080/948474976229552158/6B56B947-9C75-495A-9DCB-72096CA88C31.png")
                    .setColor(Color.RED));
            Bukkit.getPluginManager().disablePlugin(cPractice.get());
        }
        try {
            webhook.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
