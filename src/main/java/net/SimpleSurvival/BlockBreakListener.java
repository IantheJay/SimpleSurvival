package net.SimpleSurvival;

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.Material;
import org.bukkit.block.Block;
import java.util.ArrayList;

public class BlockBreakListener implements Listener {
	public void onBreak(BlockBreakEvent breakEv) {
		ArrayList<Material> breakableList = new ArrayList<Material>();
		breakableList.add(Material.AIR);
		Block block = breakEv.getBlock();
		BreakableBlock brokenBlock = new BreakableBlock(breakableList);
		Material material = block.getType();

		boolean canBreak = brokenBlock.isBreakable(material);

		if(canBreak == false) {
			breakEv.setCancelled(true);
		}
	}
}
