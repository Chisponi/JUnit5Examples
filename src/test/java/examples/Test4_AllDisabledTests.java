/**
 * @Author Gladson Antony
 * @Date 16 - Oct - 2017
 * @Time 21:52
 */

package examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("To Demonstrate the Use of @Disabled at Class Level")
public class Test4_AllDisabledTests
{
    @Test
    public void disabledTest1()
    {
        System.out.println();
    }

    @Test
    public void disabledTest2()
    {
        System.out.println();
    }
}
