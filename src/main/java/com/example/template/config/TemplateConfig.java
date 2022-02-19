package com.example.template.config;

import com.example.template.ForgeTemplate;
import gg.essential.vigilance.Vigilant;

import java.io.File;

public class TemplateConfig extends Vigilant {

    public TemplateConfig() {
        super(new File(ForgeTemplate.modDir, ForgeTemplate.ID + ".toml"), ForgeTemplate.NAME);
        initialize();
    }
}
