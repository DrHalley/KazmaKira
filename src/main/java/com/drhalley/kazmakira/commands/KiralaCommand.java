package com.drhalley.kazmakira.commands;

import com.drhalley.kazmakira.inv.KiralaGui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KiralaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) return false;
        Player p = (Player) commandSender;
        KiralaGui gui = new KiralaGui(p);
        gui.create();
        return true;
    }
}
