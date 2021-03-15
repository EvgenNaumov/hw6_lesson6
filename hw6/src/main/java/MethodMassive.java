import java.util.Arrays;

import static java.util.Arrays.*;

public class MethodMassive {

    public MethodMassive() {
    }

    public Object method1(int[] mass1) {
        boolean findValueFour = false;
        int[] fromMass = new int[mass1.length];
        int sizeMax=0;
        int j=mass1.length-1;
        for (int i = mass1.length-1; i >= 0; i--) {
            int b = mass1[i];
            if (b!=4){
                fromMass[j]=b;
                sizeMax++;
                j--;
                continue;
            }
            findValueFour = true;
            break;
        }
        if (!findValueFour){
            throw new RuntimeException("Не найдено число 4");
        }
        int[] resMass = new int[sizeMax];
        resMass = copyOfRange(fromMass,mass1.length-sizeMax,mass1.length);
        System.out.println(Arrays.toString(resMass));

        return null;
    }

    public Object method2(int[] mass1) {
        boolean findTwo  = false;
        boolean findFour = false;
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i]==1) {
                findTwo = true;
            }
            if (mass1[i]==4) {
                findFour = true;
            }
            if (mass1[i]!=1 && mass1[i]!=4){
                findTwo = false;
                findFour = false;
                break;
            }
        }
        if (!findTwo || !findFour) {
            throw new RuntimeException("массив содержит число не равное 1 или 4");
        } else {
            return null;
        }

    }


}
