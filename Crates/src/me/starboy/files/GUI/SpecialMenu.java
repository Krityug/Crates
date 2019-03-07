package me.starboy.files.GUI;

import me.starboy.files.Utils.Color;
import me.starboy.files.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SpecialMenu implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command,String cmd,String[] args) {
        if(cmd.equalsIgnoreCase("omega")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(Color.add("&7[&B&LCra&F&Ltes&7]: &C&LPlease use this command in game only"));
                return true;
            }

            Player player = (Player) sender;

            Inventory omega = Bukkit.createInventory(null,54,Color.add("&B&LOmega &F&LRank"));

            //This is the Omega Lounge Item
            ItemStack table = Item.create(Material.ENDER_PORTAL_FRAME,1,"&A&LOmega Lounge",";&F&LDescription;&7Omega lounge is a place to improve your;&7economy skills by trading with others.;;&E&LCooldown: &D&LNONE!;;&A&LPurchase Access For: ;&754 points.;;&AClick to Purchase");

            //This is the Plots for omega ranks


            ItemStack plots = Item.create(Material.GRASS,1,"&A&LOmega Plots",";&F&LDescription;&7Omega Plots are special plots where all nice builds ;&7and tools can be used it's like creative mode.;;&E&LMax Plots: &D&L5;;&A&LPurchased;;&AClick to go to Omega Plots");

            //This is the Omega Drop Party

            ItemStack dropparty = Item.create(Material.BLAZE_POWDER,1,"&A&LOmega Drop Party",";&F&LDescription;&7Omega Drop Party is where staff members throw items;&7when we reach our Drop Party goal.;;&E&LStatus: &A&LOnline;;&AClick to join Drop Party Server");
















            player.openInventory(omega);
            omega.setItem(22,table);
            omega.setItem(13,plots);
            omega.setItem(24,dropparty);














        }
        return true;
    }






















}
