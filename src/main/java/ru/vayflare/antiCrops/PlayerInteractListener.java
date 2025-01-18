package ru.vayflare.antiCrops;

/*
 * Copyright (c) 2025 By Vayflare,
 */

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NullMarked;

import java.util.Objects;

/**
 * Listens for player interactions to prevent trampling of crops.
 * Cancels the interaction if the player attempts to trample farmland.
 */
@NullMarked
public class PlayerInteractListener implements Listener {

    /**
     * Handles player interaction events.
     * Checks if the interaction is a physical action on farmland and cancels it if so.
     *
     * @param e The player interaction event.
     */
    @EventHandler
    @Contract(pure = false)
    public void onTrample(@NotNull PlayerInteractEvent e) {
        if (e.getAction() == Action.PHYSICAL && Objects.requireNonNull(e.getClickedBlock()).getType() == Material.FARMLAND) {
            e.setCancelled(true);
        }
    }
}