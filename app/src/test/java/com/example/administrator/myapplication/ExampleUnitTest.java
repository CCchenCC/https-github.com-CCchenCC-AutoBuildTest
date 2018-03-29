package com.example.administrator.myapplication;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasValue;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @BeforeClass
    public static void init(){
        System.out.println("------init()------");
    }
    @Before
    public void setUp(){
        System.out.println("------setUp()------");
    }
    @After
    public void tearDown(){
        System.out.println("------tearDown()");
    }
    @AfterClass
    public static void finish(){
        System.out.println("------finish()------");
    }
    @Test
    public void test1(){
        System.out.println("------test1()------");
    }
    @Test
    public void test2(){
        System.out.println("------test2()------");
    }
    @Test
    public void test3(){
        Map<String, String> map= new HashMap<String,String>();
        map.put("a","hello");
        map.put("b","world");
        map.put("c","haha");
        assertThat(map, hasEntry("a","hello"));
        assertThat(map, hasKey("a"));
        assertThat(map, hasValue("hello"));;
    }

}