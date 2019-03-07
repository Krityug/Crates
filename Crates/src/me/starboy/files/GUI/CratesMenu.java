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

public class CratesMenu implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command,String cmd,String[] args) {
        if(cmd.equalsIgnoreCase("crates")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(Color.add("&7[&B&LCra&F&Ltes&7]: &C&LPlease use this command in game only"));
                return true;
            }

            Player player = (Player) sender;

            Inventory cratesmenu = Bukkit.createInventory(null,54,Color.add("&B&LCrates &F&LMenu"));

            ItemStack turtle = Item.create(Material.ENDER_CHEST,1,"&B&LTurtle &F&LCrate","&7Turtle Crate is a good crate for new comers.;&7This crate can have a lot of prizes you won't except");

            ItemStack ice = Item.create(Material.CHEST,1,"&B&LIce &F&LCrate","&7Ice crate is only ;&7for Ice Rank Members. You may find ;&7spawners inside this crate.");









            cratesmenu.setItem(10,turtle);
            player.openInventory(cratesmenu);
            cratesmenu.setItem(13,ice);















        }
        return true;
    }


















}
