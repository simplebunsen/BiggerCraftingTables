package wanion.biggercraftingtables.block.big;

/*
 * Created by WanionCane(https://github.com/WanionCane).
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wanion.biggercraftingtables.block.GuiBiggerCreatingTable;

import javax.annotation.Nonnull;

import static wanion.biggercraftingtables.Reference.MOD_ID;

@SideOnly(Side.CLIENT)
public final class GuiBigCreatingTable extends GuiBiggerCreatingTable<TileEntityBigCreatingTable>
{
	private static final ResourceLocation bigCreatingTexture = new ResourceLocation(MOD_ID, "textures/gui/big_crafting_table.png");

	public GuiBigCreatingTable(@Nonnull final TileEntityBigCreatingTable tileEntityBigCreatingTable, final InventoryPlayer inventoryPlayer)
	{
		super(new ContainerBigCreatingTable(tileEntityBigCreatingTable, inventoryPlayer), bigCreatingTexture);
		xSize = 176;
		ySize = 204;
	}
}