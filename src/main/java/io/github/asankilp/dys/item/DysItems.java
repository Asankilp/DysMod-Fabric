package io.github.asankilp.dys.item;

import io.github.asankilp.dys.Dys;
import io.github.asankilp.dys.block.DysBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;


public class DysItems {
    //    public static final LazyRegistrar<Item> ITEMS = LazyRegistrar.create(Registry.ITEM, Dys.MODID);
//    public static final LazyRegistrar<Block> BLOCKS = LazyRegistrar.create(Registry.BLOCK, Dys.MODID);
//
//
//     public static final RegistryObject<Block> YAJU_BLOCK = BLOCKS.register("yaju_block", YajuBlock::new);
//    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
//     public static final RegistryObject<Item> YAJU_BLOCK_ITEM = ITEMS.register("yaju_block", ()
//            -> new BlockItem(ItemReg.YAJU_BLOCK.get(), new Item.Properties()));
//    public static final RegistryObject<Item> RINGO = ITEMS.register("ringo", Ringo::new);
//    public static final RegistryObject<Item> GOLDEN_RINGO = ITEMS.register("golden_ringo", GoldenRingo::new);
//    public static final RegistryObject<Item> DEAD_IRON = ITEMS.register("dead_iron", DeadIron::new);
//    public static final RegistryObject<Item> KURUMI_SHOVEL = ITEMS.register("kurumi_shovel", KurumiShovel::new);
//    public static final RegistryObject<Item> AKAZA_AKARI = ITEMS.register("akaza_akari", AkazaAkari::new);
    public static Item YAJU;
    public static Item YAJU_BLOCK_ITEM;
    public static Item RINGO;
    public static Item GOLDEN_RINGO;

    public static Item DEAD_IRON;
    public static Item KURUMI_SHOVEL;
    public static Item AKAZA_AKARI;

    public static void register() {
        YAJU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Dys.MODID, "yaju"),new Yaju());
        YAJU_BLOCK_ITEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Dys.MODID, "yaju_block"), new BlockItem(DysBlocks.YAJU_BLOCK, new Item.Properties()));
        RINGO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Dys.MODID, "ringo"), new Ringo());
        GOLDEN_RINGO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Dys.MODID, "golden_ringo"), new GoldenRingo());
        DEAD_IRON = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Dys.MODID, "dead_iron"), new DeadIron());
        KURUMI_SHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Dys.MODID, "kurumi_shovel"), new KurumiShovel());
        AKAZA_AKARI = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Dys.MODID, "akaza_akari"), new AkazaAkari());
    }
}
