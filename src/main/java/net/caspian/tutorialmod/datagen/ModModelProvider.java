package net.caspian.tutorialmod.datagen;

import net.caspian.tutorialmod.block.custom.PinkGarnetLampBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.caspian.tutorialmod.block.ModBlocks;
import net.caspian.tutorialmod.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

//    @Override
//    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_DEEPSLATE_ORE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
//
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
//
//        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
//        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);
//        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
//        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
//        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
//        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
//        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);
//    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);

        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);
        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PINK_GARNET_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_GARNET_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);

        itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLASSIC_GLOCK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PETROL, Models.GENERATED);

        itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HAMMER, Models.HANDHELD);
    }
}