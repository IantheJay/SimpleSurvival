package net.SimpleSurvival

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
	public void onBreak(BlockBreakEvent breakEv) {
		Block block = event.getBlock();
		BreakableBlock brokenBlock = new BreakableBlock();
		Material material = block.getType();

		canBreak = brokenBlock.isBreakable(material);

		if(canBreak == false){
			breakEv.setCancelled(true);
		}
	}
}
