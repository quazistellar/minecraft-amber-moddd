package net.starrykid.mptmod.item;

import net.starrykid.mptmod.MptMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    //создание предмета и его добавление
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));


        //сет янтарной брони (со свойствами золотой)
        public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
                () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)) {
                    @Override
                    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
                        return String.format("%s:textures/models/armor/amber_layer_%d.png", MptMod.MOD_ID, slot == EquipmentSlot.HEAD ? 1 : 2);
                    }
                });

    public static final RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)) {
                @Override
                public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
                    return String.format("%s:textures/models/armor/amber_layer_%d.png", MptMod.MOD_ID, slot == EquipmentSlot.CHEST ? 1 : 2);
                }
            });

    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)) {
                @Override
                public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
                    return String.format("%s:textures/models/armor/amber_layer_%d.png", MptMod.MOD_ID, slot == EquipmentSlot.LEGS ? 2 : 1);
                }
            });

    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)) {
                @Override
                public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
                    return String.format("%s:textures/models/armor/amber_layer_%d.png", MptMod.MOD_ID, slot == EquipmentSlot.FEET ? 1 : 2);
                }
            });

        // сет янтарных инструментов (со свойствами железных)
        public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
                () -> new PickaxeItem(Tiers.IRON, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

        public static final RegistryObject<Item> AMBER_SHOVEL = ITEMS.register("amber_shovel",
                () -> new ShovelItem(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

        public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword",
                () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

        public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe",
                () -> new AxeItem(Tiers.IRON, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

        public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe",
                () -> new HoeItem(Tiers.IRON, -2, -3.1f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> CRISPS = ITEMS.register("crisps",
            () -> new Item(new Item.Properties().food(ModFoods.CRISPS).tab(ModCreativeModeTab.MPT_TAB)));

}

