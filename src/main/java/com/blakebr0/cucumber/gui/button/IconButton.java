package com.blakebr0.cucumber.gui.button;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.widget.button.AbstractButton;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class IconButton extends AbstractButton {
	private final ResourceLocation texture;
	private final int textureX, textureY;

	public IconButton(int x, int y, int width, int height, int textureX, int textureY, ITextComponent text, ResourceLocation texture) {
		super(x, y, width, height, text);
		this.textureX = textureX;
		this.textureY = textureY;
		this.texture = texture;
	}
	
	@Override
	public void func_230430_a_(MatrixStack stack, int mouseX, int mouseY, float partialTicks) {
//		Minecraft minecraft = Minecraft.getInstance();
//		minecraft.getTextureManager().bindTexture(this.texture);
//		RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.alpha);
//		int i = this.getYImage(this.isHovered());
//		RenderSystem.enableBlend();
//		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
//		RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
//		this.blit(this.x, this.y, this.textureX, this.textureY + i * 20, this.width / 2, this.height);
	}

	@Override
	public void func_230930_b_() {

	}
}
