package io.github.sefiraat.emctech.slimefun.items;

import org.bukkit.inventory.ItemStack;

import io.github.sefiraat.emctech.EmcTech;
import io.github.sefiraat.emctech.managers.SupportedPluginManager;
import io.github.sefiraat.emctech.slimefun.blocks.Dematerializer;
import io.github.sefiraat.emctech.slimefun.blocks.Materializer;
import io.github.sefiraat.emctech.slimefun.blocks.NodeMaterializer;
import io.github.sefiraat.emctech.slimefun.groups.EmcTechItemGroups;
import io.github.sefiraat.networks.slimefun.NetworksSlimefunItemStacks;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;

import dev.sefiraat.sefilib.itemstacks.GeneralItemStackUtils;

public class EmcItems {

    private EmcItems() {
        throw new IllegalStateException("Utility class");
    }

    // Materials
    public static final UnplaceableBlock UNORTHODOX_COAL;
    public static final UnplaceableBlock UNORTHODOX_COAL_DUST;
    public static final UnplaceableBlock TIGHTLY_PACKED_UNORTHODOX_COAL;
    public static final UnplaceableBlock UNORTHODOX_COAL_BLOCK;
    public static final UnplaceableBlock DEVIANT_COAL;
    public static final UnplaceableBlock DEVIANT_COAL_DUST;
    public static final UnplaceableBlock TIGHTLY_PACKED_DEVIANT_COAL;
    public static final UnplaceableBlock DEVIANT_COAL_BLOCK;
    public static final UnplaceableBlock DIVERGENT_COAL;
    public static final UnplaceableBlock DIVERGENT_COAL_DUST;
    public static final UnplaceableBlock TIGHTLY_PACKED_DIVERGENT_COAL;
    public static final UnplaceableBlock DIVERGENT_COAL_BLOCK;
    public static final UnplaceableBlock ANOMALOUS_COAL;
    public static final UnplaceableBlock ANOMALOUS_COAL_DUST;
    public static final UnplaceableBlock TIGHTLY_PACKED_ANOMALOUS_COAL;
    public static final UnplaceableBlock ANOMALOUS_COAL_BLOCK;
    public static final UnplaceableBlock PERFECTED_COAL;

    // Components
    public static final UnplaceableBlock UNORTHODOX_FRAME;
    public static final UnplaceableBlock DEVIANT_FRAME;
    public static final UnplaceableBlock DIVERGENT_FRAME;
    public static final UnplaceableBlock ANOMALOUS_FRAME;
    public static final UnplaceableBlock PERFECTED_FRAME;
    public static final UnplaceableBlock UNORTHODOX_MACHINE_FRAME;
    public static final UnplaceableBlock DEVIANT_MACHINE_FRAME;
    public static final UnplaceableBlock DIVERGENT_MACHINE_FRAME;
    public static final UnplaceableBlock ANOMALOUS_MACHINE_FRAME;
    public static final UnplaceableBlock PERFECTED_MACHINE_FRAME;

    // Machines
    public static final Dematerializer EMC_DEMATERIALIZER_1;
    public static final Dematerializer EMC_DEMATERIALIZER_2;
    public static final Dematerializer EMC_DEMATERIALIZER_3;
    public static final Dematerializer EMC_DEMATERIALIZER_4;
    public static final Dematerializer EMC_DEMATERIALIZER_5;
    public static final Materializer EMC_MATERIALIZER_1;
    public static final Materializer EMC_MATERIALIZER_2;
    public static final Materializer EMC_MATERIALIZER_3;
    public static final Materializer EMC_MATERIALIZER_4;
    public static final Materializer EMC_MATERIALIZER_5;
    public static final NodeMaterializer EMC_NETWORK_MATERIALIZER;

    static {

        // region Materials

        UNORTHODOX_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.UNORTHODOX_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.VANILLA_COAL, EmcStacks.VANILLA_COAL, EmcStacks.VANILLA_COAL,
                EmcStacks.VANILLA_COAL, EmcStacks.VANILLA_COAL, EmcStacks.VANILLA_COAL,
                EmcStacks.VANILLA_COAL, EmcStacks.VANILLA_COAL, EmcStacks.VANILLA_COAL
            }
        );

        UNORTHODOX_COAL_DUST = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.UNORTHODOX_COAL_DUST,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                EmcStacks.UNORTHODOX_COAL.asOne()
            }
        );

        TIGHTLY_PACKED_UNORTHODOX_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.TIGHTLY_PACKED_UNORTHODOX_COAL,
            RecipeType.COMPRESSOR,
            new ItemStack[]{
                GeneralItemStackUtils.getAsQuantity(EmcStacks.UNORTHODOX_COAL_DUST.asOne(), 4)
            }
        );

        UNORTHODOX_COAL_BLOCK = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.UNORTHODOX_COAL_BLOCK,
            RecipeType.PRESSURE_CHAMBER,
            new ItemStack[]{
                EmcStacks.TIGHTLY_PACKED_UNORTHODOX_COAL.asOne()
            }
        );

        DEVIANT_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DEVIANT_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(),
                EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(),
                EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne()
            }
        );

        DEVIANT_COAL_DUST = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DEVIANT_COAL_DUST,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                EmcStacks.DEVIANT_COAL.asOne()
            }
        );

        TIGHTLY_PACKED_DEVIANT_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.TIGHTLY_PACKED_DEVIANT_COAL,
            RecipeType.COMPRESSOR,
            new ItemStack[]{
                GeneralItemStackUtils.getAsQuantity(EmcStacks.DEVIANT_COAL_DUST.asOne(), 4)
            }
        );

        DEVIANT_COAL_BLOCK = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DEVIANT_COAL_BLOCK,
            RecipeType.PRESSURE_CHAMBER,
            new ItemStack[]{
                EmcStacks.TIGHTLY_PACKED_DEVIANT_COAL.asOne()
            }
        );

        DIVERGENT_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DIVERGENT_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DEVIANT_COAL_BLOCK.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne(),
                EmcStacks.DEVIANT_COAL_BLOCK.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne(),
                EmcStacks.DEVIANT_COAL_BLOCK.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne()
            }
        );

        DIVERGENT_COAL_DUST = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DIVERGENT_COAL_DUST,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                EmcStacks.DIVERGENT_COAL.asOne()
            }
        );

        TIGHTLY_PACKED_DIVERGENT_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.TIGHTLY_PACKED_DIVERGENT_COAL,
            RecipeType.COMPRESSOR,
            new ItemStack[]{
                GeneralItemStackUtils.getAsQuantity(EmcStacks.DIVERGENT_COAL_DUST.asOne(), 4)
            }
        );

        DIVERGENT_COAL_BLOCK = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DIVERGENT_COAL_BLOCK,
            RecipeType.PRESSURE_CHAMBER,
            new ItemStack[]{
                EmcStacks.TIGHTLY_PACKED_DIVERGENT_COAL.asOne()
            }
        );

        ANOMALOUS_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.ANOMALOUS_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne(),
                EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne(),
                EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne()
            }
        );

        ANOMALOUS_COAL_DUST = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.ANOMALOUS_COAL_DUST,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                EmcStacks.ANOMALOUS_COAL.asOne()
            }
        );

        TIGHTLY_PACKED_ANOMALOUS_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.TIGHTLY_PACKED_ANOMALOUS_COAL,
            RecipeType.COMPRESSOR,
            new ItemStack[]{
                GeneralItemStackUtils.getAsQuantity(EmcStacks.ANOMALOUS_COAL_DUST.asOne(), 4)
            }
        );

        ANOMALOUS_COAL_BLOCK = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.ANOMALOUS_COAL_BLOCK,
            RecipeType.PRESSURE_CHAMBER,
            new ItemStack[]{
                EmcStacks.TIGHTLY_PACKED_ANOMALOUS_COAL.asOne()
            }
        );

        PERFECTED_COAL = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.PERFECTED_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(),
                EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(),
                EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne()
            }
        );

        // endregion

        // Components

        UNORTHODOX_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.UNORTHODOX_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.UNORTHODOX_COAL.asOne(), EmcStacks.UNORTHODOX_COAL.asOne(), EmcStacks.UNORTHODOX_COAL.asOne(),
                EmcStacks.UNORTHODOX_COAL.asOne(), SlimefunItems.GOLD_24K_BLOCK.asOne(), EmcStacks.UNORTHODOX_COAL.asOne(),
                EmcStacks.UNORTHODOX_COAL.asOne(), EmcStacks.UNORTHODOX_COAL.asOne(), EmcStacks.UNORTHODOX_COAL.asOne()
            }
        );

        UNORTHODOX_MACHINE_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.UNORTHODOX_MACHINE_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.SOLDER_INGOT.asOne(), SlimefunItems.ENDER_RUNE.asOne(), SlimefunItems.SOLDER_INGOT.asOne(),
                SlimefunItems.SOLDER_INGOT.asOne(), EmcStacks.UNORTHODOX_FRAME.asOne(), SlimefunItems.SOLDER_INGOT.asOne(),
                SlimefunItems.SOLDER_INGOT.asOne(), SlimefunItems.MEDIUM_CAPACITOR.asOne(), SlimefunItems.SOLDER_INGOT.asOne()
            }
        );

        DEVIANT_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DEVIANT_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DEVIANT_COAL.asOne(), EmcStacks.DEVIANT_COAL.asOne(), EmcStacks.DEVIANT_COAL.asOne(),
                EmcStacks.DEVIANT_COAL.asOne(), EmcStacks.UNORTHODOX_FRAME.asOne(), EmcStacks.DEVIANT_COAL.asOne(),
                EmcStacks.DEVIANT_COAL.asOne(), EmcStacks.DEVIANT_COAL.asOne(), EmcStacks.DEVIANT_COAL.asOne()
            }
        );

        DEVIANT_MACHINE_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DEVIANT_MACHINE_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.DURALUMIN_INGOT.asOne(), EmcStacks.UNORTHODOX_MACHINE_FRAME.asOne(), SlimefunItems.DURALUMIN_INGOT.asOne(),
                SlimefunItems.DURALUMIN_INGOT.asOne(), EmcStacks.DEVIANT_FRAME.asOne(), SlimefunItems.DURALUMIN_INGOT.asOne(),
                SlimefunItems.DURALUMIN_INGOT.asOne(), SlimefunItems.LARGE_CAPACITOR.asOne(), SlimefunItems.DURALUMIN_INGOT.asOne()
            }
        );

        DIVERGENT_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DIVERGENT_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DIVERGENT_COAL.asOne(), EmcStacks.DIVERGENT_COAL.asOne(), EmcStacks.DIVERGENT_COAL.asOne(),
                EmcStacks.DIVERGENT_COAL.asOne(), EmcStacks.DEVIANT_FRAME.asOne(), EmcStacks.DIVERGENT_COAL.asOne(),
                EmcStacks.DIVERGENT_COAL.asOne(), EmcStacks.DIVERGENT_COAL.asOne(), EmcStacks.DIVERGENT_COAL.asOne()
            }
        );

        DIVERGENT_MACHINE_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.DIVERGENT_MACHINE_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT.asOne(), EmcStacks.DEVIANT_MACHINE_FRAME.asOne(), SlimefunItems.DAMASCUS_STEEL_INGOT.asOne(),
                SlimefunItems.DAMASCUS_STEEL_INGOT.asOne(), EmcStacks.DIVERGENT_FRAME.asOne(), SlimefunItems.DAMASCUS_STEEL_INGOT.asOne(),
                SlimefunItems.DAMASCUS_STEEL_INGOT.asOne(), SlimefunItems.BIG_CAPACITOR.asOne(), SlimefunItems.DAMASCUS_STEEL_INGOT.asOne()
            }
        );

        ANOMALOUS_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.ANOMALOUS_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.ANOMALOUS_COAL.asOne(), EmcStacks.ANOMALOUS_COAL.asOne(), EmcStacks.ANOMALOUS_COAL.asOne(),
                EmcStacks.ANOMALOUS_COAL.asOne(), EmcStacks.DIVERGENT_FRAME.asOne(), EmcStacks.ANOMALOUS_COAL.asOne(),
                EmcStacks.ANOMALOUS_COAL.asOne(), EmcStacks.ANOMALOUS_COAL.asOne(), EmcStacks.ANOMALOUS_COAL.asOne()
            }
        );

        ANOMALOUS_MACHINE_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.ANOMALOUS_MACHINE_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne(), EmcStacks.DIVERGENT_MACHINE_FRAME.asOne(), SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne(),
                SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne(), EmcStacks.ANOMALOUS_FRAME.asOne(), SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne(),
                SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne(), SlimefunItems.CARBONADO_EDGED_CAPACITOR.asOne(), SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne()
            }
        );

        PERFECTED_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.PERFECTED_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.PERFECTED_COAL.asOne(), EmcStacks.PERFECTED_COAL.asOne(), EmcStacks.PERFECTED_COAL.asOne(),
                EmcStacks.PERFECTED_COAL.asOne(), EmcStacks.ANOMALOUS_FRAME.asOne(), EmcStacks.PERFECTED_COAL.asOne(),
                EmcStacks.PERFECTED_COAL.asOne(), EmcStacks.PERFECTED_COAL.asOne(), EmcStacks.PERFECTED_COAL.asOne()
            }
        );

        PERFECTED_MACHINE_FRAME = new UnplaceableBlock(
            EmcTechItemGroups.MATERIALS,
            EmcStacks.PERFECTED_MACHINE_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT.asOne(), EmcStacks.ANOMALOUS_MACHINE_FRAME.asOne(), SlimefunItems.REINFORCED_ALLOY_INGOT.asOne(),
                SlimefunItems.REINFORCED_ALLOY_INGOT.asOne(), EmcStacks.PERFECTED_FRAME.asOne(), SlimefunItems.REINFORCED_ALLOY_INGOT.asOne(),
                SlimefunItems.REINFORCED_ALLOY_INGOT.asOne(), SlimefunItems.ENERGIZED_CAPACITOR.asOne(), SlimefunItems.REINFORCED_ALLOY_INGOT.asOne()
            }
        );

        // endregion

        // region Machines

        EMC_DEMATERIALIZER_1 = new Dematerializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_DEMATERIALIZER_1,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.UNORTHODOX_COAL.asOne(), SlimefunItems.PROGRAMMABLE_ANDROID_3_BUTCHER.asOne(), EmcStacks.UNORTHODOX_COAL.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.UNORTHODOX_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.UNORTHODOX_COAL.asOne(), SlimefunItems.ENERGY_REGULATOR.asOne(), EmcStacks.UNORTHODOX_COAL.asOne()
            },
            5,
            1000
        );

        EMC_DEMATERIALIZER_2 = new Dematerializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_DEMATERIALIZER_2,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DEVIANT_COAL.asOne(), EmcStacks.EMC_DEMATERIALIZER_1.asOne(), EmcStacks.DEVIANT_COAL.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.DEVIANT_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.DEVIANT_COAL.asOne(), SlimefunItems.ENERGY_REGULATOR.asOne(), EmcStacks.DEVIANT_COAL.asOne()
            },
            4,
            10000
        );

        EMC_DEMATERIALIZER_3 = new Dematerializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_DEMATERIALIZER_3,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DIVERGENT_COAL.asOne(), EmcStacks.EMC_DEMATERIALIZER_2.asOne(), EmcStacks.DIVERGENT_COAL.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.DIVERGENT_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.DIVERGENT_COAL.asOne(), SlimefunItems.ENERGY_REGULATOR.asOne(), EmcStacks.DIVERGENT_COAL.asOne()
            },
            3,
            100000
        );

        EMC_DEMATERIALIZER_4 = new Dematerializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_DEMATERIALIZER_4,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.ANOMALOUS_COAL.asOne(), EmcStacks.EMC_DEMATERIALIZER_3.asOne(), EmcStacks.ANOMALOUS_COAL.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.ANOMALOUS_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.ANOMALOUS_COAL.asOne(), SlimefunItems.ENERGY_REGULATOR.asOne(), EmcStacks.ANOMALOUS_COAL.asOne()
            },
            2,
            1000000
        );

        EMC_DEMATERIALIZER_5 = new Dematerializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_DEMATERIALIZER_5,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.PERFECTED_COAL.asOne(), EmcStacks.EMC_DEMATERIALIZER_4.asOne(), EmcStacks.PERFECTED_COAL.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.PERFECTED_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.PERFECTED_COAL.asOne(), SlimefunItems.ENERGY_REGULATOR.asOne(), EmcStacks.PERFECTED_COAL.asOne()
            },
            1,
            10000000
        );

        EMC_MATERIALIZER_1 = new Materializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_MATERIALIZER_1,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), SlimefunItems.PROGRAMMABLE_ANDROID_3_FISHERMAN.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.UNORTHODOX_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.UNORTHODOX_COAL_BLOCK.asOne(), SlimefunItems.POWER_CRYSTAL.asOne(), EmcStacks.UNORTHODOX_COAL_BLOCK.asOne()
            },
            5,
            1000
        );

        EMC_MATERIALIZER_2 = new Materializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_MATERIALIZER_2,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DEVIANT_COAL_BLOCK.asOne(), EmcStacks.EMC_MATERIALIZER_1.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.DEVIANT_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.DEVIANT_COAL_BLOCK.asOne(), SlimefunItems.POWER_CRYSTAL.asOne(), EmcStacks.DEVIANT_COAL_BLOCK.asOne()
            },
            4,
            10000
        );

        EMC_MATERIALIZER_3 = new Materializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_MATERIALIZER_3,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), EmcStacks.EMC_MATERIALIZER_2.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.DIVERGENT_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.DIVERGENT_COAL_BLOCK.asOne(), SlimefunItems.POWER_CRYSTAL.asOne(), EmcStacks.DIVERGENT_COAL_BLOCK.asOne()
            },
            3,
            100000
        );

        EMC_MATERIALIZER_4 = new Materializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_MATERIALIZER_4,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), EmcStacks.EMC_MATERIALIZER_3.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.ANOMALOUS_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.ANOMALOUS_COAL_BLOCK.asOne(), SlimefunItems.POWER_CRYSTAL.asOne(), EmcStacks.ANOMALOUS_COAL_BLOCK.asOne()
            },
            2,
            1000000
        );

        EMC_MATERIALIZER_5 = new Materializer(
            EmcTechItemGroups.MACHINES,
            EmcStacks.EMC_MATERIALIZER_5,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                EmcStacks.PERFECTED_COAL.asOne(), EmcStacks.EMC_MATERIALIZER_4.asOne(), EmcStacks.PERFECTED_COAL.asOne(),
                SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(), EmcStacks.PERFECTED_MACHINE_FRAME.asOne(), SlimefunItems.ANDROID_INTERFACE_ITEMS.asOne(),
                EmcStacks.PERFECTED_COAL.asOne(), SlimefunItems.POWER_CRYSTAL.asOne(), EmcStacks.PERFECTED_COAL.asOne()
            },
            1,
            10000000
        );

        if (SupportedPluginManager.isNetworks()) {
            EMC_NETWORK_MATERIALIZER = new NodeMaterializer(
                EmcTechItemGroups.MACHINES,
                EmcStacks.EMC_NETWORK_MATERIALIZER,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                    NetworksSlimefunItemStacks.RADIOACTIVE_OPTIC_STAR.asOne(), EmcStacks.EMC_MATERIALIZER_4.asOne(), NetworksSlimefunItemStacks.RADIOACTIVE_OPTIC_STAR.asOne(),
                    NetworksSlimefunItemStacks.NETWORK_MONITOR.asOne(), EmcStacks.EMC_MATERIALIZER_5.asOne(), NetworksSlimefunItemStacks.NETWORK_MONITOR.asOne(),
                    NetworksSlimefunItemStacks.RADIOACTIVE_OPTIC_STAR.asOne(), NetworksSlimefunItemStacks.EMPOWERED_AI_CORE.asOne(), NetworksSlimefunItemStacks.RADIOACTIVE_OPTIC_STAR.asOne()
                },
                1,
                10000000
            );
        } else {
            EMC_NETWORK_MATERIALIZER = null;
        }

        // endregion

    }

    public static void setup() {
        final EmcTech plugin = EmcTech.getInstance();

        UNORTHODOX_COAL.register(plugin);
        UNORTHODOX_COAL_DUST.register(plugin);
        TIGHTLY_PACKED_UNORTHODOX_COAL.register(plugin);
        UNORTHODOX_COAL_BLOCK.register(plugin);
        DEVIANT_COAL.register(plugin);
        DEVIANT_COAL_DUST.register(plugin);
        TIGHTLY_PACKED_DEVIANT_COAL.register(plugin);
        DEVIANT_COAL_BLOCK.register(plugin);
        DIVERGENT_COAL.register(plugin);
        DIVERGENT_COAL_DUST.register(plugin);
        TIGHTLY_PACKED_DIVERGENT_COAL.register(plugin);
        DIVERGENT_COAL_BLOCK.register(plugin);
        ANOMALOUS_COAL.register(plugin);
        ANOMALOUS_COAL_DUST.register(plugin);
        TIGHTLY_PACKED_ANOMALOUS_COAL.register(plugin);
        ANOMALOUS_COAL_BLOCK.register(plugin);
        PERFECTED_COAL.register(plugin);

        UNORTHODOX_FRAME.register(plugin);
        UNORTHODOX_MACHINE_FRAME.register(plugin);
        DEVIANT_FRAME.register(plugin);
        DEVIANT_MACHINE_FRAME.register(plugin);
        DIVERGENT_FRAME.register(plugin);
        DIVERGENT_MACHINE_FRAME.register(plugin);
        ANOMALOUS_FRAME.register(plugin);
        ANOMALOUS_MACHINE_FRAME.register(plugin);
        PERFECTED_FRAME.register(plugin);
        PERFECTED_MACHINE_FRAME.register(plugin);

        EMC_DEMATERIALIZER_1.register(plugin);
        EMC_DEMATERIALIZER_2.register(plugin);
        EMC_DEMATERIALIZER_3.register(plugin);
        EMC_DEMATERIALIZER_4.register(plugin);
        EMC_DEMATERIALIZER_5.register(plugin);
        EMC_MATERIALIZER_1.register(plugin);
        EMC_MATERIALIZER_2.register(plugin);
        EMC_MATERIALIZER_3.register(plugin);
        EMC_MATERIALIZER_4.register(plugin);
        EMC_MATERIALIZER_5.register(plugin);

        if (SupportedPluginManager.isNetworks()) {
            EMC_NETWORK_MATERIALIZER.register(plugin);
        }
    }
}
