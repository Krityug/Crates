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


public class RealmsMenu implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command,String cmd,String[] args) {
        if(cmd.equalsIgnoreCase("realms")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Color.add("&7[&B&LRea&F&Llms&7]: &C&LPlease use this command inside your game only"));
                return true;
            }

            Player player = (Player) sender;

            Inventory realms = Bukkit.createInventory(null,54,Color.add("&B&LRea&F&Llms"));

            ItemStack Tier1 = Item.create(Material.EMERALD_BLOCK,1,"&D&LEssence","&7Essence Realm is a cool place to chill around ;&7and to play with your friends;&7like pvp or other nice perks ;;&D&LFeatures:;&7* PvP Enabled;&7* Vault Access;&7* Shop Access;;&D&LRank Required: &C&LDonator");


            player.openInventory(realms);
            realms.setItem(22,Tier1);














        }
        return true;
    }



















}
