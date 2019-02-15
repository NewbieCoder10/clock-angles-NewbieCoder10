## Value

* Basic implementation: 15 points
* Basic unit tests: 10 points
* Extra credit implementation: 5 points
* Extra credit unit tests: 5 points

## Basic task

In this task, you will complete the implementation of and test a method to compute the angles to which the hands of a clock will be oriented at a given time of day.

### Implementation

The `edu.cnm.deepdive.ClockAngles` class contains a number of methods which must be completed to compute the angles formed by the minute and hour hands of a clock at a specified time of day. The table below shows the signature, return types, and intended functionality of these methods; all of them use the `public` and `static` modifiers.

| Return type | Signature | Intended functionality |
|:-----------:|:---------:|:----------------------:|
| `double` | `hourHandDegrees(int hours, double minutes)` | Computes and returns the angle made by the hour hand, measured clockwise from vertical (12:00) |
| `double` | `minuteHandDegrees(double minutes)` | Computes and returns the angle made by the minute hand, measured clockwise from vertical (12:00) |
| `double` | `hourHandRadians(int hours, double minutes)` | Computes and returns the angle made by the hour hand, measured counter-clockwise from horizontal (3:00) |
| `double` | `minuteHandRadians(double minutes)` | Computes and returns the angle made by the minute hand, measured counter-clockwise from horizontal (3:00) |

### Assumptions

* The value of the `hours` parameter will always be in the range 0 to 23, inclusive. (Note that your code shouldn't care whether a 12-hour or 24-hour clock is being used.)

* The value of the `minutes` parameter will always be in the real-valued interval [0, 60)&mdash;that is a floating-point number ranging from 0 (inclusive) to 60 (exclusive).

* The angle of the minute hand doesn't depend at all on the hours; however, the angle of the hour hand depends on both the hours and the minutes, since the hour hand on the clock face advances even as the minutes advance.

* Since non-integral computations are almost always inexact, results need only be accurate to within 0.01&deg;, or (approximately) 0.00017 radians.

### Unit tests

For unit testing credit, use JUnit5 to verify your code with the following inputs and expected outputs:

| `hours` | `minutes` | `hourHandDegrees(hours, minutes)` | `minuteHandDegrees(minutes)` | `hourHandRadians(hours, minutes)` | `minuteHandRadians(minutes)` |
|:-------:|:---------:|:---------------------------------:|:----------------------------:|:---------------------------------:|:------------------------------:|
| `0` | `0` | `0` | `0` | `1.57079632679` | `1.57079632679` |
| `3` | `15` | `97.5` | `90` | `6.152285613280012` | `0` |
| `12` | `30` | `50` | `180` | `1.3089969389957474` | `4.71238898038469` |
| `19` | `42` | `231` | `252` | `3.822271061867582` | `3.4557519189487724` |
 
In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

## Extra credit

### Implementation

Implement relaxation &amp; normalization of the hour and minute values given by the corresponding parameters of all of the methods. For example, with normalization implemented, we need not assume that the `minutes` parameter will always be in the interval [0, 60); instead, we should allow a value of (for instance) 80, and treat that as 1:20 (1 hour, 20 minutes). Similarly, a value of -15 for `minutes` should be treated as -1 hour, 45 minutes, and should result in subtracting 1 from the `hours` parameter value.

For both `hours` and `minutes`, normalization should use the _floor_ method of rounding, when finding the normalized value. For example, -25 hours should not be treated as -1 day and -1 hour, but as -2 days (which can be ignored for clock angles) and 23 hours.

### Unit tests 

For unit testing credit on the extra credit portion of the problem, use JUnit5 to verify your code with the following inputs and expected outputs:

| `hours` | `minutes` | `hourHandDegrees(hours, minutes)` | `minuteHandDegrees(minutes)` | `hourHandRadians(hours, minutes)` | `minuteHandRadians(minutes)` |
|:-------:|:---------:|:---------------------------------:|:----------------------------:|:---------------------------------:|:------------------------------:|
| `36` | `0` | `0` | `0` | `1.57079632679` | `1.57079632679` |
| `2` | `75` | `97.5` | `90` | `6.152285613280012` | `0` |
| `13` | `-30` | `50` | `180` | `1.3089969389957474` | `4.71238898038469` |
| `-5` | `42` | `231` | `252` | `3.822271061867582` | `3.4557519189487724` |

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.
