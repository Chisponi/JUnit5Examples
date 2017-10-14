package examples;

import org.junit.jupiter.api.*;

public class Test1_Junit5LifeCycle
{

    @BeforeAll
    public static void beforeAllTest()
    {
        System.out.println("\nExecuting Before all the Tests");
    }

    @BeforeEach
    public void beforeEachTests()
    {
        System.out.println("\nExecuting before each @Test Methods");
    }

    @Test
    public void exampleTest1()
    {
        System.out.println("Executing Example Test 1");
    }

    @Test
    public void exampleTest2()
    {
        System.out.println("Executing Example Test 2");
    }

    @AfterEach
    public void afterEachTests()
    {
        System.out.println("\nExecuting after each @Test Methods");
    }

    @AfterAll
    public static void afterAllTest()
    {
        System.out.println("\nExecuting After all the Tests");
    }
}
