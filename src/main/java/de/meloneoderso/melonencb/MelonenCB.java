package de.meloneoderso.melonencb;

import de.meloneoderso.melonencb.commands.CommandEditor;
import de.meloneoderso.melonencb.listener.CommandListener;
import de.meloneoderso.melonencb.listener.UnknownCommandListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import static de.meloneoderso.melonencb.Constants.PREFIXNOPERMS;

public final class MelonenCB extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic


        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new CommandListener(), this);
        manager.registerEvents(new UnknownCommandListener(), this);



        //CommandBlock
        new CommandEditor("about").add(PREFIXNOPERMS);
        new CommandEditor("version").add(PREFIXNOPERMS);
        new CommandEditor("ver").add(PREFIXNOPERMS);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic


    }
}
