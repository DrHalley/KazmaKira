package com.drhalley.kazmakira;

import com.drhalley.kazmakira.commands.KiralaCommand;
import com.drhalley.kazmakira.events.GuiListener;
import com.drhalley.kazmakira.events.JoinQuitEvent;
import com.drhalley.kazmakira.events.Security;
import com.drhalley.kazmakira.tasks.KazmaClick;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class KazmaKira extends JavaPlugin {
    private static Economy econ = null;
    public YamlConfiguration database;
    public File file;
    public HashMap<String, Long> playerTimes = new HashMap<String, Long>();

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            getLogger().severe(String.format("[%s] - vault yok", getDescription().getName()));
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            getLogger().severe(String.format("[%s] - ekonomi yok", getDescription().getName()));
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    public static Economy getEconomy() {
        return econ;
    }

    @Override
    public void onEnable() {
        if (!setupEconomy() ) {
            getLogger().severe(String.format("[%s] - Vault bulunamadı. Plugin kapatılıyor", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        getCommand("kirala").setExecutor(new KiralaCommand());
        Bukkit.getPluginManager().registerEvents(new GuiListener(this), this);
        Bukkit.getPluginManager().registerEvents(new JoinQuitEvent(this), this);
        Bukkit.getPluginManager().registerEvents(new Security(this), this);
        file = new File(getDataFolder() , "database.yml");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        database = YamlConfiguration.loadConfiguration(file);

    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
