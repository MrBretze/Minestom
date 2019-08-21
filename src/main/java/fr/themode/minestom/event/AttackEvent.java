package fr.themode.minestom.event;

import fr.themode.minestom.entity.Entity;

public class AttackEvent extends Event {

    private Entity target;

    public AttackEvent(Entity target) {
        this.target = target;
    }

    public Entity getTarget() {
        return target;
    }
}
