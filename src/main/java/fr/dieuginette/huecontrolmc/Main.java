package fr.dieuginette.huecontrolmc;

import fr.dieuginette.huecontrolmc.commands.CommandUc;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Bienvenue dans le plugin");
        getCommand("uc").setExecutor(new CommandUc());
    }

    @Override
    public void onDisable() {
        System.out.println("Merci d'avoir utiliser le plugin");
    }
}