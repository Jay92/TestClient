// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, MovingObjectPosition, DamageSource, Entity, 
//            World, EntityLiving

public class EntityEnderPearl extends EntityThrowable
{

    public EntityEnderPearl(World world)
    {
        super(world);
    }

    public EntityEnderPearl(World world, EntityLiving entityliving)
    {
        super(world, entityliving);
    }

    public EntityEnderPearl(World world, double d, double d1, double d2)
    {
        super(world, d, d1, d2);
    }

    protected void onThrowableCollision(MovingObjectPosition movingobjectposition)
    {
        if(movingobjectposition.entityHit != null)
        {
            if(!movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, throwingEntity), 0));
        }
        for(int i = 0; i < 32; i++)
        {
            worldObj.spawnParticle("portal", posX, posY + rand.nextDouble() * 2D, posZ, rand.nextGaussian(), 0.0D, rand.nextGaussian());
        }

        if(!worldObj.multiplayerWorld)
        {
            if(throwingEntity != null)
            {
                throwingEntity.teleportToLocation(posX, posY, posZ);
                throwingEntity.fallDistance = 0.0F;
                throwingEntity.attackEntityFrom(DamageSource.fall, 5);
            }
            setEntityDead();
        }
    }
}
