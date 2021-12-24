package com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;


public class TutorialCarModel extends ListModel<TutorialCar> {
    private final ModelPart wheel;
    private final ModelPart body;
    private final ImmutableList<ModelPart> parts;



    public TutorialCarModel(ModelPart root) {
        this.wheel = root.getChild("wheel");
        this.body = root.getChild("body");
        this.parts = ImmutableList.of(this.body,this.wheel);
    }

    public static LayerDefinition createBodyModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition wheel = partdefinition.addOrReplaceChild("wheel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition wheel4 = wheel.addOrReplaceChild("wheel4", CubeListBuilder.create().texOffs(0, 0).addBox(-43.0432F, -21.5656F, 39.0432F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(60, 0).addBox(-43.0432F, -23.4242F, 41.1846F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(69, 35).addBox(-43.0432F, -26.2828F, 43.326F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(26, 175).addBox(-40.9018F, -19.707F, 45.4674F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(64.74F, 0.0F, -64.74F));

        PartDefinition wheel3 = wheel.addOrReplaceChild("wheel3", CubeListBuilder.create().texOffs(30, 13).addBox(-43.0432F, -21.5656F, 29.2824F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 106).addBox(-43.0432F, -23.4242F, 31.4238F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(42, 140).addBox(-43.0432F, -26.2828F, 33.5652F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(0, 174).addBox(-40.9018F, -19.707F, 35.7066F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(64.74F, 0.0F, 4.98F));

        PartDefinition wheel2 = wheel.addOrReplaceChild("wheel2", CubeListBuilder.create().texOffs(0, 35).addBox(-33.9796F, -21.5656F, 39.0432F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(42, 106).addBox(-33.9796F, -23.4242F, 41.1846F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(199, 106).addBox(-33.9796F, -26.2828F, 43.326F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(67, 166).addBox(-36.121F, -19.707F, 45.4674F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -64.74F));

        PartDefinition wheel1 = wheel.addOrReplaceChild("wheel1", CubeListBuilder.create().texOffs(30, 48).addBox(-33.9796F, -21.5656F, 29.2824F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 140).addBox(-33.9796F, -23.4242F, 31.4238F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(199, 141).addBox(-33.9796F, -26.2828F, 33.5652F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(42, 83).addBox(-36.121F, -19.707F, 35.7066F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.98F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 106).addBox(-30.586F, -26.1312F, -25.6968F, 52.0F, 9.0F, 95.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-30.586F, -53.9911F, -31.6927F, 52.0F, 3.0F, 103.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(207, 69).addBox(-30.586F, -39.1312F, 68.5248F, 52.0F, 22.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(207, 34).addBox(-30.586F, -51.6968F, 62.1006F, 52.0F, 26.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(30, 0).addBox(-12.7172F, -26.1312F, 74.949F, 17.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition flont = body.addOrReplaceChild("flont", CubeListBuilder.create().texOffs(207, 0).addBox(-30.586F, -34.1312F, -42.828F, 52.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(0, 83).addBox(-12.7172F, -26.1312F, -47.1108F, 17.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition flont_r1 = flont.addOrReplaceChild("flont_r1", CubeListBuilder.create().texOffs(109, 245).addBox(-30.586F, -16.5656F, -53.9633F, 52.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(221, 245).addBox(-30.586F, -30.9156F, -53.9633F, 52.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(82, 70).addBox(16.414F, -30.5656F, -53.9633F, 5.0F, 22.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(76, 140).addBox(-30.026F, -30.5656F, -53.9633F, 5.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition light = flont.addOrReplaceChild("light", CubeListBuilder.create().texOffs(25, 106).addBox(-6.8586F, -26.1312F, -47.1108F, 9.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 70).addBox(31.6866F, -26.1312F, -47.1108F, 9.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-21.414F, -8.5656F, 0.0F));

        PartDefinition side = body.addOrReplaceChild("side", CubeListBuilder.create().texOffs(191, 107).addBox(17.414F, -52.1312F, -38.5452F, 4.0F, 35.0F, 103.0F, new CubeDeformation(0.0F))
                .texOffs(0, 210).addBox(-29.316F, -52.1312F, -38.5452F, 3.0F, 35.0F, 103.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }


    public ImmutableList<ModelPart> parts() {
        return this.parts;
    }
    /*
        public ModelPart waterPatch() {
            return this.waterPatch;
        }


    */
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wheel.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
	}



    public void setupAnim(TutorialCar p_102269_, float p_102270_, float p_102271_, float p_102272_, float p_102273_, float p_102274_) {
    }

}
