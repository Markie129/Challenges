package com.snowrpion.challenges.Challenges;

import jdk.javadoc.internal.doclint.HtmlTag;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.material.MaterialData;

import java.io.File;
import java.io.IOException;

public class AnvilRain implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event) {

        File config = new File("plugins/Challenge/config.yml");
        YamlConfiguration Config = YamlConfiguration.loadConfiguration(config);

        if (!Config.getBoolean("Challenge.AnvilRain")) return;

        Location loc = new Location(event.getPlayer().getWorld(), event.getPlayer().getLocation().getX(), event.getPlayer().getLocation().getY() + 20, event.getPlayer().getLocation().getZ());
        Location loc1 = new Location(event.getPlayer().getWorld(), event.getPlayer().getLocation().getX() + 5, event.getPlayer().getLocation().getY() + 20, event.getPlayer().getLocation().getZ());
        Location loc2 = new Location(event.getPlayer().getWorld(), event.getPlayer().getLocation().getX(), event.getPlayer().getLocation().getY() + 20, event.getPlayer().getLocation().getZ() + 3);
        Location loc3 = new Location(event.getPlayer().getWorld(), event.getPlayer().getLocation().getX() - 4, event.getPlayer().getLocation().getY() + 20, event.getPlayer().getLocation().getZ());

        event.getPlayer().getWorld().spawnFallingBlock(loc, Bukkit.createBlockData(Material.ANVIL));
        event.getPlayer().getWorld().spawnFallingBlock(loc1, Bukkit.createBlockData(Material.ANVIL));
        event.getPlayer().getWorld().spawnFallingBlock(loc2, Bukkit.createBlockData(Material.ANVIL));
        event.getPlayer().getWorld().spawnFallingBlock(loc3, Bukkit.createBlockData(Material.ANVIL));
    }

}
