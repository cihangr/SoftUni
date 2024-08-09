package ReflectionAndAnnotation.Skeletons.barracksWars.models.units;

public class Pikeman extends ReflectionAndAnnotation.Skeletons.barracksWars.models.units.AbstractUnit {

	private static final int PIKEMAN_HEALTH = 30;
	private static final int PIKEMAN_DAMAGE = 15;

	public Pikeman() {
		super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
	}
}
