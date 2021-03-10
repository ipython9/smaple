package com.maple.smaple;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("测试类")
//@SpringBootTest
public class SmapleApplicationTests {

    @DisplayName("测试方法")
    @Test
    public void contextLoads() {
        System.out.println(1);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_9)
    public void assertTest() {
        String result = "测试";
        assertEquals("试",result,"测试成功");

    }
    @DisplayName("参数化测试")
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }





//    @BeforeEach
//    public void beforeEach(){
//        System.out.println("每一个测试方法开始前都会执行");
//
//    }
//    @AfterEach
//    public void afterEach(){
//        System.out.println("每一个测试方法结束后都会执行");
//
//    }
//    @BeforeAll
//    public static void beforeAll(){
//        System.out.println("所有测试方法开始前才会执行");
//
//    }
//    @AfterAll
//    public static void afterAll(){
//        System.out.println("所有测试方法结束后才会执行");
//
//    }
}
