import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class TestMassive {

    private static MethodMassive methodMassive;

    @BeforeEach
    void init(){MethodMassive methodMassive = new MethodMassive();}


    @MethodSource("dataMethod1")
    @ParameterizedTest
    void method1(int[] m, Object result) {
        //проверка ожидаемого и результата
        MethodMassive methodMassive = new MethodMassive();
        Assertions.assertEquals(result,methodMassive.method1(m));

    }

    @MethodSource("dataMethod2")
    @ParameterizedTest
    void method2(int[] m, Object result) {
        //проверка ожидаемого и результата
        MethodMassive methodMassive = new MethodMassive();
        Assertions.assertEquals(result,methodMassive.method2(m));

    }

    public static Stream<Arguments> dataMethod1(){
        List<Arguments> list = new ArrayList<>();
        int[] m1 = {1,2,4,5,6,4,5,6,7};
        list.add(Arguments.arguments(m1,null));
        int[] m2 = {1,1,1,1,1};
        list.add(Arguments.arguments(m2,null));
        int[] m3 = {1,2,3,5,4};
        list.add(Arguments.arguments(m3,null));
        return list.stream();
    }


    public static Stream<Arguments> dataMethod2(){
        List<Arguments> list = new ArrayList<>();
        int[] m1 = {1,1,1,1,4,4,4,4,4};
        list.add(Arguments.arguments(m1,null));
        int[] m2 = {1,4,1,1,0};
        list.add(Arguments.arguments(m2,null));
        int[] m3 = {1,1,1,1,1};
        list.add(Arguments.arguments(m3,null));
        int[] m4 = {4,4,4,4,4};
        list.add(Arguments.arguments(m4,null));
        return list.stream();
    }
}
