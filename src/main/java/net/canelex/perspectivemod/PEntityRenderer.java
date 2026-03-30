/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.gson.JsonSyntaxException
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.MapItemRenderer
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.particle.EffectRenderer
 *  net.minecraft.client.renderer.ActiveRenderInfo
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldRenderer
 *  net.minecraft.client.renderer.culling.ClippingHelperImpl
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.client.renderer.texture.TextureMap
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.client.shader.ShaderLinkHelper
 *  net.minecraft.crash.CrashReport
 *  net.minecraft.crash.CrashReportCategory
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.boss.BossStatus
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntitySpider
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.BlockPos$MutableBlockPos
 *  net.minecraft.util.EntitySelectors
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.EnumWorldBlockLayer
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MouseFilter
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.ReportedException
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldSettings$GameType
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraftforge.client.ForgeHooksClient
 *  net.minecraftforge.client.IRenderHandler
 *  net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup
 *  net.minecraftforge.client.event.EntityViewRenderEvent$FogColors
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.Project
 */
package net.canelex;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import net.canelex.PerspectiveMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.MapItemRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MouseFilter;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class PEntityRenderer
extends EntityRenderer {
    private static final Logger logger = LogManager.getLogger();
    private static final ResourceLocation locationRainPng = new ResourceLocation("textures/environment/rain.png");
    private static final ResourceLocation locationSnowPng = new ResourceLocation("textures/environment/snow.png");
    public static boolean anaglyphEnable;
    public static int anaglyphField;
    private Minecraft mc;
    private final IResourceManager resourceManager;
    private Random random = new Random();
    private float farPlaneDistance;
    public final ItemRenderer itemRenderer;
    private final MapItemRenderer theMapItemRenderer;
    private int rendererUpdateCount;
    private Entity pointedEntity;
    private MouseFilter mouseFilterXAxis = new MouseFilter();
    private MouseFilter mouseFilterYAxis = new MouseFilter();
    private float thirdPersonDistance = 4.0f;
    private float thirdPersonDistanceTemp = 4.0f;
    private float smoothCamYaw;
    private float smoothCamPitch;
    private float smoothCamFilterX;
    private float smoothCamFilterY;
    private float smoothCamPartialTicks;
    private float fovModifierHand;
    private float fovModifierHandPrev;
    private float bossColorModifier;
    private float bossColorModifierPrev;
    private boolean cloudFog;
    private boolean renderHand = true;
    private boolean drawBlockOutline = true;
    private long prevFrameTime = Minecraft.getSystemTime();
    private long renderEndNanoTime;
    private final DynamicTexture lightmapTexture;
    private final int[] lightmapColors;
    private final ResourceLocation locationLightMap;
    private boolean lightmapUpdateNeeded;
    private float torchFlickerX;
    private float torchFlickerDX;
    private int rainSoundCounter;
    private float[] rainXCoords = new float[1024];
    private float[] rainYCoords = new float[1024];
    private FloatBuffer fogColorBuffer = GLAllocation.createDirectFloatBuffer((int)16);
    private float fogColorRed;
    private float fogColorGreen;
    private float fogColorBlue;
    private float fogColor2;
    private float fogColor1;
    private int debugViewDirection = 0;
    private boolean debugView = false;
    private double cameraZoom = 1.0;
    private double cameraYaw;
    private double cameraPitch;
    private ShaderGroup theShaderGroup;
    private static final ResourceLocation[] shaderResourceLocations;
    public static final int shaderCount;
    private int shaderIndex;
    private boolean useShader;
    private int frameCount;
    private PerspectiveMod mod;

    public PEntityRenderer(PerspectiveMod mod, Minecraft mcIn, IResourceManager resourceManagerIn) {
        super(mcIn, resourceManagerIn);
        this.mod = mod;
        this.shaderIndex = shaderCount;
        this.useShader = false;
        this.frameCount = 0;
        this.mc = mcIn;
        this.resourceManager = resourceManagerIn;
        this.itemRenderer = mcIn.getItemRenderer();
        this.theMapItemRenderer = new MapItemRenderer(mcIn.getTextureManager());
        this.lightmapTexture = new DynamicTexture(16, 16);
        this.locationLightMap = mcIn.getTextureManager().getDynamicTextureLocation("lightMap", this.lightmapTexture);
        this.lightmapColors = this.lightmapTexture.getTextureData();
        this.theShaderGroup = null;
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                float f = j - 16;
                float f1 = i - 16;
                float f2 = MathHelper.sqrt_float((float)(f * f + f1 * f1));
                this.rainXCoords[i << 5 | j] = -f1 / f2;
                this.rainYCoords[i << 5 | j] = f / f2;
            }
        }
    }

    public boolean isShaderActive() {
        return OpenGlHelper.shadersSupported && this.theShaderGroup != null;
    }

    public void stopUseShader() {
        if (this.theShaderGroup != null) {
            this.theShaderGroup.deleteShaderGroup();
        }
        this.theShaderGroup = null;
        this.shaderIndex = shaderCount;
    }

    public void switchUseShader() {
        this.useShader = !this.useShader;
    }

    public void loadEntityShader(Entity entityIn) {
        if (OpenGlHelper.shadersSupported) {
            if (this.theShaderGroup != null) {
                this.theShaderGroup.deleteShaderGroup();
            }
            this.theShaderGroup = null;
            if (entityIn instanceof EntityCreeper) {
                this.loadShader(new ResourceLocation("shaders/post/creeper.json"));
            } else if (entityIn instanceof EntitySpider) {
                this.loadShader(new ResourceLocation("shaders/post/spider.json"));
            } else if (entityIn instanceof EntityEnderman) {
                this.loadShader(new ResourceLocation("shaders/post/invert.json"));
            }
        }
    }

    public void activateNextShader() {
        if (OpenGlHelper.shadersSupported && this.mc.getRenderViewEntity() instanceof EntityPlayer) {
            if (this.theShaderGroup != null) {
                this.theShaderGroup.deleteShaderGroup();
            }
            this.shaderIndex = (this.shaderIndex + 1) % (shaderResourceLocations.length + 1);
            if (this.shaderIndex != shaderCount) {
                this.loadShader(shaderResourceLocations[this.shaderIndex]);
            } else {
                this.theShaderGroup = null;
            }
        }
    }

    public void loadShader(ResourceLocation resourceLocationIn) {
        try {
            this.theShaderGroup = new ShaderGroup(this.mc.getTextureManager(), this.resourceManager, this.mc.getFramebuffer(), resourceLocationIn);
            this.theShaderGroup.createBindFramebuffers(this.mc.displayWidth, this.mc.displayHeight);
            this.useShader = true;
        }
        catch (IOException ioexception) {
            logger.warn("Failed to load shader: " + resourceLocationIn, (Throwable)ioexception);
            this.shaderIndex = shaderCount;
            this.useShader = false;
        }
        catch (JsonSyntaxException jsonsyntaxexception) {
            logger.warn("Failed to load shader: " + resourceLocationIn, (Throwable)jsonsyntaxexception);
            this.shaderIndex = shaderCount;
            this.useShader = false;
        }
    }

    public void onResourceManagerReload(IResourceManager resourceManager) {
        if (this.theShaderGroup != null) {
            this.theShaderGroup.deleteShaderGroup();
        }
        this.theShaderGroup = null;
        if (this.shaderIndex != shaderCount) {
            this.loadShader(shaderResourceLocations[this.shaderIndex]);
        } else {
            this.loadEntityShader(this.mc.getRenderViewEntity());
        }
    }

    public void updateRenderer() {
        if (OpenGlHelper.shadersSupported && ShaderLinkHelper.getStaticShaderLinkHelper() == null) {
            ShaderLinkHelper.setNewStaticShaderLinkHelper();
        }
        this.updateFovModifierHand();
        this.updateTorchFlicker();
        this.fogColor2 = this.fogColor1;
        this.thirdPersonDistanceTemp = this.thirdPersonDistance;
        if (this.mc.gameSettings.smoothCamera) {
            float f = this.mc.gameSettings.mouseSensitivity * 0.6f + 0.2f;
            float f1 = f * f * f * 8.0f;
            this.smoothCamFilterX = this.mouseFilterXAxis.smooth(this.smoothCamYaw, 0.05f * f1);
            this.smoothCamFilterY = this.mouseFilterYAxis.smooth(this.smoothCamPitch, 0.05f * f1);
            this.smoothCamPartialTicks = 0.0f;
            this.smoothCamYaw = 0.0f;
            this.smoothCamPitch = 0.0f;
        } else {
            this.smoothCamFilterX = 0.0f;
            this.smoothCamFilterY = 0.0f;
            this.mouseFilterXAxis.reset();
            this.mouseFilterYAxis.reset();
        }
        if (this.mc.getRenderViewEntity() == null) {
            this.mc.setRenderViewEntity((Entity)this.mc.thePlayer);
        }
        float f3 = this.mc.theWorld.getLightBrightness(new BlockPos(this.mc.getRenderViewEntity()));
        float f4 = (float)this.mc.gameSettings.renderDistanceChunks / 32.0f;
        float f2 = f3 * (1.0f - f4) + f4;
        this.fogColor1 += (f2 - this.fogColor1) * 0.1f;
        ++this.rendererUpdateCount;
        this.itemRenderer.updateEquippedItem();
        this.addRainParticles();
        this.bossColorModifierPrev = this.bossColorModifier;
        if (BossStatus.hasColorModifier) {
            this.bossColorModifier += 0.05f;
            if (this.bossColorModifier > 1.0f) {
                this.bossColorModifier = 1.0f;
            }
            BossStatus.hasColorModifier = false;
        } else if (this.bossColorModifier > 0.0f) {
            this.bossColorModifier -= 0.0125f;
        }
    }

    public ShaderGroup getShaderGroup() {
        return this.theShaderGroup;
    }

    public void updateShaderGroupSize(int width, int height) {
        if (OpenGlHelper.shadersSupported) {
            if (this.theShaderGroup != null) {
                this.theShaderGroup.createBindFramebuffers(width, height);
            }
            this.mc.renderGlobal.createBindEntityOutlineFbs(width, height);
        }
    }

    public void getMouseOver(float partialTicks) {
        Entity entity = this.mc.getRenderViewEntity();
        if (entity != null && this.mc.theWorld != null) {
            this.mc.mcProfiler.startSection("pick");
            this.mc.pointedEntity = null;
            double d0 = this.mc.playerController.getBlockReachDistance();
            this.mc.objectMouseOver = entity.rayTrace(d0, partialTicks);
            double d1 = d0;
            Vec3 vec3 = entity.getPositionEyes(partialTicks);
            boolean flag = false;
            int i = 3;
            if (this.mc.playerController.extendedReach()) {
                d0 = 6.0;
                d1 = 6.0;
            } else if (d0 > 3.0) {
                flag = true;
            }
            if (this.mc.objectMouseOver != null) {
                d1 = this.mc.objectMouseOver.hitVec.distanceTo(vec3);
            }
            Vec3 vec31 = entity.getLook(partialTicks);
            Vec3 vec32 = vec3.addVector(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0);
            this.pointedEntity = null;
            Vec3 vec33 = null;
            float f = 1.0f;
            List list = this.mc.theWorld.getEntitiesInAABBexcluding(entity, entity.getEntityBoundingBox().addCoord(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0).expand((double)f, (double)f, (double)f), Predicates.and((Predicate)EntitySelectors.NOT_SPECTATING, (Predicate)new Predicate<Entity>(){

                public boolean apply(Entity p_apply_1_) {
                    return p_apply_1_.canBeCollidedWith();
                }
            }));
            double d2 = d1;
            for (int j = 0; j < list.size(); ++j) {
                double d3;
                Entity entity1 = (Entity)list.get(j);
                float f1 = entity1.getCollisionBorderSize();
                AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand((double)f1, (double)f1, (double)f1);
                MovingObjectPosition movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);
                if (axisalignedbb.isVecInside(vec3)) {
                    if (!(d2 >= 0.0)) continue;
                    this.pointedEntity = entity1;
                    vec33 = movingobjectposition == null ? vec3 : movingobjectposition.hitVec;
                    d2 = 0.0;
                    continue;
                }
                if (movingobjectposition == null || !((d3 = vec3.distanceTo(movingobjectposition.hitVec)) < d2) && d2 != 0.0) continue;
                if (entity1 == entity.ridingEntity && !entity.canRiderInteract()) {
                    if (d2 != 0.0) continue;
                    this.pointedEntity = entity1;
                    vec33 = movingobjectposition.hitVec;
                    continue;
                }
                this.pointedEntity = entity1;
                vec33 = movingobjectposition.hitVec;
                d2 = d3;
            }
            if (this.pointedEntity != null && flag && vec3.distanceTo(vec33) > 3.0) {
                this.pointedEntity = null;
                this.mc.objectMouseOver = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, vec33, (EnumFacing)null, new BlockPos(vec33));
            }
            if (this.pointedEntity != null && (d2 < d1 || this.mc.objectMouseOver == null)) {
                this.mc.objectMouseOver = new MovingObjectPosition(this.pointedEntity, vec33);
                if (this.pointedEntity instanceof EntityLivingBase || this.pointedEntity instanceof EntityItemFrame) {
                    this.mc.pointedEntity = this.pointedEntity;
                }
            }
            this.mc.mcProfiler.endSection();
        }
    }

    private void updateFovModifierHand() {
        float f = 1.0f;
        if (this.mc.getRenderViewEntity() instanceof AbstractClientPlayer) {
            AbstractClientPlayer abstractclientplayer = (AbstractClientPlayer)this.mc.getRenderViewEntity();
            f = abstractclientplayer.getFovModifier();
        }
        this.fovModifierHandPrev = this.fovModifierHand;
        this.fovModifierHand += (f - this.fovModifierHand) * 0.5f;
        if (this.fovModifierHand > 1.5f) {
            this.fovModifierHand = 1.5f;
        }
        if (this.fovModifierHand < 0.1f) {
            this.fovModifierHand = 0.1f;
        }
    }

    private float getFOVModifier(float partialTicks, boolean p_78481_2_) {
        Block block;
        if (this.debugView) {
            return 90.0f;
        }
        Entity entity = this.mc.getRenderViewEntity();
        float f = 70.0f;
        if (p_78481_2_) {
            f = this.mc.gameSettings.fovSetting;
            f *= this.fovModifierHandPrev + (this.fovModifierHand - this.fovModifierHandPrev) * partialTicks;
        }
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).getHealth() <= 0.0f) {
            float f1 = (float)((EntityLivingBase)entity).deathTime + partialTicks;
            f /= (1.0f - 500.0f / (f1 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((block = ActiveRenderInfo.getBlockAtEntityViewpoint((World)this.mc.theWorld, (Entity)entity, (float)partialTicks)).getMaterial() == Material.water) {
            f = f * 60.0f / 70.0f;
        }
        return f;
    }

    private void hurtCameraEffect(float partialTicks) {
        if (this.mc.getRenderViewEntity() instanceof EntityLivingBase) {
            EntityLivingBase entitylivingbase = (EntityLivingBase)this.mc.getRenderViewEntity();
            float f = (float)entitylivingbase.hurtTime - partialTicks;
            if (entitylivingbase.getHealth() <= 0.0f) {
                float f1 = (float)entitylivingbase.deathTime + partialTicks;
                GlStateManager.rotate((float)(40.0f - 8000.0f / (f1 + 200.0f)), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (f < 0.0f) {
                return;
            }
            f /= (float)entitylivingbase.maxHurtTime;
            f = MathHelper.sin((float)(f * f * f * f * (float)Math.PI));
            float f2 = entitylivingbase.attackedAtYaw;
            GlStateManager.rotate((float)(-f2), (float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.rotate((float)(-f * 14.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.rotate((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        }
    }

    private void setupViewBobbing(float partialTicks) {
        if (this.mc.getRenderViewEntity() instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer)this.mc.getRenderViewEntity();
            float f = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;
            GlStateManager.translate((float)(MathHelper.sin((float)(f1 * (float)Math.PI)) * f2 * 0.5f), (float)(-Math.abs(MathHelper.cos((float)(f1 * (float)Math.PI)) * f2)), (float)0.0f);
            GlStateManager.rotate((float)(MathHelper.sin((float)(f1 * (float)Math.PI)) * f2 * 3.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GlStateManager.rotate((float)(Math.abs(MathHelper.cos((float)(f1 * (float)Math.PI - 0.2f)) * f2) * 5.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.rotate((float)f3, (float)1.0f, (float)0.0f, (float)0.0f);
        }
    }

    private void orientCamera(float partialTicks) {
        Entity entity = this.mc.getRenderViewEntity();
        float f = entity.getEyeHeight();
        double d0 = entity.prevPosX + (entity.posX - entity.prevPosX) * (double)partialTicks;
        double d1 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double)partialTicks + (double)f;
        double d2 = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)partialTicks;
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).isPlayerSleeping()) {
            f = (float)((double)f + 1.0);
            GlStateManager.translate((float)0.0f, (float)0.3f, (float)0.0f);
            if (!this.mc.gameSettings.debugCamEnable) {
                BlockPos blockpos = new BlockPos(entity);
                IBlockState iblockstate = this.mc.theWorld.getBlockState(blockpos);
                ForgeHooksClient.orientBedCamera((IBlockAccess)this.mc.theWorld, (BlockPos)blockpos, (IBlockState)iblockstate, (Entity)entity);
                GlStateManager.rotate((float)(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks + 180.0f), (float)0.0f, (float)-1.0f, (float)0.0f);
                GlStateManager.rotate((float)(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks), (float)-1.0f, (float)0.0f, (float)0.0f);
            }
        } else if (this.mc.gameSettings.thirdPersonView > 0) {
            double d3 = this.thirdPersonDistanceTemp + (this.thirdPersonDistance - this.thirdPersonDistanceTemp) * partialTicks;
            if (this.mc.gameSettings.debugCamEnable) {
                GlStateManager.translate((float)0.0f, (float)0.0f, (float)((float)(-d3)));
            } else {
                float f1 = entity.rotationYaw;
                float f2 = entity.rotationPitch;
                if (this.mod.cameraToggled) {
                    f1 = this.mod.cameraYaw;
                    f2 = this.mod.cameraPitch;
                }
                if (this.mc.gameSettings.thirdPersonView == 2) {
                    f2 += 180.0f;
                }
                double d4 = (double)(-MathHelper.sin((float)(f1 / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(f2 / 180.0f * (float)Math.PI))) * d3;
                double d5 = (double)(MathHelper.cos((float)(f1 / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(f2 / 180.0f * (float)Math.PI))) * d3;
                double d6 = (double)(-MathHelper.sin((float)(f2 / 180.0f * (float)Math.PI))) * d3;
                for (int i = 0; i < 8; ++i) {
                    double d7;
                    MovingObjectPosition movingobjectposition;
                    float f3 = (i & 1) * 2 - 1;
                    float f4 = (i >> 1 & 1) * 2 - 1;
                    float f5 = (i >> 2 & 1) * 2 - 1;
                    if ((movingobjectposition = this.mc.theWorld.rayTraceBlocks(new Vec3(d0 + (double)(f3 *= 0.1f), d1 + (double)(f4 *= 0.1f), d2 + (double)(f5 *= 0.1f)), new Vec3(d0 - d4 + (double)f3 + (double)f5, d1 - d6 + (double)f4, d2 - d5 + (double)f5))) == null || !((d7 = movingobjectposition.hitVec.distanceTo(new Vec3(d0, d1, d2))) < d3)) continue;
                    d3 = d7;
                }
                if (this.mc.gameSettings.thirdPersonView == 2) {
                    GlStateManager.rotate((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (this.mod.cameraToggled) {
                    GlStateManager.rotate((float)(this.mod.cameraPitch - f2), (float)1.0f, (float)0.0f, (float)0.0f);
                    GlStateManager.rotate((float)(this.mod.cameraYaw - f1), (float)0.0f, (float)1.0f, (float)0.0f);
                    GlStateManager.translate((float)0.0f, (float)0.0f, (float)((float)(-d3)));
                    GlStateManager.rotate((float)(f1 - this.mod.cameraYaw), (float)0.0f, (float)1.0f, (float)0.0f);
                    GlStateManager.rotate((float)(f2 - this.mod.cameraPitch), (float)1.0f, (float)0.0f, (float)0.0f);
                } else {
                    GlStateManager.rotate((float)(entity.rotationPitch - f2), (float)1.0f, (float)0.0f, (float)0.0f);
                    GlStateManager.rotate((float)(entity.rotationYaw - f1), (float)0.0f, (float)1.0f, (float)0.0f);
                    GlStateManager.translate((float)0.0f, (float)0.0f, (float)((float)(-d3)));
                    GlStateManager.rotate((float)(f1 - entity.rotationYaw), (float)0.0f, (float)1.0f, (float)0.0f);
                    GlStateManager.rotate((float)(f2 - entity.rotationPitch), (float)1.0f, (float)0.0f, (float)0.0f);
                }
            }
        } else {
            GlStateManager.translate((float)0.0f, (float)0.0f, (float)-0.1f);
        }
        if (!this.mc.gameSettings.debugCamEnable) {
            float yaw = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks + 180.0f;
            float pitch = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
            float roll = 0.0f;
            if (entity instanceof EntityAnimal) {
                EntityAnimal entityanimal = (EntityAnimal)entity;
                yaw = entityanimal.prevRotationYawHead + (entityanimal.rotationYawHead - entityanimal.prevRotationYawHead) * partialTicks + 180.0f;
            }
            Block block = ActiveRenderInfo.getBlockAtEntityViewpoint((World)this.mc.theWorld, (Entity)entity, (float)partialTicks);
            EntityViewRenderEvent.CameraSetup event = new EntityViewRenderEvent.CameraSetup((EntityRenderer)this, entity, block, (double)partialTicks, yaw, pitch, roll);
            MinecraftForge.EVENT_BUS.post((Event)event);
            if (this.mod.cameraToggled) {
                GlStateManager.rotate((float)event.roll, (float)0.0f, (float)0.0f, (float)1.0f);
                GlStateManager.rotate((float)this.mod.cameraPitch, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.rotate((float)(this.mod.cameraYaw + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GlStateManager.rotate((float)event.roll, (float)0.0f, (float)0.0f, (float)1.0f);
                GlStateManager.rotate((float)event.pitch, (float)1.0f, (float)0.0f, (float)0.0f);
                GlStateManager.rotate((float)event.yaw, (float)0.0f, (float)1.0f, (float)0.0f);
            }
        }
        GlStateManager.translate((float)0.0f, (float)(-f), (float)0.0f);
        d0 = entity.prevPosX + (entity.posX - entity.prevPosX) * (double)partialTicks;
        d1 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double)partialTicks + (double)f;
        d2 = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)partialTicks;
        this.cloudFog = this.mc.renderGlobal.hasCloudFog(d0, d1, d2, partialTicks);
    }

    private void setupCameraTransform(float partialTicks, int pass) {
        float f1;
        this.farPlaneDistance = this.mc.gameSettings.renderDistanceChunks * 16;
        GlStateManager.matrixMode((int)5889);
        GlStateManager.loadIdentity();
        float f = 0.07f;
        if (this.mc.gameSettings.anaglyph) {
            GlStateManager.translate((float)((float)(-(pass * 2 - 1)) * f), (float)0.0f, (float)0.0f);
        }
        if (this.cameraZoom != 1.0) {
            GlStateManager.translate((float)((float)this.cameraYaw), (float)((float)(-this.cameraPitch)), (float)0.0f);
            GlStateManager.scale((double)this.cameraZoom, (double)this.cameraZoom, (double)1.0);
        }
        Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.displayWidth / (float)this.mc.displayHeight), (float)0.05f, (float)(this.farPlaneDistance * MathHelper.SQRT_2));
        GlStateManager.matrixMode((int)5888);
        GlStateManager.loadIdentity();
        if (this.mc.gameSettings.anaglyph) {
            GlStateManager.translate((float)((float)(pass * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        this.hurtCameraEffect(partialTicks);
        if (this.mc.gameSettings.viewBobbing) {
            this.setupViewBobbing(partialTicks);
        }
        if ((f1 = this.mc.thePlayer.prevTimeInPortal + (this.mc.thePlayer.timeInPortal - this.mc.thePlayer.prevTimeInPortal) * partialTicks) > 0.0f) {
            int i = 20;
            if (this.mc.thePlayer.isPotionActive(Potion.confusion)) {
                i = 7;
            }
            float f2 = 5.0f / (f1 * f1 + 5.0f) - f1 * 0.04f;
            f2 *= f2;
            GlStateManager.rotate((float)(((float)this.rendererUpdateCount + partialTicks) * (float)i), (float)0.0f, (float)1.0f, (float)1.0f);
            GlStateManager.scale((float)(1.0f / f2), (float)1.0f, (float)1.0f);
            GlStateManager.rotate((float)(-((float)this.rendererUpdateCount + partialTicks) * (float)i), (float)0.0f, (float)1.0f, (float)1.0f);
        }
        this.orientCamera(partialTicks);
        if (this.debugView) {
            switch (this.debugViewDirection) {
                case 0: {
                    GlStateManager.rotate((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    break;
                }
                case 1: {
                    GlStateManager.rotate((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    break;
                }
                case 2: {
                    GlStateManager.rotate((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    break;
                }
                case 3: {
                    GlStateManager.rotate((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 4: {
                    GlStateManager.rotate((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
            }
        }
    }

    private void renderHand(float partialTicks, int xOffset) {
        if (!this.debugView) {
            boolean flag;
            GlStateManager.matrixMode((int)5889);
            GlStateManager.loadIdentity();
            float f = 0.07f;
            if (this.mc.gameSettings.anaglyph) {
                GlStateManager.translate((float)((float)(-(xOffset * 2 - 1)) * f), (float)0.0f, (float)0.0f);
            }
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, false), (float)((float)this.mc.displayWidth / (float)this.mc.displayHeight), (float)0.05f, (float)(this.farPlaneDistance * 2.0f));
            GlStateManager.matrixMode((int)5888);
            GlStateManager.loadIdentity();
            if (this.mc.gameSettings.anaglyph) {
                GlStateManager.translate((float)((float)(xOffset * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
            }
            GlStateManager.pushMatrix();
            this.hurtCameraEffect(partialTicks);
            if (this.mc.gameSettings.viewBobbing) {
                this.setupViewBobbing(partialTicks);
            }
            boolean bl = flag = this.mc.getRenderViewEntity() instanceof EntityLivingBase && ((EntityLivingBase)this.mc.getRenderViewEntity()).isPlayerSleeping();
            if (!(this.mc.gameSettings.thirdPersonView != 0 || flag || this.mc.gameSettings.hideGUI || this.mc.playerController.isSpectator())) {
                this.enableLightmap();
                this.itemRenderer.renderItemInFirstPerson(partialTicks);
                this.disableLightmap();
            }
            GlStateManager.popMatrix();
            if (this.mc.gameSettings.thirdPersonView == 0 && !flag) {
                this.itemRenderer.renderOverlays(partialTicks);
                this.hurtCameraEffect(partialTicks);
            }
            if (this.mc.gameSettings.viewBobbing) {
                this.setupViewBobbing(partialTicks);
            }
        }
    }

    public void disableLightmap() {
        GlStateManager.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    public void enableLightmap() {
        GlStateManager.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GlStateManager.matrixMode((int)5890);
        GlStateManager.loadIdentity();
        float f = 0.00390625f;
        GlStateManager.scale((float)f, (float)f, (float)f);
        GlStateManager.translate((float)8.0f, (float)8.0f, (float)8.0f);
        GlStateManager.matrixMode((int)5888);
        this.mc.getTextureManager().bindTexture(this.locationLightMap);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    private void updateTorchFlicker() {
        this.torchFlickerDX = (float)((double)this.torchFlickerDX + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.torchFlickerDX = (float)((double)this.torchFlickerDX * 0.9);
        this.torchFlickerX += (this.torchFlickerDX - this.torchFlickerX) * 1.0f;
        this.lightmapUpdateNeeded = true;
    }

    private void updateLightmap(float partialTicks) {
        if (this.lightmapUpdateNeeded) {
            this.mc.mcProfiler.startSection("lightTex");
            WorldClient world = this.mc.theWorld;
            if (world != null) {
                float f = world.getSunBrightness(1.0f);
                float f1 = f * 0.95f + 0.05f;
                for (int i = 0; i < 256; ++i) {
                    float f2 = world.provider.getLightBrightnessTable()[i / 16] * f1;
                    float f3 = world.provider.getLightBrightnessTable()[i % 16] * (this.torchFlickerX * 0.1f + 1.5f);
                    if (world.getLastLightningBolt() > 0) {
                        f2 = world.provider.getLightBrightnessTable()[i / 16];
                    }
                    float f4 = f2 * (f * 0.65f + 0.35f);
                    float f5 = f2 * (f * 0.65f + 0.35f);
                    float f6 = f3 * ((f3 * 0.6f + 0.4f) * 0.6f + 0.4f);
                    float f7 = f3 * (f3 * f3 * 0.6f + 0.4f);
                    float f8 = f4 + f3;
                    float f9 = f5 + f6;
                    float f10 = f2 + f7;
                    f8 = f8 * 0.96f + 0.03f;
                    f9 = f9 * 0.96f + 0.03f;
                    f10 = f10 * 0.96f + 0.03f;
                    if (this.bossColorModifier > 0.0f) {
                        float f11 = this.bossColorModifierPrev + (this.bossColorModifier - this.bossColorModifierPrev) * partialTicks;
                        f8 = f8 * (1.0f - f11) + f8 * 0.7f * f11;
                        f9 = f9 * (1.0f - f11) + f9 * 0.6f * f11;
                        f10 = f10 * (1.0f - f11) + f10 * 0.6f * f11;
                    }
                    if (world.provider.getDimensionId() == 1) {
                        f8 = 0.22f + f3 * 0.75f;
                        f9 = 0.28f + f6 * 0.75f;
                        f10 = 0.25f + f7 * 0.75f;
                    }
                    if (this.mc.thePlayer.isPotionActive(Potion.nightVision)) {
                        float f15 = this.getNightVisionBrightness((EntityLivingBase)this.mc.thePlayer, partialTicks);
                        float f12 = 1.0f / f8;
                        if (f12 > 1.0f / f9) {
                            f12 = 1.0f / f9;
                        }
                        if (f12 > 1.0f / f10) {
                            f12 = 1.0f / f10;
                        }
                        f8 = f8 * (1.0f - f15) + f8 * f12 * f15;
                        f9 = f9 * (1.0f - f15) + f9 * f12 * f15;
                        f10 = f10 * (1.0f - f15) + f10 * f12 * f15;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    float f16 = this.mc.gameSettings.gammaSetting;
                    float f17 = 1.0f - f8;
                    float f13 = 1.0f - f9;
                    float f14 = 1.0f - f10;
                    f17 = 1.0f - f17 * f17 * f17 * f17;
                    f13 = 1.0f - f13 * f13 * f13 * f13;
                    f14 = 1.0f - f14 * f14 * f14 * f14;
                    f8 = f8 * (1.0f - f16) + f17 * f16;
                    f9 = f9 * (1.0f - f16) + f13 * f16;
                    f10 = f10 * (1.0f - f16) + f14 * f16;
                    f8 = f8 * 0.96f + 0.03f;
                    f9 = f9 * 0.96f + 0.03f;
                    f10 = f10 * 0.96f + 0.03f;
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f9 < 0.0f) {
                        f9 = 0.0f;
                    }
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    int j = 255;
                    int k = (int)(f8 * 255.0f);
                    int l = (int)(f9 * 255.0f);
                    int i1 = (int)(f10 * 255.0f);
                    this.lightmapColors[i] = j << 24 | k << 16 | l << 8 | i1;
                }
                this.lightmapTexture.updateDynamicTexture();
                this.lightmapUpdateNeeded = false;
                this.mc.mcProfiler.endSection();
            }
        }
    }

    private float getNightVisionBrightness(EntityLivingBase entitylivingbaseIn, float partialTicks) {
        int i = entitylivingbaseIn.getActivePotionEffect(Potion.nightVision).getDuration();
        return i > 200 ? 1.0f : 0.7f + MathHelper.sin((float)(((float)i - partialTicks) * (float)Math.PI * 0.2f)) * 0.3f;
    }

    public void updateCameraAndRender(float p_181560_1_, long p_181560_2_) {
        boolean flag = Display.isActive();
        if (!(flag || !this.mc.gameSettings.pauseOnLostFocus || this.mc.gameSettings.touchscreen && Mouse.isButtonDown((int)1))) {
            if (Minecraft.getSystemTime() - this.prevFrameTime > 500L) {
                this.mc.displayInGameMenu();
            }
        } else {
            this.prevFrameTime = Minecraft.getSystemTime();
        }
        this.mc.mcProfiler.startSection("mouse");
        if (flag && Minecraft.isRunningOnMac && this.mc.inGameHasFocus && !Mouse.isInsideWindow()) {
            Mouse.setGrabbed((boolean)false);
            Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2));
            Mouse.setGrabbed((boolean)true);
        }
        if (this.mc.inGameHasFocus && flag) {
            if (this.mod.cameraToggled && this.mc.gameSettings.thirdPersonView != 1) {
                this.mod.cameraToggled = false;
            }
            this.mc.mouseHelper.mouseXYChange();
            float f = this.mc.gameSettings.mouseSensitivity * 0.6f + 0.2f;
            float f1 = f * f * f * 8.0f;
            float f2 = (float)this.mc.mouseHelper.deltaX * f1;
            float f3 = (float)this.mc.mouseHelper.deltaY * f1;
            int i = 1;
            if (this.mc.gameSettings.invertMouse) {
                i = -1;
            }
            if (this.mc.gameSettings.smoothCamera) {
                this.smoothCamYaw += f2;
                this.smoothCamPitch += f3;
                float f4 = p_181560_1_ - this.smoothCamPartialTicks;
                this.smoothCamPartialTicks = p_181560_1_;
                f2 = this.smoothCamFilterX * f4;
                f3 = this.smoothCamFilterY * f4;
                if (this.mod.cameraToggled) {
                    this.mod.cameraYaw += f2 / 8.0f;
                    this.mod.cameraPitch += f3 / 8.0f;
                    if (Math.abs(this.mod.cameraPitch) > 90.0f) {
                        this.mod.cameraPitch = this.mod.cameraPitch > 0.0f ? 90.0f : -90.0f;
                    }
                } else {
                    this.mc.thePlayer.setAngles(f2, f3 * (float)i);
                }
            } else {
                this.smoothCamYaw = 0.0f;
                this.smoothCamPitch = 0.0f;
                if (this.mod.cameraToggled) {
                    this.mod.cameraYaw += f2 / 8.0f;
                    this.mod.cameraPitch += f3 / 8.0f;
                    if (Math.abs(this.mod.cameraPitch) > 90.0f) {
                        this.mod.cameraPitch = this.mod.cameraPitch > 0.0f ? 90.0f : -90.0f;
                    }
                } else {
                    this.mc.thePlayer.setAngles(f2, f3 * (float)i);
                }
            }
        }
        this.mc.mcProfiler.endSection();
        if (!this.mc.skipRenderWorld) {
            anaglyphEnable = this.mc.gameSettings.anaglyph;
            final ScaledResolution scaledresolution = new ScaledResolution(this.mc);
            int i1 = scaledresolution.getScaledWidth();
            int j1 = scaledresolution.getScaledHeight();
            final int k1 = Mouse.getX() * i1 / this.mc.displayWidth;
            final int l1 = j1 - Mouse.getY() * j1 / this.mc.displayHeight - 1;
            int i2 = this.mc.gameSettings.limitFramerate;
            if (this.mc.theWorld != null) {
                this.mc.mcProfiler.startSection("level");
                int j = Math.min(Minecraft.getDebugFPS(), i2);
                j = Math.max(j, 60);
                long k = System.nanoTime() - p_181560_2_;
                long l = Math.max((long)(1000000000 / j / 4) - k, 0L);
                this.renderWorld(p_181560_1_, System.nanoTime() + l);
                if (OpenGlHelper.shadersSupported) {
                    this.mc.renderGlobal.renderEntityOutlineFramebuffer();
                    if (this.theShaderGroup != null && this.useShader) {
                        GlStateManager.matrixMode((int)5890);
                        GlStateManager.pushMatrix();
                        GlStateManager.loadIdentity();
                        this.theShaderGroup.loadShaderGroup(p_181560_1_);
                        GlStateManager.popMatrix();
                    }
                    this.mc.getFramebuffer().bindFramebuffer(true);
                }
                this.renderEndNanoTime = System.nanoTime();
                this.mc.mcProfiler.endStartSection("gui");
                if (!this.mc.gameSettings.hideGUI || this.mc.currentScreen != null) {
                    GlStateManager.alphaFunc((int)516, (float)0.1f);
                    this.mc.ingameGUI.renderGameOverlay(p_181560_1_);
                }
                this.mc.mcProfiler.endSection();
            } else {
                GlStateManager.viewport((int)0, (int)0, (int)this.mc.displayWidth, (int)this.mc.displayHeight);
                GlStateManager.matrixMode((int)5889);
                GlStateManager.loadIdentity();
                GlStateManager.matrixMode((int)5888);
                GlStateManager.loadIdentity();
                this.setupOverlayRendering();
                this.renderEndNanoTime = System.nanoTime();
            }
            if (this.mc.currentScreen != null) {
                GlStateManager.clear((int)256);
                try {
                    ForgeHooksClient.drawScreen((GuiScreen)this.mc.currentScreen, (int)k1, (int)l1, (float)p_181560_1_);
                }
                catch (Throwable throwable) {
                    CrashReport crashreport = CrashReport.makeCrashReport((Throwable)throwable, (String)"Rendering screen");
                    CrashReportCategory crashreportcategory = crashreport.makeCategory("Screen render details");
                    crashreportcategory.addCrashSectionCallable("Screen name", (Callable)new Callable<String>(){

                        @Override
                        public String call() throws Exception {
                            return ((PEntityRenderer)PEntityRenderer.this).mc.currentScreen.getClass().getCanonicalName();
                        }
                    });
                    crashreportcategory.addCrashSectionCallable("Mouse location", (Callable)new Callable<String>(){

                        @Override
                        public String call() throws Exception {
                            return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", k1, l1, Mouse.getX(), Mouse.getY());
                        }
                    });
                    crashreportcategory.addCrashSectionCallable("Screen size", (Callable)new Callable<String>(){

                        @Override
                        public String call() throws Exception {
                            return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", scaledresolution.getScaledWidth(), scaledresolution.getScaledHeight(), ((PEntityRenderer)PEntityRenderer.this).mc.displayWidth, ((PEntityRenderer)PEntityRenderer.this).mc.displayHeight, scaledresolution.getScaleFactor());
                        }
                    });
                    throw new ReportedException(crashreport);
                }
            }
        }
    }

    public void renderStreamIndicator(float partialTicks) {
        this.setupOverlayRendering();
        this.mc.ingameGUI.renderStreamIndicator(new ScaledResolution(this.mc));
    }

    private boolean isDrawBlockOutline() {
        boolean flag;
        if (!this.drawBlockOutline) {
            return false;
        }
        Entity entity = this.mc.getRenderViewEntity();
        boolean bl = flag = entity instanceof EntityPlayer && !this.mc.gameSettings.hideGUI;
        if (flag && !((EntityPlayer)entity).capabilities.allowEdit) {
            ItemStack itemstack = ((EntityPlayer)entity).getCurrentEquippedItem();
            if (this.mc.objectMouseOver != null && this.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                BlockPos blockpos = this.mc.objectMouseOver.getBlockPos();
                Block block = this.mc.theWorld.getBlockState(blockpos).getBlock();
                flag = this.mc.playerController.getCurrentGameType() == WorldSettings.GameType.SPECTATOR ? block.hasTileEntity(this.mc.theWorld.getBlockState(blockpos)) && this.mc.theWorld.getTileEntity(blockpos) instanceof IInventory : itemstack != null && (itemstack.canDestroy(block) || itemstack.canPlaceOn(block));
            }
        }
        return flag;
    }

    private void renderWorldDirections(float partialTicks) {
        if (this.mc.gameSettings.showDebugInfo && !this.mc.gameSettings.hideGUI && !this.mc.thePlayer.hasReducedDebug() && !this.mc.gameSettings.reducedDebugInfo) {
            Entity entity = this.mc.getRenderViewEntity();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
            GL11.glLineWidth((float)1.0f);
            GlStateManager.disableTexture2D();
            GlStateManager.depthMask((boolean)false);
            GlStateManager.pushMatrix();
            GlStateManager.matrixMode((int)5888);
            GlStateManager.loadIdentity();
            this.orientCamera(partialTicks);
            GlStateManager.translate((float)0.0f, (float)entity.getEyeHeight(), (float)0.0f);
            RenderGlobal.drawOutlinedBoundingBox((AxisAlignedBB)new AxisAlignedBB(0.0, 0.0, 0.0, 0.005, 1.0E-4, 1.0E-4), (int)255, (int)0, (int)0, (int)255);
            RenderGlobal.drawOutlinedBoundingBox((AxisAlignedBB)new AxisAlignedBB(0.0, 0.0, 0.0, 1.0E-4, 1.0E-4, 0.005), (int)0, (int)0, (int)255, (int)255);
            RenderGlobal.drawOutlinedBoundingBox((AxisAlignedBB)new AxisAlignedBB(0.0, 0.0, 0.0, 1.0E-4, 0.0033, 1.0E-4), (int)0, (int)255, (int)0, (int)255);
            GlStateManager.popMatrix();
            GlStateManager.depthMask((boolean)true);
            GlStateManager.enableTexture2D();
            GlStateManager.disableBlend();
        }
    }

    public void renderWorld(float partialTicks, long finishTimeNano) {
        this.updateLightmap(partialTicks);
        if (this.mc.getRenderViewEntity() == null) {
            this.mc.setRenderViewEntity((Entity)this.mc.thePlayer);
        }
        this.getMouseOver(partialTicks);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc((int)516, (float)0.5f);
        this.mc.mcProfiler.startSection("center");
        if (this.mc.gameSettings.anaglyph) {
            anaglyphField = 0;
            GlStateManager.colorMask((boolean)false, (boolean)true, (boolean)true, (boolean)false);
            this.renderWorldPass(0, partialTicks, finishTimeNano);
            anaglyphField = 1;
            GlStateManager.colorMask((boolean)true, (boolean)false, (boolean)false, (boolean)false);
            this.renderWorldPass(1, partialTicks, finishTimeNano);
            GlStateManager.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        } else {
            this.renderWorldPass(2, partialTicks, finishTimeNano);
        }
        this.mc.mcProfiler.endSection();
    }

    private void renderWorldPass(int pass, float partialTicks, long finishTimeNano) {
        RenderGlobal renderglobal = this.mc.renderGlobal;
        EffectRenderer effectrenderer = this.mc.effectRenderer;
        boolean flag = this.isDrawBlockOutline();
        GlStateManager.enableCull();
        this.mc.mcProfiler.endStartSection("clear");
        GlStateManager.viewport((int)0, (int)0, (int)this.mc.displayWidth, (int)this.mc.displayHeight);
        this.updateFogColor(partialTicks);
        GlStateManager.clear((int)16640);
        this.mc.mcProfiler.endStartSection("camera");
        this.setupCameraTransform(partialTicks, pass);
        ActiveRenderInfo.updateRenderInfo((EntityPlayer)this.mc.thePlayer, (this.mc.gameSettings.thirdPersonView == 2 ? 1 : 0) != 0);
        this.mc.mcProfiler.endStartSection("frustum");
        ClippingHelperImpl.getInstance();
        this.mc.mcProfiler.endStartSection("culling");
        Frustum icamera = new Frustum();
        Entity entity = this.mc.getRenderViewEntity();
        double d0 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)partialTicks;
        double d1 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)partialTicks;
        double d2 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)partialTicks;
        icamera.setPosition(d0, d1, d2);
        if (this.mc.gameSettings.renderDistanceChunks >= 4) {
            this.setupFog(-1, partialTicks);
            this.mc.mcProfiler.endStartSection("sky");
            GlStateManager.matrixMode((int)5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.displayWidth / (float)this.mc.displayHeight), (float)0.05f, (float)(this.farPlaneDistance * 2.0f));
            GlStateManager.matrixMode((int)5888);
            renderglobal.renderSky(partialTicks, pass);
            GlStateManager.matrixMode((int)5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.displayWidth / (float)this.mc.displayHeight), (float)0.05f, (float)(this.farPlaneDistance * MathHelper.SQRT_2));
            GlStateManager.matrixMode((int)5888);
        }
        this.setupFog(0, partialTicks);
        GlStateManager.shadeModel((int)7425);
        if (entity.posY + (double)entity.getEyeHeight() < 128.0) {
            this.renderCloudsCheck(renderglobal, partialTicks, pass);
        }
        this.mc.mcProfiler.endStartSection("prepareterrain");
        this.setupFog(0, partialTicks);
        this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        RenderHelper.disableStandardItemLighting();
        this.mc.mcProfiler.endStartSection("terrain_setup");
        renderglobal.setupTerrain(entity, (double)partialTicks, (ICamera)icamera, this.frameCount++, this.mc.thePlayer.isSpectator());
        if (pass == 0 || pass == 2) {
            this.mc.mcProfiler.endStartSection("updatechunks");
            this.mc.renderGlobal.updateChunks(finishTimeNano);
        }
        this.mc.mcProfiler.endStartSection("terrain");
        GlStateManager.matrixMode((int)5888);
        GlStateManager.pushMatrix();
        GlStateManager.disableAlpha();
        renderglobal.renderBlockLayer(EnumWorldBlockLayer.SOLID, (double)partialTicks, pass, entity);
        GlStateManager.enableAlpha();
        renderglobal.renderBlockLayer(EnumWorldBlockLayer.CUTOUT_MIPPED, (double)partialTicks, pass, entity);
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).setBlurMipmap(false, false);
        renderglobal.renderBlockLayer(EnumWorldBlockLayer.CUTOUT, (double)partialTicks, pass, entity);
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.alphaFunc((int)516, (float)0.1f);
        if (!this.debugView) {
            GlStateManager.matrixMode((int)5888);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            RenderHelper.enableStandardItemLighting();
            this.mc.mcProfiler.endStartSection("entities");
            ForgeHooksClient.setRenderPass((int)0);
            renderglobal.renderEntities(entity, (ICamera)icamera, partialTicks);
            ForgeHooksClient.setRenderPass((int)0);
            RenderHelper.disableStandardItemLighting();
            this.disableLightmap();
            GlStateManager.matrixMode((int)5888);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            if (this.mc.objectMouseOver != null && entity.isInsideOfMaterial(Material.water) && flag) {
                EntityPlayer entityplayer = (EntityPlayer)entity;
                GlStateManager.disableAlpha();
                this.mc.mcProfiler.endStartSection("outline");
                if (!ForgeHooksClient.onDrawBlockHighlight((RenderGlobal)renderglobal, (EntityPlayer)entityplayer, (MovingObjectPosition)this.mc.objectMouseOver, (int)0, (ItemStack)entityplayer.getHeldItem(), (float)partialTicks)) {
                    renderglobal.drawSelectionBox(entityplayer, this.mc.objectMouseOver, 0, partialTicks);
                }
                GlStateManager.enableAlpha();
            }
        }
        GlStateManager.matrixMode((int)5888);
        GlStateManager.popMatrix();
        if (flag && this.mc.objectMouseOver != null && !entity.isInsideOfMaterial(Material.water)) {
            EntityPlayer entityplayer1 = (EntityPlayer)entity;
            GlStateManager.disableAlpha();
            this.mc.mcProfiler.endStartSection("outline");
            if (!ForgeHooksClient.onDrawBlockHighlight((RenderGlobal)renderglobal, (EntityPlayer)entityplayer1, (MovingObjectPosition)this.mc.objectMouseOver, (int)0, (ItemStack)entityplayer1.getHeldItem(), (float)partialTicks)) {
                renderglobal.drawSelectionBox(entityplayer1, this.mc.objectMouseOver, 0, partialTicks);
            }
            GlStateManager.enableAlpha();
        }
        this.mc.mcProfiler.endStartSection("destroyProgress");
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)1, (int)1, (int)0);
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).setBlurMipmap(false, false);
        renderglobal.drawBlockDamageTexture(Tessellator.getInstance(), Tessellator.getInstance().getWorldRenderer(), entity, partialTicks);
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
        GlStateManager.disableBlend();
        if (!this.debugView) {
            this.enableLightmap();
            this.mc.mcProfiler.endStartSection("litParticles");
            effectrenderer.renderLitParticles(entity, partialTicks);
            RenderHelper.disableStandardItemLighting();
            this.setupFog(0, partialTicks);
            this.mc.mcProfiler.endStartSection("particles");
            effectrenderer.renderParticles(entity, partialTicks);
            this.disableLightmap();
        }
        GlStateManager.depthMask((boolean)false);
        GlStateManager.enableCull();
        this.mc.mcProfiler.endStartSection("weather");
        this.renderRainSnow(partialTicks);
        GlStateManager.depthMask((boolean)true);
        renderglobal.renderWorldBorder(entity, partialTicks);
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.alphaFunc((int)516, (float)0.1f);
        this.setupFog(0, partialTicks);
        GlStateManager.enableBlend();
        GlStateManager.depthMask((boolean)false);
        this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        GlStateManager.shadeModel((int)7425);
        this.mc.mcProfiler.endStartSection("translucent");
        renderglobal.renderBlockLayer(EnumWorldBlockLayer.TRANSLUCENT, (double)partialTicks, pass, entity);
        if (!this.debugView) {
            RenderHelper.enableStandardItemLighting();
            this.mc.mcProfiler.endStartSection("entities");
            ForgeHooksClient.setRenderPass((int)1);
            renderglobal.renderEntities(entity, (ICamera)icamera, partialTicks);
            ForgeHooksClient.setRenderPass((int)-1);
            RenderHelper.disableStandardItemLighting();
        }
        GlStateManager.shadeModel((int)7424);
        GlStateManager.depthMask((boolean)true);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.disableFog();
        if (entity.posY + (double)entity.getEyeHeight() >= 128.0) {
            this.mc.mcProfiler.endStartSection("aboveClouds");
            this.renderCloudsCheck(renderglobal, partialTicks, pass);
        }
        this.mc.mcProfiler.endStartSection("forge_render_last");
        ForgeHooksClient.dispatchRenderLast((RenderGlobal)renderglobal, (float)partialTicks);
        this.mc.mcProfiler.endStartSection("hand");
        if (!ForgeHooksClient.renderFirstPersonHand((RenderGlobal)renderglobal, (float)partialTicks, (int)pass) && this.renderHand) {
            GlStateManager.clear((int)256);
            this.renderHand(partialTicks, pass);
            this.renderWorldDirections(partialTicks);
        }
    }

    private void renderCloudsCheck(RenderGlobal renderGlobalIn, float partialTicks, int pass) {
        if (this.mc.gameSettings.shouldRenderClouds() != 0) {
            this.mc.mcProfiler.endStartSection("clouds");
            GlStateManager.matrixMode((int)5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.displayWidth / (float)this.mc.displayHeight), (float)0.05f, (float)(this.farPlaneDistance * 4.0f));
            GlStateManager.matrixMode((int)5888);
            GlStateManager.pushMatrix();
            this.setupFog(0, partialTicks);
            renderGlobalIn.renderClouds(partialTicks, pass);
            GlStateManager.disableFog();
            GlStateManager.popMatrix();
            GlStateManager.matrixMode((int)5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective((float)this.getFOVModifier(partialTicks, true), (float)((float)this.mc.displayWidth / (float)this.mc.displayHeight), (float)0.05f, (float)(this.farPlaneDistance * MathHelper.SQRT_2));
            GlStateManager.matrixMode((int)5888);
        }
    }

    private void addRainParticles() {
        float f = this.mc.theWorld.getRainStrength(1.0f);
        if (!this.mc.gameSettings.fancyGraphics) {
            f /= 2.0f;
        }
        if (f != 0.0f) {
            this.random.setSeed((long)this.rendererUpdateCount * 312987231L);
            Entity entity = this.mc.getRenderViewEntity();
            WorldClient world = this.mc.theWorld;
            BlockPos blockpos = new BlockPos(entity);
            int i = 10;
            double d0 = 0.0;
            double d1 = 0.0;
            double d2 = 0.0;
            int j = 0;
            int k = (int)(100.0f * f * f);
            if (this.mc.gameSettings.particleSetting == 1) {
                k >>= 1;
            } else if (this.mc.gameSettings.particleSetting == 2) {
                k = 0;
            }
            for (int l = 0; l < k; ++l) {
                BlockPos blockpos1 = world.getPrecipitationHeight(blockpos.add(this.random.nextInt(i) - this.random.nextInt(i), 0, this.random.nextInt(i) - this.random.nextInt(i)));
                BiomeGenBase biomegenbase = world.getBiomeGenForCoords(blockpos1);
                BlockPos blockpos2 = blockpos1.down();
                Block block = world.getBlockState(blockpos2).getBlock();
                if (blockpos1.getY() > blockpos.getY() + i || blockpos1.getY() < blockpos.getY() - i || !biomegenbase.canRain() || !(biomegenbase.getFloatTemperature(blockpos1) >= 0.15f)) continue;
                double d3 = this.random.nextDouble();
                double d4 = this.random.nextDouble();
                if (block.getMaterial() == Material.lava) {
                    this.mc.theWorld.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double)blockpos1.getX() + d3, (double)((float)blockpos1.getY() + 0.1f) - block.getBlockBoundsMinY(), (double)blockpos1.getZ() + d4, 0.0, 0.0, 0.0, new int[0]);
                    continue;
                }
                if (block.getMaterial() == Material.air) continue;
                block.setBlockBoundsBasedOnState((IBlockAccess)world, blockpos2);
                if (this.random.nextInt(++j) == 0) {
                    d0 = (double)blockpos2.getX() + d3;
                    d1 = (double)((float)blockpos2.getY() + 0.1f) + block.getBlockBoundsMaxY() - 1.0;
                    d2 = (double)blockpos2.getZ() + d4;
                }
                this.mc.theWorld.spawnParticle(EnumParticleTypes.WATER_DROP, (double)blockpos2.getX() + d3, (double)((float)blockpos2.getY() + 0.1f) + block.getBlockBoundsMaxY(), (double)blockpos2.getZ() + d4, 0.0, 0.0, 0.0, new int[0]);
            }
            if (j > 0 && this.random.nextInt(3) < this.rainSoundCounter++) {
                this.rainSoundCounter = 0;
                if (d1 > (double)(blockpos.getY() + 1) && world.getPrecipitationHeight(blockpos).getY() > MathHelper.floor_float((float)blockpos.getY())) {
                    this.mc.theWorld.playSound(d0, d1, d2, "ambient.weather.rain", 0.1f, 0.5f, false);
                } else {
                    this.mc.theWorld.playSound(d0, d1, d2, "ambient.weather.rain", 0.2f, 1.0f, false);
                }
            }
        }
    }

    protected void renderRainSnow(float partialTicks) {
        IRenderHandler renderer = this.mc.theWorld.provider.getWeatherRenderer();
        if (renderer != null) {
            renderer.render(partialTicks, this.mc.theWorld, this.mc);
            return;
        }
        float f = this.mc.theWorld.getRainStrength(partialTicks);
        if (f > 0.0f) {
            this.enableLightmap();
            Entity entity = this.mc.getRenderViewEntity();
            WorldClient world = this.mc.theWorld;
            int i = MathHelper.floor_double((double)entity.posX);
            int j = MathHelper.floor_double((double)entity.posY);
            int k = MathHelper.floor_double((double)entity.posZ);
            Tessellator tessellator = Tessellator.getInstance();
            WorldRenderer worldrenderer = tessellator.getWorldRenderer();
            GlStateManager.disableCull();
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
            GlStateManager.alphaFunc((int)516, (float)0.1f);
            double d0 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)partialTicks;
            double d1 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)partialTicks;
            double d2 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)partialTicks;
            int l = MathHelper.floor_double((double)d1);
            int i1 = 5;
            if (this.mc.gameSettings.fancyGraphics) {
                i1 = 10;
            }
            int j1 = -1;
            float f1 = (float)this.rendererUpdateCount + partialTicks;
            worldrenderer.setTranslation(-d0, -d1, -d2);
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
            for (int k1 = k - i1; k1 <= k + i1; ++k1) {
                for (int l1 = i - i1; l1 <= i + i1; ++l1) {
                    int i2 = (k1 - k + 16) * 32 + l1 - i + 16;
                    double d3 = (double)this.rainXCoords[i2] * 0.5;
                    double d4 = (double)this.rainYCoords[i2] * 0.5;
                    blockpos$mutableblockpos.set(l1, 0, k1);
                    BiomeGenBase biomegenbase = world.getBiomeGenForCoords((BlockPos)blockpos$mutableblockpos);
                    if (!biomegenbase.canRain() && !biomegenbase.getEnableSnow()) continue;
                    int j2 = world.getPrecipitationHeight((BlockPos)blockpos$mutableblockpos).getY();
                    int k2 = j - i1;
                    int l2 = j + i1;
                    if (k2 < j2) {
                        k2 = j2;
                    }
                    if (l2 < j2) {
                        l2 = j2;
                    }
                    int i3 = j2;
                    if (j2 < l) {
                        i3 = l;
                    }
                    if (k2 == l2) continue;
                    this.random.setSeed(l1 * l1 * 3121 + l1 * 45238971 ^ k1 * k1 * 418711 + k1 * 13761);
                    blockpos$mutableblockpos.set(l1, k2, k1);
                    float f2 = biomegenbase.getFloatTemperature((BlockPos)blockpos$mutableblockpos);
                    if (world.getWorldChunkManager().getTemperatureAtHeight(f2, j2) >= 0.15f) {
                        if (j1 != 0) {
                            if (j1 >= 0) {
                                tessellator.draw();
                            }
                            j1 = 0;
                            this.mc.getTextureManager().bindTexture(locationRainPng);
                            worldrenderer.begin(7, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                        }
                        double d5 = ((double)(this.rendererUpdateCount + l1 * l1 * 3121 + l1 * 45238971 + k1 * k1 * 418711 + k1 * 13761 & 0x1F) + (double)partialTicks) / 32.0 * (3.0 + this.random.nextDouble());
                        double d6 = (double)((float)l1 + 0.5f) - entity.posX;
                        double d7 = (double)((float)k1 + 0.5f) - entity.posZ;
                        float f3 = MathHelper.sqrt_double((double)(d6 * d6 + d7 * d7)) / (float)i1;
                        float f4 = ((1.0f - f3 * f3) * 0.5f + 0.5f) * f;
                        blockpos$mutableblockpos.set(l1, i3, k1);
                        int j3 = world.getCombinedLight((BlockPos)blockpos$mutableblockpos, 0);
                        int k3 = j3 >> 16 & 0xFFFF;
                        int l3 = j3 & 0xFFFF;
                        worldrenderer.pos((double)l1 - d3 + 0.5, (double)k2, (double)k1 - d4 + 0.5).tex(0.0, (double)k2 * 0.25 + d5).color(1.0f, 1.0f, 1.0f, f4).lightmap(k3, l3).endVertex();
                        worldrenderer.pos((double)l1 + d3 + 0.5, (double)k2, (double)k1 + d4 + 0.5).tex(1.0, (double)k2 * 0.25 + d5).color(1.0f, 1.0f, 1.0f, f4).lightmap(k3, l3).endVertex();
                        worldrenderer.pos((double)l1 + d3 + 0.5, (double)l2, (double)k1 + d4 + 0.5).tex(1.0, (double)l2 * 0.25 + d5).color(1.0f, 1.0f, 1.0f, f4).lightmap(k3, l3).endVertex();
                        worldrenderer.pos((double)l1 - d3 + 0.5, (double)l2, (double)k1 - d4 + 0.5).tex(0.0, (double)l2 * 0.25 + d5).color(1.0f, 1.0f, 1.0f, f4).lightmap(k3, l3).endVertex();
                        continue;
                    }
                    if (j1 != 1) {
                        if (j1 >= 0) {
                            tessellator.draw();
                        }
                        j1 = 1;
                        this.mc.getTextureManager().bindTexture(locationSnowPng);
                        worldrenderer.begin(7, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                    }
                    double d8 = ((float)(this.rendererUpdateCount & 0x1FF) + partialTicks) / 512.0f;
                    double d9 = this.random.nextDouble() + (double)f1 * 0.01 * (double)((float)this.random.nextGaussian());
                    double d10 = this.random.nextDouble() + (double)(f1 * (float)this.random.nextGaussian()) * 0.001;
                    double d11 = (double)((float)l1 + 0.5f) - entity.posX;
                    double d12 = (double)((float)k1 + 0.5f) - entity.posZ;
                    float f6 = MathHelper.sqrt_double((double)(d11 * d11 + d12 * d12)) / (float)i1;
                    float f5 = ((1.0f - f6 * f6) * 0.3f + 0.5f) * f;
                    blockpos$mutableblockpos.set(l1, i3, k1);
                    int i4 = (world.getCombinedLight((BlockPos)blockpos$mutableblockpos, 0) * 3 + 0xF000F0) / 4;
                    int j4 = i4 >> 16 & 0xFFFF;
                    int k4 = i4 & 0xFFFF;
                    worldrenderer.pos((double)l1 - d3 + 0.5, (double)k2, (double)k1 - d4 + 0.5).tex(0.0 + d9, (double)k2 * 0.25 + d8 + d10).color(1.0f, 1.0f, 1.0f, f5).lightmap(j4, k4).endVertex();
                    worldrenderer.pos((double)l1 + d3 + 0.5, (double)k2, (double)k1 + d4 + 0.5).tex(1.0 + d9, (double)k2 * 0.25 + d8 + d10).color(1.0f, 1.0f, 1.0f, f5).lightmap(j4, k4).endVertex();
                    worldrenderer.pos((double)l1 + d3 + 0.5, (double)l2, (double)k1 + d4 + 0.5).tex(1.0 + d9, (double)l2 * 0.25 + d8 + d10).color(1.0f, 1.0f, 1.0f, f5).lightmap(j4, k4).endVertex();
                    worldrenderer.pos((double)l1 - d3 + 0.5, (double)l2, (double)k1 - d4 + 0.5).tex(0.0 + d9, (double)l2 * 0.25 + d8 + d10).color(1.0f, 1.0f, 1.0f, f5).lightmap(j4, k4).endVertex();
                }
            }
            if (j1 >= 0) {
                tessellator.draw();
            }
            worldrenderer.setTranslation(0.0, 0.0, 0.0);
            GlStateManager.enableCull();
            GlStateManager.disableBlend();
            GlStateManager.alphaFunc((int)516, (float)0.1f);
            this.disableLightmap();
        }
    }

    public void setupOverlayRendering() {
        ScaledResolution scaledresolution = new ScaledResolution(this.mc);
        GlStateManager.clear((int)256);
        GlStateManager.matrixMode((int)5889);
        GlStateManager.loadIdentity();
        GlStateManager.ortho((double)0.0, (double)scaledresolution.getScaledWidth_double(), (double)scaledresolution.getScaledHeight_double(), (double)0.0, (double)1000.0, (double)3000.0);
        GlStateManager.matrixMode((int)5888);
        GlStateManager.loadIdentity();
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    private void updateFogColor(float partialTicks) {
        float f9;
        WorldClient world = this.mc.theWorld;
        Entity entity = this.mc.getRenderViewEntity();
        float f = 0.25f + 0.75f * (float)this.mc.gameSettings.renderDistanceChunks / 32.0f;
        f = 1.0f - (float)Math.pow(f, 0.25);
        Vec3 vec3 = world.getSkyColor(this.mc.getRenderViewEntity(), partialTicks);
        float f1 = (float)vec3.xCoord;
        float f2 = (float)vec3.yCoord;
        float f3 = (float)vec3.zCoord;
        Vec3 vec31 = world.getFogColor(partialTicks);
        this.fogColorRed = (float)vec31.xCoord;
        this.fogColorGreen = (float)vec31.yCoord;
        this.fogColorBlue = (float)vec31.zCoord;
        if (this.mc.gameSettings.renderDistanceChunks >= 4) {
            float[] afloat;
            double d0 = -1.0;
            Vec3 vec32 = MathHelper.sin((float)world.getCelestialAngleRadians(partialTicks)) > 0.0f ? new Vec3(d0, 0.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
            float f5 = (float)entity.getLook(partialTicks).dotProduct(vec32);
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 0.0f && (afloat = world.provider.calcSunriseSunsetColors(world.getCelestialAngle(partialTicks), partialTicks)) != null) {
                this.fogColorRed = this.fogColorRed * (1.0f - (f5 *= afloat[3])) + afloat[0] * f5;
                this.fogColorGreen = this.fogColorGreen * (1.0f - f5) + afloat[1] * f5;
                this.fogColorBlue = this.fogColorBlue * (1.0f - f5) + afloat[2] * f5;
            }
        }
        this.fogColorRed += (f1 - this.fogColorRed) * f;
        this.fogColorGreen += (f2 - this.fogColorGreen) * f;
        this.fogColorBlue += (f3 - this.fogColorBlue) * f;
        float f8 = world.getRainStrength(partialTicks);
        if (f8 > 0.0f) {
            float f4 = 1.0f - f8 * 0.5f;
            float f10 = 1.0f - f8 * 0.4f;
            this.fogColorRed *= f4;
            this.fogColorGreen *= f4;
            this.fogColorBlue *= f10;
        }
        if ((f9 = world.getThunderStrength(partialTicks)) > 0.0f) {
            float f11 = 1.0f - f9 * 0.5f;
            this.fogColorRed *= f11;
            this.fogColorGreen *= f11;
            this.fogColorBlue *= f11;
        }
        Block block = ActiveRenderInfo.getBlockAtEntityViewpoint((World)this.mc.theWorld, (Entity)entity, (float)partialTicks);
        if (this.cloudFog) {
            Vec3 vec33 = world.getCloudColour(partialTicks);
            this.fogColorRed = (float)vec33.xCoord;
            this.fogColorGreen = (float)vec33.yCoord;
            this.fogColorBlue = (float)vec33.zCoord;
        } else if (block.getMaterial() == Material.water) {
            float f12 = (float)EnchantmentHelper.getRespiration((Entity)entity) * 0.2f;
            if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).isPotionActive(Potion.waterBreathing)) {
                f12 = f12 * 0.3f + 0.6f;
            }
            this.fogColorRed = 0.02f + f12;
            this.fogColorGreen = 0.02f + f12;
            this.fogColorBlue = 0.2f + f12;
        } else if (block.getMaterial() == Material.lava) {
            this.fogColorRed = 0.6f;
            this.fogColorGreen = 0.1f;
            this.fogColorBlue = 0.0f;
        }
        float f13 = this.fogColor2 + (this.fogColor1 - this.fogColor2) * partialTicks;
        this.fogColorRed *= f13;
        this.fogColorGreen *= f13;
        this.fogColorBlue *= f13;
        double d1 = (entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)partialTicks) * world.provider.getVoidFogYFactor();
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).isPotionActive(Potion.blindness)) {
            int i = ((EntityLivingBase)entity).getActivePotionEffect(Potion.blindness).getDuration();
            d1 = i < 20 ? (d1 *= (double)(1.0f - (float)i / 20.0f)) : 0.0;
        }
        if (d1 < 1.0) {
            if (d1 < 0.0) {
                d1 = 0.0;
            }
            d1 *= d1;
            this.fogColorRed = (float)((double)this.fogColorRed * d1);
            this.fogColorGreen = (float)((double)this.fogColorGreen * d1);
            this.fogColorBlue = (float)((double)this.fogColorBlue * d1);
        }
        if (this.bossColorModifier > 0.0f) {
            float f14 = this.bossColorModifierPrev + (this.bossColorModifier - this.bossColorModifierPrev) * partialTicks;
            this.fogColorRed = this.fogColorRed * (1.0f - f14) + this.fogColorRed * 0.7f * f14;
            this.fogColorGreen = this.fogColorGreen * (1.0f - f14) + this.fogColorGreen * 0.6f * f14;
            this.fogColorBlue = this.fogColorBlue * (1.0f - f14) + this.fogColorBlue * 0.6f * f14;
        }
        if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).isPotionActive(Potion.nightVision)) {
            float f15 = this.getNightVisionBrightness((EntityLivingBase)entity, partialTicks);
            float f6 = 1.0f / this.fogColorRed;
            if (f6 > 1.0f / this.fogColorGreen) {
                f6 = 1.0f / this.fogColorGreen;
            }
            if (f6 > 1.0f / this.fogColorBlue) {
                f6 = 1.0f / this.fogColorBlue;
            }
            this.fogColorRed = this.fogColorRed * (1.0f - f15) + this.fogColorRed * f6 * f15;
            this.fogColorGreen = this.fogColorGreen * (1.0f - f15) + this.fogColorGreen * f6 * f15;
            this.fogColorBlue = this.fogColorBlue * (1.0f - f15) + this.fogColorBlue * f6 * f15;
        }
        if (this.mc.gameSettings.anaglyph) {
            float f16 = (this.fogColorRed * 30.0f + this.fogColorGreen * 59.0f + this.fogColorBlue * 11.0f) / 100.0f;
            float f17 = (this.fogColorRed * 30.0f + this.fogColorGreen * 70.0f) / 100.0f;
            float f7 = (this.fogColorRed * 30.0f + this.fogColorBlue * 70.0f) / 100.0f;
            this.fogColorRed = f16;
            this.fogColorGreen = f17;
            this.fogColorBlue = f7;
        }
        EntityViewRenderEvent.FogColors event = new EntityViewRenderEvent.FogColors((EntityRenderer)this, entity, block, (double)partialTicks, this.fogColorRed, this.fogColorGreen, this.fogColorBlue);
        MinecraftForge.EVENT_BUS.post((Event)event);
        this.fogColorRed = event.red;
        this.fogColorGreen = event.green;
        this.fogColorBlue = event.blue;
        GlStateManager.clearColor((float)this.fogColorRed, (float)this.fogColorGreen, (float)this.fogColorBlue, (float)0.0f);
    }

    private void setupFog(int p_78468_1_, float partialTicks) {
        Entity entity = this.mc.getRenderViewEntity();
        boolean flag = false;
        if (entity instanceof EntityPlayer) {
            flag = ((EntityPlayer)entity).capabilities.isCreativeMode;
        }
        GL11.glFog((int)2918, (FloatBuffer)this.setFogColorBuffer(this.fogColorRed, this.fogColorGreen, this.fogColorBlue, 1.0f));
        GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Block block = ActiveRenderInfo.getBlockAtEntityViewpoint((World)this.mc.theWorld, (Entity)entity, (float)partialTicks);
        float hook = ForgeHooksClient.getFogDensity((EntityRenderer)this, (Entity)entity, (Block)block, (float)partialTicks, (float)0.1f);
        if (hook >= 0.0f) {
            GlStateManager.setFogDensity((float)hook);
        } else if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).isPotionActive(Potion.blindness)) {
            float f1 = 5.0f;
            int i = ((EntityLivingBase)entity).getActivePotionEffect(Potion.blindness).getDuration();
            if (i < 20) {
                f1 = 5.0f + (this.farPlaneDistance - 5.0f) * (1.0f - (float)i / 20.0f);
            }
            GlStateManager.setFog((int)9729);
            if (p_78468_1_ == -1) {
                GlStateManager.setFogStart((float)0.0f);
                GlStateManager.setFogEnd((float)(f1 * 0.8f));
            } else {
                GlStateManager.setFogStart((float)(f1 * 0.25f));
                GlStateManager.setFogEnd((float)f1);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi((int)34138, (int)34139);
            }
        } else if (this.cloudFog) {
            GlStateManager.setFog((int)2048);
            GlStateManager.setFogDensity((float)0.1f);
        } else if (block.getMaterial() == Material.water) {
            GlStateManager.setFog((int)2048);
            if (entity instanceof EntityLivingBase && ((EntityLivingBase)entity).isPotionActive(Potion.waterBreathing)) {
                GlStateManager.setFogDensity((float)0.01f);
            } else {
                GlStateManager.setFogDensity((float)(0.1f - (float)EnchantmentHelper.getRespiration((Entity)entity) * 0.03f));
            }
        } else if (block.getMaterial() == Material.lava) {
            GlStateManager.setFog((int)2048);
            GlStateManager.setFogDensity((float)2.0f);
        } else {
            float f = this.farPlaneDistance;
            GlStateManager.setFog((int)9729);
            if (p_78468_1_ == -1) {
                GlStateManager.setFogStart((float)0.0f);
                GlStateManager.setFogEnd((float)f);
            } else {
                GlStateManager.setFogStart((float)(f * 0.75f));
                GlStateManager.setFogEnd((float)f);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi((int)34138, (int)34139);
            }
            if (this.mc.theWorld.provider.doesXZShowFog((int)entity.posX, (int)entity.posZ)) {
                GlStateManager.setFogStart((float)(f * 0.05f));
                GlStateManager.setFogEnd((float)(Math.min(f, 192.0f) * 0.5f));
            }
            ForgeHooksClient.onFogRender((EntityRenderer)this, (Entity)entity, (Block)block, (float)partialTicks, (int)p_78468_1_, (float)f);
        }
        GlStateManager.enableColorMaterial();
        GlStateManager.enableFog();
        GlStateManager.colorMaterial((int)1028, (int)4608);
    }

    private FloatBuffer setFogColorBuffer(float red, float green, float blue, float alpha) {
        this.fogColorBuffer.clear();
        this.fogColorBuffer.put(red).put(green).put(blue).put(alpha);
        this.fogColorBuffer.flip();
        return this.fogColorBuffer;
    }

    public MapItemRenderer getMapItemRenderer() {
        return this.theMapItemRenderer;
    }

    static {
        shaderResourceLocations = new ResourceLocation[]{new ResourceLocation("shaders/post/notch.json"), new ResourceLocation("shaders/post/fxaa.json"), new ResourceLocation("shaders/post/art.json"), new ResourceLocation("shaders/post/bumpy.json"), new ResourceLocation("shaders/post/blobs2.json"), new ResourceLocation("shaders/post/pencil.json"), new ResourceLocation("shaders/post/color_convolve.json"), new ResourceLocation("shaders/post/deconverge.json"), new ResourceLocation("shaders/post/flip.json"), new ResourceLocation("shaders/post/invert.json"), new ResourceLocation("shaders/post/ntsc.json"), new ResourceLocation("shaders/post/outline.json"), new ResourceLocation("shaders/post/phosphor.json"), new ResourceLocation("shaders/post/scan_pincushion.json"), new ResourceLocation("shaders/post/sobel.json"), new ResourceLocation("shaders/post/bits.json"), new ResourceLocation("shaders/post/desaturate.json"), new ResourceLocation("shaders/post/green.json"), new ResourceLocation("shaders/post/blur.json"), new ResourceLocation("shaders/post/wobble.json"), new ResourceLocation("shaders/post/blobs.json"), new ResourceLocation("shaders/post/antialias.json"), new ResourceLocation("shaders/post/creeper.json"), new ResourceLocation("shaders/post/spider.json")};
        shaderCount = shaderResourceLocations.length;
    }
}
