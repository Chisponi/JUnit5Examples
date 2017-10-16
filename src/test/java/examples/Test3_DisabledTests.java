/**
 * @Author Gladson Antony
 * @Date 16 - Oct - 2017
 * @Time 21:52
 */

package examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Test3_DisabledTests
{
    @Disabled
    @Test
    public void disabledTest1()
    {
        System.out.println();
    }

    @Disabled
    @Test
    public void disabledTest2()
    {
        System.out.println();
    }
}
