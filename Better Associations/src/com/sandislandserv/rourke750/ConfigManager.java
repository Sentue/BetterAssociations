package com.sandislandserv.rourke750;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {
	
	public void initconfig(FileConfiguration config){
		config.options().header("Author Rourke750\r\n" +
				"sql information is self explanitory.\r\n"
				+ "To use the gui options from a remote computer, open port 25549");
		if (!config.contains("sql.hostname")) config.set("sql.hostname", "localhost");
		
		if (!config.contains("sql.port")) config.set("sql.port", 3306);
		
		if (!config.contains("sql.dbname")) config.set("sql.dbname", "BetterAssociation");
		
		if (!config.contains("sql.username")) config.set("sql.username", "");
		
		if (!config.contains("sql.password")) config.set("sql.password", "");
		
		if (!config.contains("send_data")) config.set("send_data", true);
		
		if (!config.contains("gui_options.username")) config.set("gui_options.username", "");
		
		if (!config.contains("gui_options.password")) config.set("gui_options.password", "");
	}
}