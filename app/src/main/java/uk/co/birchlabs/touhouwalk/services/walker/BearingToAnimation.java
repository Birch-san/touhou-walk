package uk.co.birchlabs.touhouwalk.services.walker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by birch on 01/01/2017.
 */

public class BearingToAnimation {
    private final List<Animation> animations;
    private final Map<Bearing, Animation> animationMap;

    public BearingToAnimation(List<Animation> animations) {
        this.animations = animations;
        animationMap = new HashMap<>();
        animationMap.put(Bearing.DOWN, animations.get(0));
        animationMap.put(Bearing.LEFT, animations.get(1));
        animationMap.put(Bearing.RIGHT, animations.get(2));
        animationMap.put(Bearing.UP, animations.get(3));
    }

    public Map<Bearing, Animation> getAnimationMap() {
        return animationMap;
    }
}
