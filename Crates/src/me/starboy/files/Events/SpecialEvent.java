package me.starboy.files.Events;

import me.starboy.files.Utils.Color;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import me.starboy.files.Utils.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class SpecialEvent implements Listener {

        @EventHandler
        public void InvClick(InventoryClickEvent event)
        {
            if (event.getClickedInventory() == null) return;
            String title = event.getClickedInventory().getTitle();
            if (title.equals(Color.add("&B&LOmega &F&LRank"))) {
                event.setCancelled(true);

                switch (event.getCurrentItem().getType())
                {
                    case ENDER_PORTAL_FRAME:

                        Bukkit.dispatchCommand(event.getWhoClicked(),"realms");

                    case GRASS:


                    case BLAZE_POWDER:
                }

            }
        }
    }


