package com.snowrpion.challenges.Challenges;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.io.File;

public class SharedHealth implements Listener {

    @EventHandler
    public void onTakeDamage(EntityDamageEvent event) {
        File config = new File("plugins/Challenge/config.yml");
        YamlConfiguration Config = YamlConfiguration.loadConfiguration(config);

        if (!(event.getEntity() instanceof Player)) return;
        if (!Config.getBoolean("Challenge.SharedHealth")) return;

        for (Player players : Bukkit.getOnlinePlayers()) {
            players.sendMessage(((Player) event.getEntity()).getDisplayName() + ChatColor.GREEN + " took " + event.getDamage() + " hearts of damage!");

            if (players != event.getEntity()) {
                players.damage(event.getDamage());
            }
        }

    }

}
