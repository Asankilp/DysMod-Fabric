package io.github.asankilp.dys.item;

import io.github.asankilp.dys.Dys;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ItemReg {
    public static final LazyRegistrar<Item> ITEMS = LazyRegistrar.create(Registry.ITEM, Dys.MODID);
    public static final LazyRegistrar<Block> BLOCKS = LazyRegistrar.create(Registry.BLOCK, Dys.MODID);



     public static final RegistryObject<Block> YAJU_BLOCK = BLOCKS.register("yaju_block", YajuBlock::new);
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
     public static final RegistryObject<Item> YAJU_BLOCK_ITEM = ITEMS.register("yaju_block", ()
            -> new BlockItem(ItemReg.YAJU_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAJU = ITEMS.register("yaju", Yaju::new);
    public static final RegistryObject<Item> RINGO = ITEMS.register("ringo", Ringo::new);
    public static final RegistryObject<Item> GOLDEN_RINGO = ITEMS.register("golden_ringo", GoldenRingo::new);
    public static final RegistryObject<Item> DEAD_IRON = ITEMS.register("dead_iron", DeadIron::new);
    public static final RegistryObject<Item> KURUMI_SHOVEL = ITEMS.register("kurumi_shovel", KurumiShovel::new);
    public static final RegistryObject<Item> AKAZA_AKARI = ITEMS.register("akaza_akari", AkazaAkari::new);
}
