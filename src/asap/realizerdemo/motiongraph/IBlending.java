package asap.realizerdemo.motiongraph;

import hmi.animation.SkeletonInterpolator;

/**
 * Interface for Blendings.
 * 
 * @author yannick-broeker
 */
public interface IBlending {
    
    /**
     * Returns the Blending of {@code frames} between the two Motions.
     * @param start first Motion
     * @param end second Motion
     * @param frames number of Frames to use
     * @return Blending of the two Motions 
     */
    SkeletonInterpolator blend(SkeletonInterpolator start, SkeletonInterpolator end, int frames);
}
