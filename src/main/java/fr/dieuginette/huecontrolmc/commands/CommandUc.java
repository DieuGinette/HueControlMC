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

import java.sql.Struct;
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
                    final ItemStack Levier = new ItemStack(Material.LEVER, 1);
                    final ItemStack WhiteWool = new ItemStack(Material.WHITE_WOOL, 1);
                    final ItemStack OrangeWool = new ItemStack(Material.ORANGE_WOOL, 1);
                    final ItemStack MagentaWool = new ItemStack(Material.MAGENTA_WOOL, 1);
                    final ItemStack BlueWool = new ItemStack(Material.LIGHT_BLUE_WOOL, 1);
                    final ItemStack YellowWool = new ItemStack(Material.YELLOW_WOOL, 1);
                    final ItemMeta leviermeta = Levier.getItemMeta();
                    final ItemMeta WhiteWoolMeta = WhiteWool.getItemMeta();
                    final ItemMeta OrangeWoolMeta = OrangeWool.getItemMeta();
                    final ItemMeta MagentaWoolMeta = MagentaWool.getItemMeta();
                    final ItemMeta BlueWoolMeta = BlueWool.getItemMeta();
                    final ItemMeta YellowWoolMeta = YellowWool.getItemMeta();
                    final List<String> Levierlist = Arrays.asList("Ce levier", "Permet d'éteindre", "Et d'allumer la lumière", "C'est dingue, c'est vrai !");
                    final List<String> WhiteWoolList = Arrays.asList("Cette laine blanche", "Permet d'allumer la lumière", "§fEn blanc", "INCROYABLE !");
                    final List<String> OrangeWoolList = Arrays.asList("Cette laine orange", "Permet d'allumer la lumière", "§6En orange", "FANTASTIQUE !");
                    final List<String> MagentaWoolList = Arrays.asList("Cette laine magenta", "Permet d'allumer la lumière", "§dEn magenta", "PRODIGIEUX !");
                    final List<String> BlueWoolList = Arrays.asList("Cette laine blue", "Permet d'allumer la lumière", "§3En bleu", "MIRACULEUX !");
                    final List<String> YellowWoolList = Arrays.asList("Cette laine jaune", "Permet d'allumer la lumière", "§eEn jaune", "IMPENSABLE !");
                    leviermeta.setDisplayName(ChatColor.AQUA + "On/Off");
                    WhiteWoolMeta.setDisplayName(ChatColor.WHITE +"Lumière blanche");
                    OrangeWoolMeta.setDisplayName(ChatColor.GOLD +"Lumière orange");
                    MagentaWoolMeta.setDisplayName(ChatColor.LIGHT_PURPLE +"Lumière magenta");
                    BlueWoolMeta.setDisplayName(ChatColor.DARK_AQUA +"Lumière bleu");
                    YellowWoolMeta.setDisplayName(ChatColor.YELLOW + "Lumière jaune");
                    leviermeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                    WhiteWoolMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                    OrangeWoolMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                    MagentaWoolMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                    BlueWoolMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                    YellowWoolMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                    leviermeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    WhiteWoolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    OrangeWoolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    MagentaWoolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    BlueWoolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    YellowWoolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    leviermeta.setLore(Levierlist);
                    WhiteWoolMeta.setLore(WhiteWoolList);
                    OrangeWoolMeta.setLore(OrangeWoolList);
                    MagentaWoolMeta.setLore(MagentaWoolList);
                    BlueWoolMeta.setLore(BlueWoolList);
                    YellowWoolMeta.setLore(YellowWoolList);

                    Levier.setItemMeta(leviermeta);
                    WhiteWool.setItemMeta(WhiteWoolMeta);
                    OrangeWool.setItemMeta(OrangeWoolMeta);
                    MagentaWool.setItemMeta(MagentaWoolMeta);
                    BlueWool.setItemMeta(BlueWoolMeta);
                    YellowWool.setItemMeta(YellowWoolMeta);
                    player.getInventory().addItem(Levier);
                    player.getInventory().addItem(WhiteWool);
                    player.getInventory().addItem(OrangeWool);
                    player.getInventory().addItem(MagentaWool);
                    player.getInventory().addItem(BlueWool);
                    player.getInventory().addItem(YellowWool);

                } else {
                    player.sendMessage("usage : /uc give");
                }
            }

        }

        return true;
    }

}
