package ReflectionAndAnnotation.Skeletons.barracksWars;

import ReflectionAndAnnotation.Skeletons.barracksWars.interfaces.Repository;
import ReflectionAndAnnotation.Skeletons.barracksWars.interfaces.Runnable;
import ReflectionAndAnnotation.Skeletons.barracksWars.interfaces.UnitFactory;
import ReflectionAndAnnotation.Skeletons.barracksWars.core.Engine;
import ReflectionAndAnnotation.Skeletons.barracksWars.core.factories.UnitFactoryImpl;
import ReflectionAndAnnotation.Skeletons.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }


}
