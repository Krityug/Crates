package me.starboy.files;

import me.starboy.files.Events.CratesMenuEvent;
import me.starboy.files.Events.RealmsMenuEvent;
import me.starboy.files.Events.SpecialEvent;
import me.starboy.files.GUI.CratesMenu;
import me.starboy.files.GUI.RealmsMenu;
import me.starboy.files.GUI.SpecialMenu;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MainCrates extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Crates have been enabled");
        this.getCommand("crates").setExecutor(new CratesMenu());
        this.getCommand("realms").setExecutor(new RealmsMenu());
        this.getCommand("omega").setExecutor(new SpecialMenu());
        Bukkit.getPluginManager().registerEvents(new CratesMenuEvent(),this);
        Bukkit.getPluginManager().registerEvents(new RealmsMenuEvent(),this);
        Bukkit.getPluginManager().registerEvents(new SpecialEvent(),this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Crates has been disabled");
    }
}
