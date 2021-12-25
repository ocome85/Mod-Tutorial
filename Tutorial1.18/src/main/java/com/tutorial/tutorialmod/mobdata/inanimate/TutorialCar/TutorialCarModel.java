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

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition wheel = partdefinition.addOrReplaceChild("wheel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition wheel4 = wheel.addOrReplaceChild("wheel4", CubeListBuilder.create().texOffs(0, 67).addBox(-38.7589F, -17.1917F, 32.0463F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(53, 155).addBox(-38.7589F, -19.0503F, 34.1877F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(238, 128).addBox(-38.7589F, -21.9089F, 36.3291F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(26, 172).addBox(-36.6175F, -15.3331F, 38.4705F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(64.74F, 0.0F, -64.74F));

        PartDefinition wheel3 = wheel.addOrReplaceChild("wheel3", CubeListBuilder.create().texOffs(199, 106).addBox(-38.7589F, -17.1917F, 22.2855F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(142, 210).addBox(-38.7589F, -19.0503F, 24.4269F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(238, 163).addBox(-38.7589F, -21.9089F, 26.5683F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(0, 172).addBox(-36.6175F, -15.3331F, 28.7097F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(64.74F, 0.0F, 4.98F));

        PartDefinition wheel2 = wheel.addOrReplaceChild("wheel2", CubeListBuilder.create().texOffs(199, 141).addBox(-29.6953F, -17.1917F, 32.0463F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(167, 228).addBox(-29.6953F, -19.0503F, 34.1877F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(129, 244).addBox(-29.6953F, -21.9089F, 36.3291F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(0, 106).addBox(-31.8367F, -15.3331F, 38.4705F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -64.74F));

        PartDefinition wheel1 = wheel.addOrReplaceChild("wheel1", CubeListBuilder.create().texOffs(90, 210).addBox(-29.6953F, -17.1917F, 22.2855F, 4.0F, 13.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 229).addBox(-29.6953F, -19.0503F, 24.4269F, 4.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(70, 245).addBox(-29.6953F, -21.9089F, 26.5683F, 4.0F, 22.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(40, 0).addBox(-31.8367F, -15.3331F, 28.7097F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.98F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 106).addBox(-26.3017F, -21.7573F, -32.6937F, 52.0F, 9.0F, 95.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-26.3017F, -49.6172F, -38.6896F, 52.0F, 3.0F, 103.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(207, 69).addBox(-26.3017F, -34.7573F, 61.5279F, 52.0F, 22.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(207, 34).addBox(-26.3017F, -47.3229F, 55.1037F, 52.0F, 26.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(39, 106).addBox(-8.4329F, -21.7573F, 67.9521F, 17.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition flont = body.addOrReplaceChild("flont", CubeListBuilder.create().texOffs(207, 0).addBox(-26.3017F, -29.7573F, -49.8249F, 52.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(39, 119).addBox(-8.4329F, -21.7573F, -54.1077F, 17.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition flont_r1 = flont.addOrReplaceChild("flont_r1", CubeListBuilder.create().texOffs(0, 210).addBox(-30.586F, -16.5656F, -53.9633F, 52.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 222).addBox(-30.586F, -30.9156F, -53.9633F, 52.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(16.414F, -30.5656F, -53.9633F, 5.0F, 22.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(77, 128).addBox(-30.026F, -30.5656F, -53.9633F, 5.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2843F, 4.3739F, -6.9969F, -0.5236F, 0.0F, 0.0F));

        PartDefinition light = flont.addOrReplaceChild("light", CubeListBuilder.create().texOffs(0, 124).addBox(-2.5743F, -21.7573F, -54.1077F, 9.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(40, 18).addBox(35.9709F, -21.7573F, -54.1077F, 9.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-21.414F, -8.5656F, 0.0F));

        PartDefinition side = body.addOrReplaceChild("side", CubeListBuilder.create().texOffs(55, 50).addBox(21.6983F, -47.7573F, -45.5421F, 4.0F, 35.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(42, 229).addBox(21.6983F, -47.7573F, 2.4579F, 4.0F, 35.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(72, 0).addBox(21.6983F, -47.7573F, 44.4579F, 4.0F, 35.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(21.6983F, -47.7573F, 12.4579F, 4.0F, 35.0F, 32.0F, new CubeDeformation(0.0F))
                .texOffs(0, 106).addBox(21.6983F, -47.7573F, -28.5421F, 4.0F, 35.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(193, 109).addBox(-26.3017F, -47.7573F, -45.5421F, 4.0F, 35.0F, 101.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

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
