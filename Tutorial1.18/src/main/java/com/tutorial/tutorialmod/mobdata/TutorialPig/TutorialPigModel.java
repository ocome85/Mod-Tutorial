package com.tutorial.tutorialmod.mobdata.TutorialPig;

import net.minecraft.client.model.PigModel;
import net.minecraft.client.model.QuadrupedModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class TutorialPigModel<T extends TutorialPig> extends QuadrupedModel<T> {
    public TutorialPigModel(ModelPart p_170799_) {
            super(p_170799_, false, 4.0F, 4.0F, 2.0F, 2.0F, 24);
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = QuadrupedModel.createBodyMesh(6, CubeDeformation.NONE);
            PartDefinition partdefinition = meshdefinition.getRoot();
            partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, CubeDeformation.NONE).texOffs(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(0.0F, 12.0F, -6.0F));
            return LayerDefinition.create(meshdefinition, 64, 32);
        }
}