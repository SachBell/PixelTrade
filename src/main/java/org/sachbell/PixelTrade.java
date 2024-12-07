package org.sachbell;

import org.bukkit.plugin.java.JavaPlugin;
import org.sachbell.Commands.*;
import org.sachbell.Events.MenuListener;

public class PixelTrade extends JavaPlugin {

    @Override
    public void onEnable() {

        // Commands
        getLogger().info("PixelTrade Habilitado para Minecraft 1.8 - 1.12.2");
        getCommand("token").setExecutor(new TokenCommand());
        getCommand("rc").setExecutor(new ReloadCommand(this));
        getCommand("shop").setExecutor(new ShopCommand());
        getCommand("infoshop").setExecutor(new InfoCommand());

        // Events
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("PixelTrade Deshabilitado.");
    }
}