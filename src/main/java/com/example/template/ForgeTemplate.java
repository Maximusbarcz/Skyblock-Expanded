package com.example.template;

import cc.woverflow.wcore.utils.Updater;
import com.example.template.command.TemplateCommand;
import com.example.template.config.TemplateConfig;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = ForgeTemplate.ID, name = ForgeTemplate.NAME, version = ForgeTemplate.VER)
public class ForgeTemplate {
    public static final String NAME = "@NAME@", VER = "@VER@", ID = "@ID@";
    public static File modDir = new File(new File(Minecraft.getMinecraft().mcDataDir, "W-OVERFLOW"), NAME);
    public static TemplateConfig config;

    @Mod.EventHandler
    protected void onFMLPreInitialization(FMLPreInitializationEvent event) {
        if (!modDir.exists()) modDir.mkdirs();
        Updater.INSTANCE.addToUpdater(event.getSourceFile(), NAME, ID, VER, "W-OVERFLOW/" + ID);
    }

    @Mod.EventHandler
    protected void onInitialization(FMLInitializationEvent event) {
        new TemplateCommand().register();
        config = new TemplateConfig();
        config.preload();
    }
}
