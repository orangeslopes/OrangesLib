package io.orangeslopes.pluginlib;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    private OrangesLib lib;

    @Override
    public void onEnable() {
        lib = new OrangesLib();
        lib.messages.sendConsoleMessage(this, "<gold>OrangesLib - \"fresher than ever.\"</gold>");
    }

}
