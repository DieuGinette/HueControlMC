package fr.dieuginette.huecontrolmc.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class CommandUc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length <1) {
                player.sendMessage("§b GUI a faire");
            }
            else {
                if (args[0].equalsIgnoreCase("give")) {
                    final ItemStack itemStack = new ItemStack(Material.LEVER, 1);
                    final ItemMeta leviermeta = itemStack.getItemMeta();
                    final List<String> Levierlist = Arrays.asList("Ce levier", "Permet d'éteindre", "Et d'allumer la lumière", "C'est dingue, c'est vrai !");

                    leviermeta.setDisplayName(ChatColor.AQUA + "On/Off");
                    leviermeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                    leviermeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    leviermeta.setLore(Levierlist);

                    itemStack.setItemMeta(leviermeta);
                    player.getInventory().addItem(itemStack);

                } else {
                    player.sendMessage("usage : /uc give");
                }
            }

        }

        return true;
    }

}
