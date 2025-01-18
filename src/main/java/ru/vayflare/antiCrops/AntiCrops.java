package ru.vayflare.antiCrops;

import org.bukkit.plugin.java.JavaPlugin;
import org.jspecify.annotations.NullMarked;

/**
 * Main class for the AntiCrops plugin.
 * This plugin prevents players from trampling crops by cancelling the physical interaction with farmland blocks.
 */
@NullMarked
public final class AntiCrops extends JavaPlugin {

    /**
     * Called when the plugin is enabled.
     * Registers the PlayerInteractListener to handle player interactions.
     */
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
    }

    /**
     * Called when the plugin is disabled.
     */
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}