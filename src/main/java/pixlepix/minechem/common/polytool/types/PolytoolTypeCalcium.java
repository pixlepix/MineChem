package pixlepix.minechem.common.polytool.types;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pixlepix.minechem.api.core.EnumElement;
import pixlepix.minechem.common.polytool.PolytoolUpgradeType;

public class PolytoolTypeCalcium extends PolytoolUpgradeType {

    public PolytoolTypeCalcium() {
        super();
    }

    @Override
    public float getStrVsBlock(ItemStack itemStack, Block block) {

        return 0;
    }

    @Override
    public void hitEntity(ItemStack itemStack, EntityLivingBase target,
                          EntityLivingBase player) {
    }

    @Override
    public void onBlockDestroyed(ItemStack itemStack, World world, int id,
                                 int x, int y, int z, EntityLivingBase entityLiving) {
    }

    @Override
    public EnumElement getElement() {

        return EnumElement.Ca;
    }

    @Override
    public void onTick() {
    }

    @Override
    public String getDescription() {

        return "Get extra bones";
    }

}
