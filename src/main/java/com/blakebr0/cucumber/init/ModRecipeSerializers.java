package com.blakebr0.cucumber.init;

import com.blakebr0.cucumber.Cucumber;
import com.blakebr0.cucumber.crafting.conditions.EnableableCondition;
import com.blakebr0.cucumber.crafting.recipe.ShapedNoMirrorRecipe;
import com.blakebr0.cucumber.crafting.recipe.ShapedTagRecipe;
import com.blakebr0.cucumber.crafting.recipe.ShapedTransferDamageRecipe;
import com.blakebr0.cucumber.crafting.recipe.ShapelessTagRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public final class ModRecipeSerializers {
    public static final RecipeSerializer<?> CRAFTING_SHAPED_NO_MIRROR = new ShapedNoMirrorRecipe.Serializer();
    public static final RecipeSerializer<?> CRAFTING_SHAPED_TRANSFER_DAMAGE = new ShapedTransferDamageRecipe.Serializer();
    public static final RecipeSerializer<?> CRAFTING_SHAPED_TAG = new ShapedTagRecipe.Serializer();
    public static final RecipeSerializer<?> CRAFTING_SHAPELESS_TAG = new ShapelessTagRecipe.Serializer();

    @SubscribeEvent
    public void onRegisterSerializers(RegistryEvent.Register<RecipeSerializer<?>> event) {
        var registry = event.getRegistry();

        registry.register(CRAFTING_SHAPED_NO_MIRROR.setRegistryName(new ResourceLocation(Cucumber.MOD_ID, "shaped_no_mirror")));
        registry.register(CRAFTING_SHAPED_TRANSFER_DAMAGE.setRegistryName(new ResourceLocation(Cucumber.MOD_ID, "shaped_transfer_damage")));
        registry.register(CRAFTING_SHAPED_TAG.setRegistryName(new ResourceLocation(Cucumber.MOD_ID, "shaped_tag")));
        registry.register(CRAFTING_SHAPELESS_TAG.setRegistryName(new ResourceLocation(Cucumber.MOD_ID, "shapeless_tag")));

        CraftingHelper.register(EnableableCondition.Serializer.INSTANCE);
    }
}
