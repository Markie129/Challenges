package com.snowrpion.challenges.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class ChallengesCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("challenges")) {

            File config = new File("plugins/Challenge/config.yml");
            YamlConfiguration Config = YamlConfiguration.loadConfiguration(config);

            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            }

            if (args.length >= 1) {

                if (args[0].equalsIgnoreCase("MobOnDamage")) {

                    if (Config.getBoolean("Challenge.MobOnDamage")) {
                        Config.set("Challenge.MobOnDamage", false);
                        sender.sendMessage(ChatColor.RED + "Challenge Disabled! Mob On Damage");

                        try {
                            Config.save(config);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (!Config.getBoolean("Challenge.MobOnDamage")) {
                        Config.set("Challenge.MobOnDamage", true);
                        sender.sendMessage(ChatColor.RED + "Challenge Enabled! Mob On Damage");

                        try {
                            Config.save(config);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }

                else if (args[0].equalsIgnoreCase("SharedHealth")) {

                    if (Config.getBoolean("Challenge.SharedHealth")) {
                        Config.set("Challenge.SharedHealth", false);
                        sender.sendMessage(ChatColor.RED + "Challenge Disabled! Shared Health");

                        try {
                            Config.save(config);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (!Config.getBoolean("Challenge.SharedHealth")) {
                        Config.set("Challenge.SharedHealth", true);
                        sender.sendMessage(ChatColor.RED + "Challenge Enabled! Shared Health");

                        try {
                            Config.save(config);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }

                else if (args[0].equalsIgnoreCase("AnvilRain")) {

                    if (Config.getBoolean("Challenge.AnvilRain")) {
                        Config.set("Challenge.AnvilRain", false);
                        sender.sendMessage(ChatColor.RED + "Challenge Disabled! Anvil Rain");

                        try {
                            Config.save(config);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (!Config.getBoolean("Challenge.AnvilRain")) {
                        Config.set("Challenge.AnvilRain", true);
                        sender.sendMessage(ChatColor.RED + "Challenge Enabled! Anvil Rain");

                        try {
                            Config.save(config);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }

                else {
                    sender.sendMessage(ChatColor.RED + "Invalid Args! Available: MobOnDamage, SharedHealth, AnvilRain");
                }

            } else if (args.length < 1) {
                sender.sendMessage(ChatColor.RED + "Invalid Args! Available: MobOnDamage, SharedHealth, AnvilRain");
            }

        }
        return true;
    }

}
