package com.vitalk.botcleaner;

import com.vitalk.botcleaner.listeners.JoinESystem;
import com.vitalk.botcleaner.management.PFilter;
import net.md_5.bungee.api.plugin.Plugin;


public class BotCleaner extends Plugin {

    private static BotCleaner instance;
    PFilter pFilter = new PFilter();

    @Override
    public void onEnable(){
        instance = this;
        getProxy().getPluginManager().registerListener(this, new JoinESystem());
        getLogger().info("Coming Soon");
    }

    public static BotCleaner getInstance(){
        return instance;
    }

    public PFilter getpFilter(){
        return pFilter;
    }
}
