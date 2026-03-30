/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraftforge.fml.client.registry.ClientRegistry
 *  net.minecraftforge.fml.common.FMLCommonHandler
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$RenderTickEvent
 */
package net.canelex;

import net.canelex.PEntityRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(modid="flreborn", version="1.0", name="FL Reborn", acceptedMinecraftVersions="[1.8.9]")
public class PerspectiveMod {
    private Minecraft mc = Minecraft.getMinecraft();
    private KeyBinding keyBinding;
    public boolean cameraToggled = false;
    public float cameraYaw;
    public float cameraPitch;
    private EntityRenderer renderDefault;
    private EntityRenderer renderCustom;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        this.renderDefault = this.mc.entityRenderer;
        this.renderCustom = new PEntityRenderer(this, this.mc, this.mc.getResourceManager());
        this.keyBinding = new KeyBinding("Toggle Perspective", 33, "Perspective");
        ClientRegistry.registerKeyBinding((KeyBinding)this.keyBinding);
        FMLCommonHandler.instance().bus().register((Object)this);
    }

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event) {
        if (this.keyBinding.isPressed()) {
            this.cameraToggled = !this.cameraToggled;
            this.cameraYaw = this.mc.thePlayer.rotationYaw;
            this.cameraPitch = this.mc.thePlayer.rotationPitch;
            this.mc.gameSettings.thirdPersonView = this.cameraToggled ? 1 : 0;
        }
    }

    @SubscribeEvent
    public void onTick(TickEvent.RenderTickEvent event) {
        this.mc.entityRenderer = this.cameraToggled ? this.renderCustom : this.renderDefault;
    }
}
