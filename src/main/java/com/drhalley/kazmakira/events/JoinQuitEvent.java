package com.drhalley.kazmakira.events;

import com.drhalley.kazmakira.KazmaKira;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class JoinQuitEvent implements Listener {

    private KazmaKira kazmaKira;

    public JoinQuitEvent(KazmaKira kazmaKira){
        this.kazmaKira = kazmaKira;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma1") != null){
            Bukkit.getScheduler().runTaskLater(kazmaKira, new Runnable() {
                @Override
                public void run() {
                    NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
                    for(ItemStack item : event.getPlayer().getInventory()){
                        if(item != null){
                            if (item.getItemMeta() != null) {
                                if (item.getItemMeta().getPersistentDataContainer() != null) {
                                    if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING) != null) {
                                        if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getPlayer().getUniqueId() + ".kazma1")) {
                                            event.getPlayer().getInventory().remove(item);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    event.getPlayer().sendMessage(ChatColor.DARK_RED + "Kazmanın Süresi Bitti!");
                    kazmaKira.playerTimes.remove(event.getPlayer().getUniqueId() + ".kazma1");
                }
            }, (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() +".kazma1"))/50);

        }
        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma2") != null){
            Bukkit.getScheduler().runTaskLater(kazmaKira, new Runnable() {
                @Override
                public void run() {

                    NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
                    for(ItemStack item : event.getPlayer().getInventory()){
                        if(item != null){
                            if (item.getItemMeta() != null) {
                                if (item.getItemMeta().getPersistentDataContainer() != null) {
                                    if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING) != null) {
                                        if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getPlayer().getUniqueId() + ".kazma2")) {
                                            event.getPlayer().getInventory().remove(item);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    event.getPlayer().sendMessage(ChatColor.DARK_RED + "Kazmanın Süresi Bitti!");

                    kazmaKira.playerTimes.remove(event.getPlayer().getUniqueId() + ".kazma2");

                }
            }, (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() +".kazma2")) /50);

        }

        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma3") != null){
            Bukkit.getScheduler().runTaskLater(kazmaKira, new Runnable() {
                @Override
                public void run() {
                    NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
                    for(ItemStack item : event.getPlayer().getInventory()){

                        if(item != null){
                            if (item.getItemMeta() != null) {
                                if (item.getItemMeta().getPersistentDataContainer() != null) {
                                    if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING) != null) {
                                        if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getPlayer().getUniqueId() + ".kazma3")) {
                                            event.getPlayer().getInventory().remove(item);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    event.getPlayer().sendMessage(ChatColor.DARK_RED + "Kazmanın Süresi Bitti!");
                    kazmaKira.playerTimes.remove(event.getPlayer().getUniqueId() + ".kazma3");
                }
            }, (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() +".kazma3")) / 50);

        }

        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma4") != null){
            Bukkit.getScheduler().runTaskLater(kazmaKira, new Runnable() {
                @Override
                public void run() {
                    NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
                    for(ItemStack item : event.getPlayer().getInventory()){
                        if(item != null){
                            if (item.getItemMeta() != null) {
                                if (item.getItemMeta().getPersistentDataContainer() != null) {
                                    if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING) != null) {
                                        if (item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getPlayer().getUniqueId() + ".kazma4")) {
                                            event.getPlayer().getInventory().remove(item);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    event.getPlayer().sendMessage(ChatColor.DARK_RED + "Kazmanın Süresi Bitti!");
                    kazmaKira.playerTimes.remove(event.getPlayer().getUniqueId() + ".kazma4");
                }
            }, (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() +".kazma4")) /50);

        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma1") != null){
            kazmaKira.playerTimes.put(event.getPlayer().getUniqueId() + ".kazma1", (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma1") -(System.currentTimeMillis() - kazmaKira.database.getLong(event.getPlayer().getUniqueId() + ".kazma1.last_claimed"))));

        }
        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma2") != null){
            kazmaKira.playerTimes.put(event.getPlayer().getUniqueId() + ".kazma2", (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma2") -(System.currentTimeMillis() - kazmaKira.database.getLong(event.getPlayer().getUniqueId() + ".kazma2.last_claimed"))));

        }
        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma3") != null){
            kazmaKira.playerTimes.put(event.getPlayer().getUniqueId() + ".kazma3", (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma3") -(System.currentTimeMillis() - kazmaKira.database.getLong(event.getPlayer().getUniqueId() + ".kazma3.last_claimed"))));

        }
        if(kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma4") != null){
            kazmaKira.playerTimes.put(event.getPlayer().getUniqueId() + ".kazma4", (kazmaKira.playerTimes.get(event.getPlayer().getUniqueId() + ".kazma4") -(System.currentTimeMillis() - kazmaKira.database.getLong(event.getPlayer().getUniqueId() + ".kazma4.last_claimed"))));

        }
    }
}
