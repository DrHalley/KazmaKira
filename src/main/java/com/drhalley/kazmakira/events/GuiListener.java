package com.drhalley.kazmakira.events;

import com.drhalley.kazmakira.KazmaKira;
import com.drhalley.kazmakira.tasks.KazmaClick;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.io.IOException;

public class GuiListener implements Listener {
    private final KazmaKira kazmaKira;

    public GuiListener(KazmaKira kazmaKira){
        this.kazmaKira = kazmaKira;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) throws IOException {
        if(!event.getView().getTitle().equals("Kirala")) return;
        event.setCancelled(true);
        event.setResult(Event.Result.DENY);
        Player player = (Player) event.getWhoClicked();
        player.setItemOnCursor(null);
        KazmaClick kazmaClick = new KazmaClick((Player) event.getWhoClicked());
        if(event.getRawSlot() == 10){

            kazmaClick.kazma1Click(kazmaKira.database, kazmaKira.file, kazmaKira);


        }else if(event.getRawSlot() == 12){

            kazmaClick.kazma2Click(kazmaKira.database, kazmaKira.file, kazmaKira);


        }else if(event.getRawSlot() == 14){

            kazmaClick.kazma3Click(kazmaKira.database, kazmaKira.file, kazmaKira);


        } else if (event.getRawSlot() == 16) {

            kazmaClick.kazma4Click(kazmaKira.database, kazmaKira.file, kazmaKira);


        }
    }


}
