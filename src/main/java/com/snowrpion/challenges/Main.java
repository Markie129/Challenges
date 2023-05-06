package com.snowrpion.youtube1;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class YOUTUBE_1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private List<EntityType> mobs = new ArrayList<>();
    private Random random;

    public void randomMob(Location loc) {
        mobs.add(EntityType.BAT);
        mobs.add(EntityType.OCELOT);
        mobs.add(EntityType.CHICKEN);
        mobs.add(EntityType.COD);
        mobs.add(EntityType.PARROT);
        mobs.add(EntityType.PIG);
        mobs.add(EntityType.RABBIT);
        mobs.add(EntityType.SALMON);
        mobs.add(EntityType.SQUID);
        mobs.add(EntityType.TROPICAL_FISH);
        mobs.add(EntityType.TURTLE);
        mobs.add(EntityType.PUFFERFISH);
        mobs.add(EntityType.WOLF);
        mobs.add(EntityType.DOLPHIN);
        mobs.add(EntityType.CAVE_SPIDER);
        mobs.add(EntityType.SPIDER);
        mobs.add(EntityType.ENDERMITE);
        mobs.add(EntityType.SILVERFISH);
        mobs.add(EntityType.SHULKER);
        mobs.add(EntityType.VEX);
        mobs.add(EntityType.CAT);
        mobs.add(EntityType.COD);
        mobs.add(EntityType.FOX);
        mobs.add(EntityType.PHANTOM);
        mobs.add(EntityType.TURTLE);
        mobs.add(EntityType.BAT);
        mobs.add(EntityType.OCELOT);
        mobs.add(EntityType.CHICKEN);
        mobs.add(EntityType.COD);
        mobs.add(EntityType.PARROT);
        mobs.add(EntityType.PIG);
        mobs.add(EntityType.RABBIT);
        mobs.add(EntityType.SALMON);
        mobs.add(EntityType.SQUID);
        mobs.add(EntityType.TROPICAL_FISH);
        mobs.add(EntityType.TURTLE);
        mobs.add(EntityType.PUFFERFISH);
        mobs.add(EntityType.WOLF);
        mobs.add(EntityType.DOLPHIN);
        mobs.add(EntityType.CAVE_SPIDER);
        mobs.add(EntityType.SPIDER);
        mobs.add(EntityType.ENDERMITE);
        mobs.add(EntityType.SILVERFISH);
        mobs.add(EntityType.SHULKER);
        mobs.add(EntityType.VEX);
        mobs.add(EntityType.COW);
        mobs.add(EntityType.MUSHROOM_COW);
        mobs.add(EntityType.MULE);
        mobs.add(EntityType.SHEEP);
        mobs.add(EntityType.VILLAGER);
        mobs.add(EntityType.LLAMA);
        mobs.add(EntityType.POLAR_BEAR);
        mobs.add(EntityType.PIGLIN);
        mobs.add(EntityType.PIGLIN_BRUTE);
        mobs.add(EntityType.ZOMBIFIED_PIGLIN);
        mobs.add(EntityType.WARDEN);
        mobs.add(EntityType.BLAZE);
        mobs.add(EntityType.CREEPER);
        mobs.add(EntityType.DROWNED);
        mobs.add(EntityType.EVOKER);
        mobs.add(EntityType.GUARDIAN);
        mobs.add(EntityType.HUSK);
        mobs.add(EntityType.SKELETON);
        mobs.add(EntityType.STRAY);
        mobs.add(EntityType.VINDICATOR);
        mobs.add(EntityType.WITCH);
        mobs.add(EntityType.ZOMBIE);
        mobs.add(EntityType.ZOMBIE_VILLAGER);
        mobs.add(EntityType.ILLUSIONER);
        mobs.add(EntityType.SNOWMAN);
        mobs.add(EntityType.CAT);
        mobs.add(EntityType.COD);
        mobs.add(EntityType.FOX);
        mobs.add(EntityType.PHANTOM);
        mobs.add(EntityType.TURTLE);
        mobs.add(EntityType.PILLAGER);
        mobs.add(EntityType.WANDERING_TRADER);
        mobs.add(EntityType.BAT);
        mobs.add(EntityType.OCELOT);
        mobs.add(EntityType.CHICKEN);
        mobs.add(EntityType.COD);
        mobs.add(EntityType.PARROT);
        mobs.add(EntityType.PIG);
        mobs.add(EntityType.RABBIT);
        mobs.add(EntityType.SALMON);
        mobs.add(EntityType.SQUID);
        mobs.add(EntityType.TROPICAL_FISH);
        mobs.add(EntityType.TURTLE);
        mobs.add(EntityType.PUFFERFISH);
        mobs.add(EntityType.WOLF);
        mobs.add(EntityType.DOLPHIN);
        mobs.add(EntityType.CAVE_SPIDER);
        mobs.add(EntityType.SPIDER);
        mobs.add(EntityType.ENDERMITE);
        mobs.add(EntityType.SILVERFISH);
        mobs.add(EntityType.SHULKER);
        mobs.add(EntityType.VEX);
        mobs.add(EntityType.COW);
        mobs.add(EntityType.MUSHROOM_COW);
        mobs.add(EntityType.MULE);
        mobs.add(EntityType.SHEEP);
        mobs.add(EntityType.VILLAGER);
        mobs.add(EntityType.LLAMA);
        mobs.add(EntityType.POLAR_BEAR);
        mobs.add(EntityType.BLAZE);
        mobs.add(EntityType.CREEPER);
        mobs.add(EntityType.DROWNED);
        mobs.add(EntityType.EVOKER);
        mobs.add(EntityType.GUARDIAN);
        mobs.add(EntityType.HUSK);
        mobs.add(EntityType.SKELETON);
        mobs.add(EntityType.STRAY);
        mobs.add(EntityType.VINDICATOR);
        mobs.add(EntityType.WITCH);
        mobs.add(EntityType.ZOMBIE);
        mobs.add(EntityType.ZOMBIE_VILLAGER);
        mobs.add(EntityType.ILLUSIONER);
        mobs.add(EntityType.SNOWMAN);
        mobs.add(EntityType.HORSE);
        mobs.add(EntityType.DONKEY);
        mobs.add(EntityType.MULE);
        mobs.add(EntityType.SKELETON_HORSE);
        mobs.add(EntityType.ZOMBIE_HORSE);
        mobs.add(EntityType.SLIME);
        mobs.add(EntityType.MAGMA_CUBE);
        mobs.add(EntityType.GHAST);
        mobs.add(EntityType.WITHER_SKELETON);
        mobs.add(EntityType.WITHER);
        mobs.add(EntityType.IRON_GOLEM);
        mobs.add(EntityType.ENDER_DRAGON);
        mobs.add(EntityType.GIANT);
        mobs.add(EntityType.ENDERMAN);
        mobs.add(EntityType.CAT);
        mobs.add(EntityType.COD);
        mobs.add(EntityType.FOX);
        mobs.add(EntityType.PHANTOM);
        mobs.add(EntityType.TURTLE);
        mobs.add(EntityType.PILLAGER);
        mobs.add(EntityType.WANDERING_TRADER);
        mobs.add(EntityType.PANDA);
        mobs.add(EntityType.PANDA);
        mobs.add(EntityType.RAVAGER);
        mobs.add(EntityType.TRADER_LLAMA);
        random = new Random();

        EntityType toSpawn = mobs.get(random.nextInt(mobs.size()));

        loc.getWorld().spawnEntity(loc, toSpawn);
    }

    @EventHandler
    public void onTakeDamage(EntityDamageEvent event) {
        if (!(event.getEntity() instanceof Player)) return;

        randomMob(event.getEntity().getLocation());

    }

}
