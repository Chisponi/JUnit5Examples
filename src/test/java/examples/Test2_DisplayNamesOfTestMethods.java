package examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("To Demonstrate the use of @DisplayName to display alternate/full name of Classes/Methods")
public class Test2_DisplayNamesOfTestMethods
{
    @DisplayName("Test 1")
    @Test
    public void test1()
    {
        System.out.println("To demonstrate the Use of @DisplayName  at Class/Method level");
    }

    @DisplayName("Test 2")
    @Test
    public void randomName()
    {
        System.out.println("To demonstrate the Use of @DisplayName  at Class/Method level");
    }
}
