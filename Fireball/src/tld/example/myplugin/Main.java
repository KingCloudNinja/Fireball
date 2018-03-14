package tld.example.myplugin;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
    	Bukkit.getPluginManager().registerEvents((Listener) this, this);
    }
	
		
 		@EventHandler
 		
	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	    
	    	Player player = (Player) sender;
	    	
	    	
	    	if(commandLabel.equalsIgnoreCase("about")){
	    		player.sendMessage(ChatColor.GOLD + "Fireball Plugin " + ChatColor.GRAY + "Created by: KingCloudNinja. Get more plugins here: https://discord.gg/zGTRYuh");	
	    	}
	    	if(commandLabel.equalsIgnoreCase("fb")){
	    	                 player.launchProjectile(SmallFireball.class).setVelocity(player.getLocation().getDirection().multiply(0.1));
	    	                 player.playSound(player.getLocation(), Sound.GHAST_FIREBALL, 10, 1);
	    	}
	    	
		
 		
    	return false;
 	}
 
}
