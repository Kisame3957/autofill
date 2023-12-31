package org.minecraft.autofill;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FillData {
    public BlockData blockData = null;
    public Location position1 = null;
    public Location position2 = null;
    public Map<UUID,Process> thread = new HashMap<>();
    public FillData(){

    }
    public boolean canBlockFill(Player P){
        if(blockData != null && blockData.getMaterial().isBlock()){
            if(position1 != null){
                if(position2 != null){
                    return true;
                }
            }
        }
        return false;
    }
}
