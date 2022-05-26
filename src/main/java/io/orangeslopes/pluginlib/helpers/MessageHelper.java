package io.orangeslopes.pluginlib.helpers;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.plugin.java.JavaPlugin;

public class MessageHelper {

    private final MiniMessage mini = MiniMessage.miniMessage();

    public Component asComponent(String s) {
        return mini.deserialize(s);
    }

    public void sendConsoleMessage(JavaPlugin plugin, String msg) {
        String prefix = plugin.getDescription().getPrefix();
        if (prefix == null || prefix.equals("null")) prefix = plugin.getDescription().getName();
        Component component = asComponent("[" + prefix + "] " + msg);
        plugin.getServer().getConsoleSender().sendMessage(component);
    }

}
