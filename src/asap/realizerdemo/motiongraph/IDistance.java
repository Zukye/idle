package asap.realizerdemo.motiongraph;

import hmi.animation.SkeletonInterpolator;

/**
 * Distance-Metric-Interface.
 *
 * @author yannick-broeker
 */
public interface IDistance {

    /**
     * Computes the distance between the {@code start} and {@code end}.
     *
     * @param start First Motion
     * @param end Second Motion
     * @return calculated distance
     */
    double distance(SkeletonInterpolator start, SkeletonInterpolator end);

    /**
     * Computes the distance between the last {@code frames} Frames of {@code start} and the first {@code frames} Frames
     * of {@code end}.
     *
     * @param start First Motion
     * @param end Second Motion
     * @param frames Number of Frames to use to compare the Motions
     * @return calculated distance
     */
    double distance(SkeletonInterpolator start, SkeletonInterpolator end, int frames);

}
