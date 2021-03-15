import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MAIN {

//    private MethodMassive methodMassive;

    public static void main(String[] args) throws  RuntimeException{
        MethodMassive methodMassive = new MethodMassive();
        try{
            int[] mass1 = {1,2,7,3,5,6,5,5,1,0};
            methodMassive.method1(mass1);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        try{
            int[] mass2 = {1,1,4,1,1,0,1};
            methodMassive.method2(mass2);
        }catch (RuntimeException f){
            f.printStackTrace();
        }
    }


}
