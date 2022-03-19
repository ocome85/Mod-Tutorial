package com.tutorial.tutorialmod.mobdata.inanimate.TutorialEntity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class TutorialEntityModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "testentity"), "main");
	private final ModelPart test1;
	private final ModelPart test2;
	private final ModelPart test3;
	private final ModelPart test4;
	private final ModelPart test5;
	private final ModelPart test6;
	private final ModelPart test7;
	private final ModelPart test8;
	private final ModelPart test9;
	private final ModelPart test10;
	private final ModelPart test11;
	private final ModelPart test12;
	private final ModelPart test13;
	private final ModelPart test14;
	private final ModelPart test15;
	private final ModelPart test16;
	private final ModelPart test17;
	private final ModelPart test18;
	private final ModelPart test19;
	private final ModelPart test20;
	private final ModelPart test21;
	private final ModelPart test22;
	private final ModelPart test23;
	private final ModelPart test24;
	private final ModelPart test25;
	private final ModelPart test26;
	private final ModelPart test27;
	private final ModelPart test28;
	private final ModelPart test29;
	private final ModelPart test30;
	private final ModelPart test31;
	private final ModelPart test32;
	private final ModelPart test33;
	private final ModelPart test34;
	private final ModelPart test35;
	private final ModelPart test36;
	private final ModelPart test37;
	private final ModelPart test38;
	private final ModelPart test39;
	private final ModelPart test40;
	private final ModelPart test41;
	private final ModelPart test42;
	private final ModelPart test43;
	private final ModelPart test44;
	private final ModelPart test45;
	private final ModelPart test46;
	private final ModelPart test47;
	private final ModelPart test48;
	private final ModelPart test49;
	private final ModelPart test50;

	public TutorialEntityModel(ModelPart root) {
		this.test1 = root.getChild("test1");
		this.test2 = root.getChild("test2");
		this.test3 = root.getChild("test3");
		this.test4 = root.getChild("test4");
		this.test5 = root.getChild("test5");
		this.test6 = root.getChild("test6");
		this.test7 = root.getChild("test7");
		this.test8 = root.getChild("test8");
		this.test9 = root.getChild("test9");
		this.test10 = root.getChild("test10");
		this.test11 = root.getChild("test11");
		this.test12 = root.getChild("test12");
		this.test13 = root.getChild("test13");
		this.test14 = root.getChild("test14");
		this.test15 = root.getChild("test15");
		this.test16 = root.getChild("test16");
		this.test17 = root.getChild("test17");
		this.test18 = root.getChild("test18");
		this.test19 = root.getChild("test19");
		this.test20 = root.getChild("test20");
		this.test21 = root.getChild("test21");
		this.test22 = root.getChild("test22");
		this.test23 = root.getChild("test23");
		this.test24 = root.getChild("test24");
		this.test25 = root.getChild("test25");
		this.test26 = root.getChild("test26");
		this.test27 = root.getChild("test27");
		this.test28 = root.getChild("test28");
		this.test29 = root.getChild("test29");
		this.test30 = root.getChild("test30");
		this.test31 = root.getChild("test31");
		this.test32 = root.getChild("test32");
		this.test33 = root.getChild("test33");
		this.test34 = root.getChild("test34");
		this.test35 = root.getChild("test35");
		this.test36 = root.getChild("test36");
		this.test37 = root.getChild("test37");
		this.test38 = root.getChild("test38");
		this.test39 = root.getChild("test39");
		this.test40 = root.getChild("test40");
		this.test41 = root.getChild("test41");
		this.test42 = root.getChild("test42");
		this.test43 = root.getChild("test43");
		this.test44 = root.getChild("test44");
		this.test45 = root.getChild("test45");
		this.test46 = root.getChild("test46");
		this.test47 = root.getChild("test47");
		this.test48 = root.getChild("test48");
		this.test49 = root.getChild("test49");
		this.test50 = root.getChild("test50");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition test1 = partdefinition.addOrReplaceChild("test1", CubeListBuilder.create().texOffs(84, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(202.5221F, 22.5F, -166.6434F));

		PartDefinition cube_r1 = test1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(224, 95).addBox(300.0972F, -1.5F, 9.1321F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-225.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test2 = partdefinition.addOrReplaceChild("test2", CubeListBuilder.create().texOffs(140, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(152.5221F, 22.5F, -166.6434F));

		PartDefinition cube_r2 = test2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(224, 108).addBox(264.7419F, -1.5F, -26.2233F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-175.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test3 = partdefinition.addOrReplaceChild("test3", CubeListBuilder.create().texOffs(168, 0).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(102.5221F, 22.5F, -166.6434F));

		PartDefinition cube_r3 = test3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(224, 121).addBox(229.3865F, -1.5F, -61.5786F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-125.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test4 = partdefinition.addOrReplaceChild("test4", CubeListBuilder.create().texOffs(168, 25).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(52.5221F, 22.5F, -166.6434F));

		PartDefinition cube_r4 = test4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(224, 134).addBox(194.0312F, -1.5F, -96.9339F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-75.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test5 = partdefinition.addOrReplaceChild("test5", CubeListBuilder.create().texOffs(168, 50).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5221F, 22.5F, -166.6434F));

		PartDefinition cube_r5 = test5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(224, 154).addBox(158.6758F, -1.5F, -132.2893F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test6 = partdefinition.addOrReplaceChild("test6", CubeListBuilder.create().texOffs(168, 75).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-47.4779F, 22.5F, -166.6434F));

		PartDefinition cube_r6 = test6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 226).addBox(123.3205F, -1.5F, -167.6446F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test7 = partdefinition.addOrReplaceChild("test7", CubeListBuilder.create().texOffs(168, 100).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-97.4779F, 22.5F, -166.6434F));

		PartDefinition cube_r7 = test7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 231).addBox(87.9652F, -1.5F, -202.9999F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(75.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test8 = partdefinition.addOrReplaceChild("test8", CubeListBuilder.create().texOffs(168, 125).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-147.4779F, 22.5F, -166.6434F));

		PartDefinition cube_r8 = test8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(65, 231).addBox(52.6098F, -1.5F, -238.3553F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(125.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test9 = partdefinition.addOrReplaceChild("test9", CubeListBuilder.create().texOffs(168, 150).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-197.4779F, 22.5F, -166.6434F));

		PartDefinition cube_r9 = test9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(102, 231).addBox(17.2545F, -1.5F, -273.7106F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(175.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test10 = partdefinition.addOrReplaceChild("test10", CubeListBuilder.create().texOffs(0, 175).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-247.4779F, 22.5F, -166.6434F));

		PartDefinition cube_r10 = test10.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(139, 231).addBox(-18.1009F, -1.5F, -309.066F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(225.0F, 0.0F, 200.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test11 = partdefinition.addOrReplaceChild("test11", CubeListBuilder.create().texOffs(84, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(202.5221F, 22.5F, -66.6434F));

		PartDefinition cube_r11 = test11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(224, 95).addBox(229.3865F, -1.5F, 79.8428F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-225.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test12 = partdefinition.addOrReplaceChild("test12", CubeListBuilder.create().texOffs(140, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(152.5221F, 22.5F, -66.6434F));

		PartDefinition cube_r12 = test12.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(224, 108).addBox(194.0312F, -1.5F, 44.4874F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-175.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test13 = partdefinition.addOrReplaceChild("test13", CubeListBuilder.create().texOffs(168, 0).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(102.5221F, 22.5F, -66.6434F));

		PartDefinition cube_r13 = test13.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(224, 121).addBox(158.6758F, -1.5F, 9.1321F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-125.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test14 = partdefinition.addOrReplaceChild("test14", CubeListBuilder.create().texOffs(168, 25).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(52.5221F, 22.5F, -66.6434F));

		PartDefinition cube_r14 = test14.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(224, 134).addBox(123.3205F, -1.5F, -26.2233F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-75.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test15 = partdefinition.addOrReplaceChild("test15", CubeListBuilder.create().texOffs(168, 50).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5221F, 22.5F, -66.6434F));

		PartDefinition cube_r15 = test15.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(224, 154).addBox(87.9652F, -1.5F, -61.5786F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test16 = partdefinition.addOrReplaceChild("test16", CubeListBuilder.create().texOffs(168, 75).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-47.4779F, 22.5F, -66.6434F));

		PartDefinition cube_r16 = test16.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 226).addBox(52.6098F, -1.5F, -96.9339F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test17 = partdefinition.addOrReplaceChild("test17", CubeListBuilder.create().texOffs(168, 100).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-97.4779F, 22.5F, -66.6434F));

		PartDefinition cube_r17 = test17.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 231).addBox(17.2545F, -1.5F, -132.2893F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(75.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test18 = partdefinition.addOrReplaceChild("test18", CubeListBuilder.create().texOffs(168, 125).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-147.4779F, 22.5F, -66.6434F));

		PartDefinition cube_r18 = test18.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 231).addBox(-18.1009F, -1.5F, -167.6446F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(125.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test19 = partdefinition.addOrReplaceChild("test19", CubeListBuilder.create().texOffs(168, 150).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-197.4779F, 22.5F, -66.6434F));

		PartDefinition cube_r19 = test19.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(102, 231).addBox(-53.4562F, -1.5F, -202.9999F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(175.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test20 = partdefinition.addOrReplaceChild("test20", CubeListBuilder.create().texOffs(0, 175).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-247.4779F, 22.5F, -66.6434F));

		PartDefinition cube_r20 = test20.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(139, 231).addBox(-88.8115F, -1.5F, -238.3553F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(225.0F, 0.0F, 100.6F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test21 = partdefinition.addOrReplaceChild("test21", CubeListBuilder.create().texOffs(84, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(202.5221F, 22.5F, 34.3566F));

		PartDefinition cube_r21 = test21.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(224, 95).addBox(157.9687F, -1.5F, 151.2605F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-225.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test22 = partdefinition.addOrReplaceChild("test22", CubeListBuilder.create().texOffs(140, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(152.5221F, 22.5F, 34.3566F));

		PartDefinition cube_r22 = test22.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(224, 108).addBox(122.6134F, -1.5F, 115.9052F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-175.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test23 = partdefinition.addOrReplaceChild("test23", CubeListBuilder.create().texOffs(168, 0).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(102.5221F, 22.5F, 34.3566F));

		PartDefinition cube_r23 = test23.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(224, 121).addBox(87.258F, -1.5F, 80.5499F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-125.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test24 = partdefinition.addOrReplaceChild("test24", CubeListBuilder.create().texOffs(168, 25).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(52.5221F, 22.5F, 34.3566F));

		PartDefinition cube_r24 = test24.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(224, 134).addBox(51.9027F, -1.5F, 45.1945F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-75.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test25 = partdefinition.addOrReplaceChild("test25", CubeListBuilder.create().texOffs(168, 50).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5221F, 22.5F, 34.3566F));

		PartDefinition cube_r25 = test25.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(224, 154).addBox(16.5474F, -1.5F, 9.8392F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test26 = partdefinition.addOrReplaceChild("test26", CubeListBuilder.create().texOffs(168, 75).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-47.4779F, 22.5F, 34.3566F));

		PartDefinition cube_r26 = test26.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 226).addBox(-18.808F, -1.5F, -25.5161F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test27 = partdefinition.addOrReplaceChild("test27", CubeListBuilder.create().texOffs(168, 100).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-97.4779F, 22.5F, 34.3566F));

		PartDefinition cube_r27 = test27.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 231).addBox(-54.1633F, -1.5F, -60.8715F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(75.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test28 = partdefinition.addOrReplaceChild("test28", CubeListBuilder.create().texOffs(168, 125).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-147.4779F, 22.5F, 34.3566F));

		PartDefinition cube_r28 = test28.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(65, 231).addBox(-89.5186F, -1.5F, -96.2268F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(125.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test29 = partdefinition.addOrReplaceChild("test29", CubeListBuilder.create().texOffs(168, 150).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-197.4779F, 22.5F, 34.3566F));

		PartDefinition cube_r29 = test29.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(102, 231).addBox(-124.874F, -1.5F, -131.5822F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(175.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test30 = partdefinition.addOrReplaceChild("test30", CubeListBuilder.create().texOffs(0, 175).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-247.4779F, 22.5F, 34.3566F));

		PartDefinition cube_r30 = test30.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(139, 231).addBox(-160.2293F, -1.5F, -166.9375F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(225.0F, 0.0F, -0.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test31 = partdefinition.addOrReplaceChild("test31", CubeListBuilder.create().texOffs(84, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(202.5221F, 22.5F, 134.3566F));

		PartDefinition cube_r31 = test31.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(224, 95).addBox(87.258F, -1.5F, 221.9712F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-225.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test32 = partdefinition.addOrReplaceChild("test32", CubeListBuilder.create().texOffs(140, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(152.5221F, 22.5F, 134.3566F));

		PartDefinition cube_r32 = test32.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(224, 108).addBox(51.9027F, -1.5F, 186.6159F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-175.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test33 = partdefinition.addOrReplaceChild("test33", CubeListBuilder.create().texOffs(168, 0).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(102.5221F, 22.5F, 134.3566F));

		PartDefinition cube_r33 = test33.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(224, 121).addBox(16.5474F, -1.5F, 151.2605F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-125.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test34 = partdefinition.addOrReplaceChild("test34", CubeListBuilder.create().texOffs(168, 25).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(52.5221F, 22.5F, 134.3566F));

		PartDefinition cube_r34 = test34.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(224, 134).addBox(-18.808F, -1.5F, 115.9052F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-75.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test35 = partdefinition.addOrReplaceChild("test35", CubeListBuilder.create().texOffs(168, 50).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5221F, 22.5F, 134.3566F));

		PartDefinition cube_r35 = test35.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(224, 154).addBox(-54.1633F, -1.5F, 80.5499F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test36 = partdefinition.addOrReplaceChild("test36", CubeListBuilder.create().texOffs(168, 75).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-47.4779F, 22.5F, 134.3566F));

		PartDefinition cube_r36 = test36.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 226).addBox(-89.5186F, -1.5F, 45.1945F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test37 = partdefinition.addOrReplaceChild("test37", CubeListBuilder.create().texOffs(168, 100).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-97.4779F, 22.5F, 134.3566F));

		PartDefinition cube_r37 = test37.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(28, 231).addBox(-124.874F, -1.5F, 9.8392F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(75.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test38 = partdefinition.addOrReplaceChild("test38", CubeListBuilder.create().texOffs(168, 125).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-147.4779F, 22.5F, 134.3566F));

		PartDefinition cube_r38 = test38.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(65, 231).addBox(-160.2293F, -1.5F, -25.5161F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(125.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test39 = partdefinition.addOrReplaceChild("test39", CubeListBuilder.create().texOffs(168, 150).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-197.4779F, 22.5F, 134.3566F));

		PartDefinition cube_r39 = test39.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(102, 231).addBox(-195.5847F, -1.5F, -60.8715F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(175.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test40 = partdefinition.addOrReplaceChild("test40", CubeListBuilder.create().texOffs(0, 175).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-247.4779F, 22.5F, 134.3566F));

		PartDefinition cube_r40 = test40.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(139, 231).addBox(-230.94F, -1.5F, -96.2268F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(225.0F, 0.0F, -100.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test41 = partdefinition.addOrReplaceChild("test41", CubeListBuilder.create().texOffs(84, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(202.5221F, 22.5F, 234.3566F));

		PartDefinition cube_r41 = test41.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(224, 95).addBox(16.5474F, -1.5F, 292.6819F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-225.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test42 = partdefinition.addOrReplaceChild("test42", CubeListBuilder.create().texOffs(140, 154).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(152.5221F, 22.5F, 234.3566F));

		PartDefinition cube_r42 = test42.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(224, 108).addBox(-18.808F, -1.5F, 257.3266F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-175.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test43 = partdefinition.addOrReplaceChild("test43", CubeListBuilder.create().texOffs(168, 0).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(102.5221F, 22.5F, 234.3566F));

		PartDefinition cube_r43 = test43.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(224, 121).addBox(-54.1633F, -1.5F, 221.9712F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-125.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test44 = partdefinition.addOrReplaceChild("test44", CubeListBuilder.create().texOffs(168, 25).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(52.5221F, 22.5F, 234.3566F));

		PartDefinition cube_r44 = test44.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(224, 134).addBox(-89.5186F, -1.5F, 186.6159F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-75.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test45 = partdefinition.addOrReplaceChild("test45", CubeListBuilder.create().texOffs(168, 50).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5221F, 22.5F, 234.3566F));

		PartDefinition cube_r45 = test45.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(224, 154).addBox(-124.874F, -1.5F, 151.2605F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test46 = partdefinition.addOrReplaceChild("test46", CubeListBuilder.create().texOffs(168, 75).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-47.4779F, 22.5F, 234.3566F));

		PartDefinition cube_r46 = test46.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 226).addBox(-160.2293F, -1.5F, 115.9052F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test47 = partdefinition.addOrReplaceChild("test47", CubeListBuilder.create().texOffs(168, 100).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-97.4779F, 22.5F, 234.3566F));

		PartDefinition cube_r47 = test47.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(28, 231).addBox(-195.5847F, -1.5F, 80.5499F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(75.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test48 = partdefinition.addOrReplaceChild("test48", CubeListBuilder.create().texOffs(168, 125).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-147.4779F, 22.5F, 234.3566F));

		PartDefinition cube_r48 = test48.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(65, 231).addBox(-230.94F, -1.5F, 45.1945F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(125.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test49 = partdefinition.addOrReplaceChild("test49", CubeListBuilder.create().texOffs(168, 150).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-197.4779F, 22.5F, 234.3566F));

		PartDefinition cube_r49 = test49.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(102, 231).addBox(-266.2953F, -1.5F, 9.8392F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(175.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		PartDefinition test50 = partdefinition.addOrReplaceChild("test50", CubeListBuilder.create().texOffs(0, 175).addBox(-1.5221F, -1.5F, -5.3566F, 3.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(-247.4779F, 22.5F, 234.3566F));

		PartDefinition cube_r50 = test50.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(139, 231).addBox(-301.6507F, -1.5F, -25.5161F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(225.0F, 0.0F, -200.4F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}
	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float f2 = ageInTicks * (float) Math.PI * 1F;
		float f = ageInTicks * (float) Math.PI * -0.1F;
		float ff = ageInTicks * (float) Math.PI * -0.01F;
		//x ...左右 の振れ sin(f) cos(f) f... 速度  *s ... 幅の大きさ
		this.test1.x =250F+ Mth.sin(f)* 3F;
		this.test1.z =this.test2.z=this.test3.z=this.test4.z=-200F;
		this.test2.x =200F+ Mth.sin(ff)* 3F; // 速度落とす
		this.test3.x = 150F;
		this.test3.y = Mth.cos(f)* 3F;
		this.test4.x =100F; //速度落とす 振れ幅大きく(10倍に)
		this.test4.y =Mth.cos(ff)* 30F;
		this.test5.x =50F;
		this.test5.z =-200F+ Mth.sin(f)*3F;
		this.test6.x =0F;
		this.test6.z =-200F+ Mth.sin(f2)*30F; //速度あげる　振れ幅大きく
		this.test7.x =-50F+ Mth.sin(f)*3F; //回転 sin
		this.test7.z =-200F+Mth.sin(f)*3F;
		this.test8.x =-100F+ Mth.cos(f)*9F; //回転 cos
		this.test8.z =-200F+Mth.cos(f)*9F;
		this.test9.x =-150F+ Mth.sin(f)*30F; //回転　sin cos
		this.test9.z =-200F+Mth.cos(f)*30F;
		this.test10.x =-200F+ Mth.cos(f)*30F;
		this.test10.y =Mth.sin(f)*9F;
		this.test10.z =-200F+Mth.sin(f)*30F;

		this.test11.x =250F;
		this.test11.z =this.test12.z=this.test13.z=this.test14.z=this.test15.z =this.test16.z=this.test17.z=this.test18.z=this.test19.z =this.test20.z=-100F;
		this.test12.x =200F; // 速度落とす
		this.test13.x = 150F;
		this.test14.x =100F; //速度落とす 振れ幅大きく(10倍に)
		this.test15.x =50F;
		this.test16.x =0F;
		this.test17.x =-50F; //回転 sin
		this.test18.x =-100F; //回転 cos
		this.test19.x =-150F; //回転　sin cos
		this.test20.x =-200F;

		this.test11.xRot =Mth.sin(f);
		this.test12.xRot = 200+Mth.sin(f); // 中心位置を変える
		this.test13.xRot = Mth.cos(f);
		this.test14.xRot =200+Mth.cos(0); //中心を変える
		this.test15.yRot = Mth.sin(f);
		this.test16.yRot = Mth.sin(ff)*2F; //速度下げる　振れ幅大きく
		this.test17.zRot =Mth.sin(f); //sin
		this.test18.xRot = f;
		this.test19.yRot =f*3;
		this.test20.zRot =f;

		this.test21.x =250F;
		this.test21.z =this.test22.z=this.test23.z=this.test24.z=this.test25.z =this.test26.z=this.test27.z=this.test28.z=this.test29.z =this.test30.z=0F;
		this.test22.x =200F;
		this.test23.x =150F;
		this.test24.x =100F;
		this.test25.x =50F;
		this.test26.x =0F;
		this.test27.x =-50F;
		this.test28.x =-100F;
		this.test29.x =-150F;
		this.test30.x =-200F;

		this.test21.xRot =Mth.lerp(f,1F,3F);
		this.test22.yRot =Mth.lerp(f,1F,3F);
		this.test23.zRot =Mth.lerp(f,1F,3F);
		this.test24.xRot =200+Mth.lerp(f,1F,3F);
		this.test25.xRot = Mth.rotLerp(f,1F,3F);
		this.test26.xRot = Mth.inverseLerp(f,1F,5F); //速度下げる　振れ幅大きく
		this.test27.xRot = Mth.inverseLerp(f,1F,3F);
		this.test28.xRot =  Mth.lerp(f,1F,30F);
		this.test28.yRot =  Mth.lerp(f,1F,3F);
		this.test29.xRot =  Mth.lerp(f,1F,3F);
		this.test29.yRot =  Mth.lerp(f,1F,3F);
		this.test29.zRot =Mth.lerp(f,1F,3F);
		this.test30.xRot =Mth.lerp(f,1F,1.01F);

		this.test31.x =250F;
		this.test31.z =this.test32.z=this.test33.z=this.test34.z=this.test35.z =this.test36.z=this.test37.z=this.test38.z=this.test39.z =this.test40.z=100F;
		this.test32.x =200F;
		this.test33.x = 150F;
		this.test34.x =100F;
		this.test35.x =50F;
		this.test36.x =0F;
		this.test37.x =-50F;
		this.test38.x =-100F;
		this.test39.x =-150F;
		this.test40.x =-200F;

		this.test41.z= this.test42.z=this.test43.z=this.test44.z=this.test45.z =this.test46.z=this.test47.z=this.test48.z=this.test49.z =this.test50.z=200F;
		this.test41.x =250F;

		//四角
		float diameter = 50F;// *speed value
		float speed = 5F;
		switch (Mth.floor(ageInTicks/diameter)%4){
			case 0:
				this.test41.x +=ageInTicks%diameter*speed;
				break;
			case  1:
				this.test41.x += diameter*speed;
				this.test41.z += ageInTicks%diameter*speed;
				break;
			case 2:
				this.test41.x +=diameter*speed;
				this.test41.x -= ageInTicks%diameter*speed;
				this.test41.z +=diameter*speed;
				break;
			case  3:
				this.test41.z +=diameter*speed;
				this.test41.z -= ageInTicks%diameter*speed;
				break;

		}
		//ブレイズの周り
		for(int k = 8; k < 12; ++k) {
			this.test42.y = 11.0F + Mth.cos(((float)k * 1.5F + ageInTicks) * 0.5F);
			this.test42.x = 200+Mth.cos(f) * 15.0F;
			this.test42.z = 200+Mth.sin(f) * 15.0F;
			++f;
		}

		this.test43.x = 150F;
		this.test44.x =100F;
		this.test45.x =50F;
		this.test46.x =0F;
		this.test47.x =-50F;
		this.test48.x =-100F;
		this.test49.x =-150F;
		this.test50.x =-200F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		test1.render(poseStack, buffer, packedLight, packedOverlay);
		test2.render(poseStack, buffer, packedLight, packedOverlay);
		test3.render(poseStack, buffer, packedLight, packedOverlay);
		test4.render(poseStack, buffer, packedLight, packedOverlay);
		test5.render(poseStack, buffer, packedLight, packedOverlay);
		test6.render(poseStack, buffer, packedLight, packedOverlay);
		test7.render(poseStack, buffer, packedLight, packedOverlay);
		test8.render(poseStack, buffer, packedLight, packedOverlay);
		test9.render(poseStack, buffer, packedLight, packedOverlay);
		test10.render(poseStack, buffer, packedLight, packedOverlay);
		test11.render(poseStack, buffer, packedLight, packedOverlay);
		test12.render(poseStack, buffer, packedLight, packedOverlay);
		test13.render(poseStack, buffer, packedLight, packedOverlay);
		test14.render(poseStack, buffer, packedLight, packedOverlay);
		test15.render(poseStack, buffer, packedLight, packedOverlay);
		test16.render(poseStack, buffer, packedLight, packedOverlay);
		test17.render(poseStack, buffer, packedLight, packedOverlay);
		test18.render(poseStack, buffer, packedLight, packedOverlay);
		test19.render(poseStack, buffer, packedLight, packedOverlay);
		test20.render(poseStack, buffer, packedLight, packedOverlay);
		test21.render(poseStack, buffer, packedLight, packedOverlay);
		test22.render(poseStack, buffer, packedLight, packedOverlay);
		test23.render(poseStack, buffer, packedLight, packedOverlay);
		test24.render(poseStack, buffer, packedLight, packedOverlay);
		test25.render(poseStack, buffer, packedLight, packedOverlay);
		test26.render(poseStack, buffer, packedLight, packedOverlay);
		test27.render(poseStack, buffer, packedLight, packedOverlay);
		test28.render(poseStack, buffer, packedLight, packedOverlay);
		test29.render(poseStack, buffer, packedLight, packedOverlay);
		test30.render(poseStack, buffer, packedLight, packedOverlay);
		test31.render(poseStack, buffer, packedLight, packedOverlay);
		test32.render(poseStack, buffer, packedLight, packedOverlay);
		test33.render(poseStack, buffer, packedLight, packedOverlay);
		test34.render(poseStack, buffer, packedLight, packedOverlay);
		test35.render(poseStack, buffer, packedLight, packedOverlay);
		test36.render(poseStack, buffer, packedLight, packedOverlay);
		test37.render(poseStack, buffer, packedLight, packedOverlay);
		test38.render(poseStack, buffer, packedLight, packedOverlay);
		test39.render(poseStack, buffer, packedLight, packedOverlay);
		test40.render(poseStack, buffer, packedLight, packedOverlay);
		test41.render(poseStack, buffer, packedLight, packedOverlay);
		test42.render(poseStack, buffer, packedLight, packedOverlay);
		test43.render(poseStack, buffer, packedLight, packedOverlay);
		test44.render(poseStack, buffer, packedLight, packedOverlay);
		test45.render(poseStack, buffer, packedLight, packedOverlay);
		test46.render(poseStack, buffer, packedLight, packedOverlay);
		test47.render(poseStack, buffer, packedLight, packedOverlay);
		test48.render(poseStack, buffer, packedLight, packedOverlay);
		test49.render(poseStack, buffer, packedLight, packedOverlay);
		test50.render(poseStack, buffer, packedLight, packedOverlay);
	}

}