package com.ethlo.time;

import java.time.OffsetDateTime;
import java.time.temporal.Temporal;

/** This class deals with the formats mentioned in W3C - NOTE-datetime: https://www.w3.org/TR/NOTE-datetime
 * 
 * <ul>
 * <li>Year:<br> 
 *     YYYY (eg 1997)
 * </li>
 * <li>
 *     Year and month:<br>
 *     YYYY-MM (eg 1997-07)</li>
 *  <li>
 *     Complete date:<br>
 *     YYYY-MM-DD (eg 1997-07-16)
 * </li>
 * <li>
 *     Complete date plus hours and minutes:<br>
 *     YYYY-MM-DDThh:mmTZD (eg 1997-07-16T19:20+01:00)
 * </li>
 * <li>
 *     Complete date plus hours, minutes and seconds:<br>
 *     YYYY-MM-DDThh:mm:ssTZD (eg 1997-07-16T19:20:30+01:00)
 * </li>
 * <li>
 *     Complete date plus hours, minutes, seconds and a decimal fraction of a second<br>
 *     YYYY-MM-DDThh:mm:ss.STZD (eg 1997-07-16T19:20:30.45+01:00)
 * </li>
 * </ul>   
 * <p>
 * where:
 *
 * <ul>
 *  <li>YYYY = four-digit year</li>
 *  <li>MM = two-digit month (01=January, etc.)</li>
 *  <li>DD   = two-digit day of month (01 through 31)</li>
 *  <li>hh   = two digits of hour (00 through 23) (am/pm NOT allowed)</li>
 *  <li>mm   = two digits of minute (00 through 59)</li>
 *  <li>ss   = two digits of second (00 through 59)</li>
 *  <li>S   = one or more digits representing a decimal fraction of a second</li>
 *  <li>TZD  = time zone designator (Z or +hh:mm or -hh:mm)</li>
 * </ul>
 * </p>
*/
public interface W3cDateTimeUtil
{

    /**
     * 
     * @param date
     * @param lastIncluded
     * @param fractionDigits
     * @return
     */
    String formatUtc(OffsetDateTime date, Field lastIncluded, int fractionDigits);

    /**
     * 
     * @param s
     * @param type
     * @return
     */
    <T extends Temporal> T parseLenient(String s, Class<T> type);

    /**
     * 
     * @param s
     * @return
     */
    Temporal parseLenient(String s);
}