package wanion.biggercraftingtables.block.huge;

/*
 * Created by WanionCane(https://github.com/WanionCane).
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

import wanion.biggercraftingtables.Reference;
import wanion.biggercraftingtables.block.TileEntityBiggerCreatingTable;
import wanion.biggercraftingtables.recipe.huge.HugeRecipeRegistry;
import wanion.lib.recipe.advanced.AbstractRecipeRegistry;
import wanion.lib.recipe.advanced.IAdvancedRecipe;

import javax.annotation.Nonnull;

public final class TileEntityHugeCreatingTable extends TileEntityBiggerCreatingTable<HugeRecipeRegistry.IHugeRecipe>
{
	@Nonnull
	@Override
	public Reference.TableTypes getTableType()
	{
		return Reference.TableTypes.HUGE;
	}

	@Nonnull
	@Override
	public AbstractRecipeRegistry<HugeRecipeRegistry.IHugeRecipe> getRecipeRegistry()
	{
		return HugeRecipeRegistry.INSTANCE;
	}

	@Nonnull
	@Override
	public String getDefaultName() {
		return "container.hugecreatingtable.name";
	}
}