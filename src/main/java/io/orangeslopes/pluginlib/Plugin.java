package io.orangeslopes.pluginlib;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    private static OrangesLib lib;

    @Override
    public void onEnable() {
        lib = new OrangesLib();
    }

    public static OrangesLib getLib() {
        return lib;
    }

}
