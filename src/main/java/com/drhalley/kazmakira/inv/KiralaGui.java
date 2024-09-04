package com.drhalley.kazmakira.inv;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiralaGui {
    private Player player;
    public KiralaGui(Player player){
        this.player = player;
    }

    public static String translateColors(String string) {
        if (string == null) return "";
        String parsedStr = string.replaceAll("\\{(#[0-9A-f]{6})\\}", "&$1");

        if (Pattern.compile("&#[0-9A-f]{6}").matcher(parsedStr).find()) {
            Matcher matcher = Pattern.compile("&(#[0-9A-f]{6})").matcher(parsedStr);
            while (matcher.find()) {
                parsedStr = parsedStr.replaceFirst(
                        matcher.group(),
                        ChatColor.of(matcher.group(1)).toString()
                );
            }
        }
        return ChatColor.translateAlternateColorCodes('&', parsedStr);
    }

    public void create(){
        Inventory inv = Bukkit.createInventory(player, InventoryType.CHEST, "Kirala");

        /* kazma 1*/
        ItemStack kazma1 = new ItemStack(Material.DIAMOND_PICKAXE);
        kazma1.addEnchantment(Enchantment.DIG_SPEED, 2);
        kazma1.addEnchantment(Enchantment.DURABILITY, 3);
        ItemMeta meta1 = kazma1.getItemMeta();
        List<String> lore1 = new ArrayList<>();
        meta1.setDisplayName(translateColors("&#25FF00&lG&#26F200&lÜ&#28E400&lN&#29D700&lL&#2ACA00&lÜ&#2CBC00&lK &#2FA100&lK&#309400&lA&#318700&lZ&#337900&lM&#346C00&lA"));
        meta1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        lore1.add(translateColors("&#25FF00V&#27EF00e&#28DE00r&#2ACE00i&#2CBE00m&#2DAD00l&#2F9D00i&#318D00l&#327C00i&#346C00k &fII"));
        lore1.add(translateColors("&#25FF00K&#27F000ı&#28E200r&#2AD300ı&#2BC400l&#2DB600m&#2EA700a&#309800z&#318900l&#337B00ı&#346C00k &fIII"));
        lore1.add(translateColors("&#25FF00G&#25FB00ü&#26F600n&#26F200l&#27ED00ü&#27E900k &#28E0003&#29DB000&#29D700D&#2AD200K&#2ACE00l&#2ACA00i&#2BC500ğ&#2BC100i&#2CBC00n&#2CB800e &#2DAF00k&#2EAA00i&#2EA600r&#2FA100a&#2F9D00l&#2F9900ı&#309400y&#309000a&#318B00b&#318700i&#328200l&#327E00i&#337900r&#337500s&#347000i&#346C00n"));


        lore1.add(ChatColor.DARK_RED + "Dikkat: Kazmayı alırken elinin boş olmasına dikkat et");
        meta1.setLore(lore1);
        kazma1.setItemMeta(meta1);
        /*kazma 2*/
        ItemStack kazma2 = new ItemStack(Material.DIAMOND_PICKAXE);
        kazma2.addEnchantment(Enchantment.DIG_SPEED, 3);
        kazma2.addEnchantment(Enchantment.DURABILITY, 3);
        ItemMeta meta2 = kazma2.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta2.setDisplayName(translateColors("&#FF8F00&lL&#FF8200&lE&#FF7500&lG&#FF6800&lE&#FF5B00&lN&#FF4E00&lD &#FF3400&lK&#FF2700&lA&#FF1A00&lZ&#FF0D00&lM&#FF0000&lA"));
        List<String> lore2 = new ArrayList<>();
        lore2.add(translateColors("&#FF8F00V&#FF7F00e&#FF6F00r&#FF5F00i&#FF4F00m&#FF4000l&#FF3000i&#FF2000l&#FF1000i&#FF0000k &fIII"));
        lore2.add(translateColors("&#FF8F00K&#FF8100ı&#FF7200r&#FF6400ı&#FF5600l&#FF4800m&#FF3900a&#FF2B00z&#FF1D00l&#FF0E00ı&#FF0000k &fIII"));
        lore2.add(translateColors("&#FF8F00B&#FF8D00u &#FF8800k&#FF8600a&#FF8400z&#FF8200m&#FF7F00a&#FF7D00y&#FF7B00ı &#FF76002 &#FF7200s&#FF7000a&#FF6D00a&#FF6B00t&#FF6900t&#FF6700e &#FF6200b&#FF6000i&#FF5E00r &#FF59005&#FF5700K &#FF5300f&#FF5000i&#FF4E00y&#FF4C00a&#FF4A00t&#FF4800ı&#FF4500n&#FF4300a &#FF3F001 &#FF3A00s&#FF3800a&#FF3600a&#FF3300t&#FF3100l&#FF2F00i&#FF2D00ğ&#FF2A00i&#FF2800n&#FF2600e &#FF2200k&#FF1F00i&#FF1D00r&#FF1B00a&#FF1900l&#FF1600ı&#FF1400y&#FF1200a&#FF1000b&#FF0D00i&#FF0B00l&#FF0900i&#FF0700r&#FF0400s&#FF0200i&#FF0000n"));

        lore2.add(ChatColor.DARK_RED + "Dikkat: Kazmayı alırken elinin boş olmasına dikkat et");
        meta2.setLore(lore2);
        kazma2.setItemMeta(meta2);
        /* kazma 3 */
        ItemStack kazma3 = new ItemStack(Material.DIAMOND_PICKAXE);
        kazma3.addEnchantment(Enchantment.DIG_SPEED, 4);
        kazma3.addEnchantment(Enchantment.DURABILITY, 3);
        kazma3.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 2);
        ItemMeta meta3 = kazma3.getItemMeta();
        meta3.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta3.setDisplayName(translateColors("&#7100FF&lS&#7900FF&lP&#8200FF&lE&#8A00FF&lC&#9200FF&lİ&#9A00FF&lA&#A300FF&lL &#B300FF&lK&#BB00FF&lA&#C400FF&lZ&#CC00FF&lM&#D400FF&lA"));
        List<String> lore3 = new ArrayList<>();
        lore3.add(translateColors("&#7100FFV&#7B00FFe&#8500FFr&#8F00FFi&#9900FFm&#A300FFl&#AC00FFi&#B600FFl&#C000FFi&#CA00FFk  &fIV"));
        lore3.add(translateColors("&#7100FFK&#7B00FFı&#8500FFr&#8F00FFı&#9900FFl&#A300FFm&#AC00FFa&#B600FFz&#C000FFl&#CA00FFı&#D400FFk &fIII"));
        lore3.add(translateColors("&#7100FFS&#8500FFe&#9900FFr&#AC00FFv&#C000FFe&#D400FFt &FII"));
        lore3.add(translateColors("&#7100FFB&#7300FFu &#7700FFk&#7900FFa&#7B00FFz&#7C00FFm&#7E00FFa&#8000FFy&#8200FFı &#8600FF1&#8800FF0&#8A00FFK &#8E00FFf&#8F00FFi&#9100FFy&#9300FFa&#9500FFt&#9700FFı&#9900FFn&#9B00FFa &#9F00FF2 &#A300FFs&#A400FFa&#A600FFa&#A800FFt&#AA00FFl&#AC00FFi&#AE00FFğ&#B000FFi&#B200FFn&#B400FFe &#B700FFk&#B900FFi&#BB00FFr&#BD00FFa&#BF00FFl&#C100FFı&#C300FFy&#C500FFa&#C700FFb&#C900FFi&#CA00FFl&#CC00FFi&#CE00FFr&#D000FFs&#D200FFi&#D400FFn"));
        lore3.add(ChatColor.DARK_RED + "Dikkat: Kazmayı alırken elinin boş olmasına dikkat et");
        meta3.setLore(lore3);
        kazma3.setItemMeta(meta3);
        /*kazma 4*/
        ItemStack kazma4 = new ItemStack(Material.DIAMOND_PICKAXE);
        kazma4.addEnchantment(Enchantment.DIG_SPEED, 5);
        kazma4.addEnchantment(Enchantment.DURABILITY, 3);
        kazma4.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        ItemMeta meta4 = kazma4.getItemMeta();
        meta4.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta4.setDisplayName(translateColors("&#FF0000&lM&#FF0000&lA&#FF0000&lS&#FF0000&lT&#FF0000&lE&#FF0000&lR &#FFFFFF&lK&#FFFFFF&lA&#FFFFFF&lZ&#FFFFFF&lM&#FFFFFF&lA"));
        List<String> lore4 = new ArrayList<>();
        lore4.add(translateColors("&#FF0000V&#FF1C1Ce&#FF3939r&#FF5555i&#FF7171m&#FF8E8El&#FFAAAAi&#FFC6C6l&#FFE3E3i&#FFFFFFk &fV"));
        lore4.add(translateColors("&#FF0000K&#FF1A1Aı&#FF3333r&#FF4D4Dı&#FF6666l&#FF8080m&#FF9999a&#FFB3B3z&#FFCCCCl&#FFE6E6ı&#FFFFFFk &fIII"));
        lore4.add(translateColors("&#FF0000S&#FF3333e&#FF6666r&#FF9999v&#FFCCCCe&#FFFFFFt &fIII"));
        lore4.add(translateColors("&#FF0000B&#FC0000u &#F60000k&#F30000a&#F00000z&#ED0000m&#EA0000a&#E70000y&#E50000ı &#DF00001&#DC00005&#D90000K &#D30000f&#D00000i&#CD0000y&#CA0000a&#C70000t&#C40000ı&#C10000n&#BE0000a &#B800002 &#B30000s&#B00000a&#AD0000a&#AA0000t&#A70000l&#A40000i&#A10000ğ&#9E0000i&#9B0000n&#980000e &#920000k&#8F0000i&#8C0000r&#890000a&#860000l&#830000ı&#800000y&#7E0000a&#7B0000b&#780000i&#750000l&#720000i&#6F0000r&#6C0000s&#690000i&#660000n"));
        lore4.add(ChatColor.DARK_RED + "Dikkat: Kazmayı alırken elinin boş olmasına dikkat et");
        meta4.setLore(lore4);
        kazma4.setItemMeta(meta4);
        /* envanter */
        inv.setItem(10, kazma1);
        inv.setItem(12, kazma2);
        inv.setItem(14, kazma3);
        inv.setItem(16, kazma4);
        player.openInventory(inv);
    }

}
