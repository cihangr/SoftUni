package ReflectionAndAnnotation.Skeletons.barracksWars.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface Repository {

	void addUnit(ReflectionAndAnnotation.Skeletons.barracksWars.interfaces.Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
