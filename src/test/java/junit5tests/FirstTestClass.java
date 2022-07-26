package junit5tests;

import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {

    @BeforeAll
    void beforeAll(){
        System.out.println("--This is the before All Method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println(" ++++  this is the Before Each method //init method");
    }
    @AfterAll
    void afterAll(){
        System.out.println("++++++++++++++++This is after All method");
    }
    @AfterEach
    void afterEach(){
        System.out.println("======This is the after each method /// TearDown");
    }

    @Test
    void firstMethod(){
        System.out.println("This the first test method");
    }
    @Test
    @DisplayName("US1234 - TC12 - this method is the second one")
    void secondMethod(){
        System.out.println("This is  second test method");
    }

}
