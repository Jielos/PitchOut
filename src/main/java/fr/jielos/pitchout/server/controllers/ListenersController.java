package fr.jielos.pitchout.server.controllers;

import fr.jielos.pitchout.server.listeners.*;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenersController extends ServerController {

    public ListenersController(JavaPlugin instance) {
        super(instance);
    }

    @Override
    public void register() {
        final PluginManager pluginManager = instance.getServer().getPluginManager();

        pluginManager.registerEvents(new PlayerLogin(), instance);
        pluginManager.registerEvents(new PlayerJoin(), instance);
        pluginManager.registerEvents(new PlayerQuit(), instance);

        pluginManager.registerEvents(new PlayerDropItem(), instance);

        pluginManager.registerEvents(new PlayerMove(), instance);
        pluginManager.registerEvents(new EntityDamage(), instance);
        pluginManager.registerEvents(new EntityDamageByEntity(), instance);
    }
}
