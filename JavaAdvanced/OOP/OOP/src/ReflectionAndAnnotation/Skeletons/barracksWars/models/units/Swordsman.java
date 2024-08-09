package ReflectionAndAnnotation.Skeletons.barracksWars.models.units;

public class Swordsman extends ReflectionAndAnnotation.Skeletons.barracksWars.models.units.AbstractUnit {
    private static final int SWORDSMAN_HEALTH = 40;
    private static final int SWORDSMAN_DAMAGE = 13;

    public Swordsman() {
        super(SWORDSMAN_HEALTH, SWORDSMAN_DAMAGE);
    }
}
