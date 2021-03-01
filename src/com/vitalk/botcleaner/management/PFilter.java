package com.vitalk.botcleaner.management;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class PFilter {
    public ArrayList<UUID> uuidsTryingToLogIn = new ArrayList<>();
    public ArrayList<String> nameTryingToLogIn = new ArrayList<>();
    public ArrayList<String> IPsTryingToLogIn = new ArrayList<>();

    public void logUser(ProxiedPlayer player){
        uuidsTryingToLogIn.add(player.getUniqueId());
        nameTryingToLogIn.add(player.getName());
        IPsTryingToLogIn.add(player.getSocketAddress().toString());
    }

    public void unLogUser(ProxiedPlayer player){
        if(uuidsTryingToLogIn.contains(player.getUniqueId())){
            uuidsTryingToLogIn.remove(player.getUniqueId());
        }
        if(nameTryingToLogIn.contains(player.getName())){
            nameTryingToLogIn.remove(player.getName());
        }
        if(IPsTryingToLogIn.contains(player.getSocketAddress().toString())){
            IPsTryingToLogIn.remove(player.getSocketAddress().toString());
        }
    }
}
