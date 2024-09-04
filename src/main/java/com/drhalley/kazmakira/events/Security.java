package com.drhalley.kazmakira.events;

import com.drhalley.kazmakira.KazmaKira;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Iterator;
import java.util.ListIterator;

public class Security implements Listener {

    private KazmaKira kazmaKira;

    public Security(KazmaKira kazmaKira){
        this.kazmaKira = kazmaKira;
    }
    @EventHandler
    public  void onDrop(PlayerDropItemEvent event){
        Player player = event.getPlayer();
        if(event.getItemDrop().getItemStack().getItemMeta() != null){
            ItemMeta meta = event.getItemDrop().getItemStack().getItemMeta();
            if(meta.getPersistentDataContainer() != null){
                NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
                if(meta.getPersistentDataContainer().get(key, PersistentDataType.STRING) != null) {
                    if (meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma1")
                            || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma2")
                            || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma3")
                            || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma4")) {
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
    @EventHandler
    public void onClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        if(event.getCurrentItem() != null){
            if(event.getCurrentItem().getItemMeta() != null){
                ItemMeta meta = event.getCurrentItem().getItemMeta();
                if (meta.getPersistentDataContainer() != null) {
                    NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
                    if(meta.getPersistentDataContainer().get(key, PersistentDataType.STRING) != null){
                        if (meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma1")
                                || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma2")
                                || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma3")
                                || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma4")) {
                            event.setCancelled(true);
                        }
                    }

                }
            }
        }
        if(event.getClick().equals(ClickType.NUMBER_KEY)){
            ItemStack item = event.getWhoClicked().getInventory().getItem(event.getHotbarButton());
            if(item != null){
                if(item.getItemMeta() != null){
                    ItemMeta meta = item.getItemMeta();;
                    NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
                    if(meta.getPersistentDataContainer().get(key, PersistentDataType.STRING) != null){
                        if (meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma1")
                                || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma2")
                                || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma3")
                                || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(player.getUniqueId() + ".kazma4")) {
                            event.setCancelled(true);
                            event.setResult(Event.Result.DENY);
                        }
                    }
                }
            }
        }
    }
    @EventHandler
    public void onDrag(InventoryDragEvent event){
        if(!event.getView().getTitle().equals("Kirala")) return;
        event.setCancelled(true);

    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        for(ItemStack itemStack : event.getEntity().getInventory()){
            if(itemStack == null) return;
            if(itemStack.hasItemMeta()){
                ItemMeta meta = itemStack.getItemMeta();
                NamespacedKey key = new NamespacedKey(kazmaKira, "Sy7MnO0Ik5F");
              if(meta != null) {


                  if (meta.getPersistentDataContainer().get(key, PersistentDataType.STRING) != null) {
                      if (meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getEntity().getPlayer().getUniqueId() + ".kazma1")
                              || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getEntity().getPlayer().getUniqueId() + ".kazma2")
                              || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getEntity().getPlayer().getUniqueId() + ".kazma3")
                              || meta.getPersistentDataContainer().get(key, PersistentDataType.STRING).equalsIgnoreCase(event.getEntity().getPlayer().getUniqueId() + ".kazma4")){
                          Iterator<ItemStack> iterator = event.getDrops().iterator();
                          while(iterator.hasNext()){
                              if(iterator.next().equals(itemStack)){
                                  iterator.remove();
                              }
                          }
                      }

                  }
              }
            }
        }
    }
}
