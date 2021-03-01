package com.vitalk.botcleaner.listeners;

import com.vitalk.botcleaner.BotCleaner;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class JoinESystem implements Listener {

    @EventHandler
    public void onLogin(PostLoginEvent e){
        BotCleaner.getInstance().getpFilter().logUser(e.getPlayer());
    }

    @EventHandler
    public void onDisconnect(PlayerDisconnectEvent e){
        BotCleaner.getInstance().getpFilter().unLogUser(e.getPlayer());
    }
}
