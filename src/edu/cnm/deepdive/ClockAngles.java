package edu.cnm.deepdive;

/**
 * This class contains stubs of the {@link #hourHandDegrees(int, double)},
 * {@link #minuteHandDegrees(double)}, {@link #hourHandRadians(int, double)},
 * and {@link #minuteHandRadians(double)} methods. Implementation of these
 * methods is included in the practical exam problems of the Deep Dive Coding
 * Java + Android Bootcamp.
 *
 * @author Nicholas Bennett, Deep Dive Coding
 */
public class ClockAngles {

  private ClockAngles() {
    // NOTE: There is NO need to do anything with this constructor! The methods
    //       you will implement in this class are static; thus, there is no need
    //       to create instances of this class.
  }

  /**
   * Computes and returns the angle made by the hour hand, measured clockwise
   * from straight up (12 o'clock on the clock face).
   *
   * @param hours   hour component of time, from integer set
   *                {0, 1, &hellip;, 23}.
   * @param minutes minute component of time, from real interval [0&ndash;60).
   * @return        angle (in degrees) to which hour hand is oriented.
   */
  public static double hourHandDegrees(int hours, double minutes) {
    return 0; // TODO Replace this line with implementation.
  }

  /**
   * Computes and returns the angle made by the minute hand, measured clockwise
   * from straight up (12 o'clock on the clock face).
   *
   * @param minutes minute component of time, from real interval [0&ndash;60).
   * @return        angle (in degrees) to which minute hand is oriented.
   */
  public static double minuteHandDegrees(double minutes) {
    return 0; // TODO Replace this line with implementation.
  }

  /**
   * Computes and returns the angle made by the hour hand, measured
   * counter-clockwise from the positive X-axis (3 o'clock on the clock face).
   *
   * @param hours   hour component of time, from integer set
   *                {0, 1, &hellip;, 23}.
   * @param minutes minute component of time, from real interval [0&ndash;60).
   * @return        angle (in radians) to which hour hand is oriented.
   */
  public static double hourHandRadians(int hours, double minutes) {
    return 0; // TODO Replace this line with implementation.
  }

  /**
   * Computes and returns the angle made by the minute hand, measured
   * counter-clockwise from the positive X-axis (3 o'clock on the clock face).
   *
   * @param minutes minute component of time, from real interval [0&ndash;60).
   * @return        angle (in radians) to which minute hand is oriented.
   */
  public static double minuteHandRadians(double minutes) {
    return 0; // TODO Replace this line with implementation.
  }

}
