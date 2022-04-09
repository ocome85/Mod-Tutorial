package com.tutorial.tutorialmod.mobdata.enemy.EnemyAttack;

import com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie.TutorialZombie;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.monster.Zombie;

public class BeamAttackGoal extends MeleeAttackGoal {
    private final TutorialZombie zombie;
    private int raiseArmTicks;

    public BeamAttackGoal(TutorialZombie p_26019_, double p_26020_, boolean p_26021_) {
        super(p_26019_, p_26020_, p_26021_);
        this.zombie = p_26019_;
    }

    public void start() {
        super.start();
        this.raiseArmTicks = 0;
    }

    public void stop() {
        super.stop();
        this.zombie.setAggressive(false);
    }

    public void tick() {
        super.tick();
        ++this.raiseArmTicks;
        if (this.raiseArmTicks >= 1 && this.getTicksUntilNextAttack() < this.getAttackInterval() / 20) {
            this.zombie.setAggressive(false);
        } else {
            this.zombie.setAggressive(false);
        }

    }



}