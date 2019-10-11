package edu.cnm.deepdive;

/**
 * This class contains stubs of the {@link #hourHandDegrees(int, double)} and {@link
 * #minuteHandDegrees(double)} methods. Implementation of these methods is included in the practical
 * exam problems of the Deep Dive Coding Java + Android Bootcamp.
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
   * Computes and returns the angle made by the hour hand, measured in degrees
   * clockwise from straight up (12 o'clock on the clock face), in the interval
   * [0, 360).
   *
   * @param hours   hour component of time, in {0, 1, &hellip;, 23}.
   * @param minutes minute component of time, in [0&ndash;60).
   * @return        angle (in degrees) to which hour hand is oriented.
   */
  public static double hourHandDegrees(int hours, double minutes) {
    return 0; // TODO Replace this line with implementation.
  }

  /**
   * Computes and returns the angle made by the minute hand, measured in degrees
   * clockwise from straight up (12 o'clock on the clock face), in the interval
   * [0, 360).
   *
   * @param minutes minute component of time, in [0&ndash;60).
   * @return        angle (in degrees) to which minute hand is oriented.
   */
  public static double minuteHandDegrees(double minutes) {
    class ClockAngle {

      private static final double HOUR_ANGLE = 360.0 / 12;
      private static final double MINUTE_ANGLE = 360.0 / 60;
      private static final double HOUR_DELTA_ANGLE = HOUR_ANGLE / 60;
      private static final double MINUTE_DELTA_ANGLE = MINUTE_ANGLE / 60;

      private final int angle;
      private final int hourAngle;
      private final int minAngle;

      public ClockAngle(final int hour, final int min) {
        this(hour, min, 0);
      }

      public ClockAngle(final int hour, final int min, final int sec) {

        if (hour < 0 || hour > 23 || min < 0 || min > 59 || sec < 0 || sec > 59) {
          throw new IllegalArgumentException("Invalid hours, minutes or seconds value");
        }

        this.minAngle = (int) (min * MINUTE_ANGLE + MINUTE_DELTA_ANGLE * sec);
        this.hourAngle = (int) (hour % 12 * HOUR_ANGLE + HOUR_DELTA_ANGLE * min);

        int angle = hourAngle - minAngle;

        if (angle < 0) {
          angle = 360 + angle;
        }

        this.angle = angle;
      }

      public int getHourAngle() { return hourAngle; }
      public int getMinAngle() { return minAngle; }

      /** @return angle in degrees from the minute to the hour hand */
      public int getMinHourAngle() { return this.angle; }

      /** @return angle in degrees from the hour to the minute hand */
      public int getHourMinAngle() { return 360 - this.angle; }

      /** @return {@code true} if the minute hand is on top of the hour hand; otherwise {@code false} */
      public boolean isMinOverHour() { return this.angle == 0; }
    }
    return 0; // TODO Replace this line with implementation.
  }

}
