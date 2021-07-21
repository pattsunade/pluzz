import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest {
    // public void arreglo() {
    //     ArrayList<Integer> array = new ArrayList<>();
    //     int[] x = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
    //     int contador = 0;
    //     for (int i = 0; i < x.length; i++) {
    //         contador += x[i];
    //         if (x[i] > 10) {
    //             array.add(x[i]);

    //         }
    //     }
    //     System.out.println(contador);
    //     System.out.println(array);

    // }
    // public void name(String[] arr) {
    //     ArrayList<String> names = new ArrayList<>();
    //     ArrayList<String> nombres = new ArrayList<>();

    //     for (int i = 0; i < arr.length; i++) {
    //         names.add(arr[i]);
    //     }

    //     Collections.shuffle(names);
    //     System.out.println(names);

    //     for (int i = 0; i < names.size(); i++) {
    //         System.out.println(names.get(i));
    //         if (names.get(i).length() > 5) {
    //             nombres.add(names.get(i));
    //             System.out.println(nombres);
    //         }

    //     }        
    // }
    //     public void abecedario(char[] abcd ) {
    //         ArrayList<Character> caracteresb = new ArrayList<>();
    //         //Arrays.shuffle(abcd);
    //         for (int i = 0; i < abcd.length; i++) {
    //             caracteresb.add(abcd[i]);
    //         }
    //         Collections.shuffle(caracteresb);
    //         System.out.println(caracteresb);
    //         System.out.println(caracteresb.get(0));
    //         System.out.println(caracteresb.get(abcd.length - 1));
    //         if (caracteresb.get(0) == 'a') {
    //             System.out.println("vocal");
    //         }
    //         else if (caracteresb.get(0) == 'e') {
    //             System.out.println("vocal");
    //         }
    //         else if (caracteresb.get(0) == 'i') {
    //             System.out.println("vocal");
    //         }
    //        else if (caracteresb.get(0) == 'o') {
    //             System.out.println("vocal");
    //         }
    //          if (caracteresb.get(0) == 'u') {
    //             System.out.println("vocal");

    //         }
    // }
    //     public void numbers(int[] numbers) {
    //     Random random = new Random();
    //     ArrayList<Integer> newarr = new ArrayList<>();
    //     while (newarr.size() < 10) {
    //        int numerosAleatorios = random.nextInt(101- 54) +54;
    //         newarr.add(numerosAleatorios);

    //     }
    //     System.out.println(newarr);
    // }
    //     public void numberos(int[] numeros) {
    //     Random random = new Random();

    //     ArrayList<Integer> newarr = new ArrayList<>();

    //     while (newarr.size() < 10) {
    //         int numerosaleatorios = random.nextInt(101 - 54) + 54;
    //         newarr.add(numerosaleatorios);
    //     }
    //     for (int i = 0; i < newarr.size(); i++) {

    //     }
    //      Collections.sort(newarr);
    //     System.out.println(newarr);
    //     System.out.println(newarr.get(0));
    //      System.out.println(newarr.get(newarr.size()-1));

    // }
    // public void aleatorio(char[] cadena) {
    //     ArrayList<Character> cadena2 = new ArrayList<>();
    //     for (int i = 0; i < cadena.length; i++) {
    //         cadena2.add(cadena[i]);
    //     }
    //     Collections.shuffle(cadena2);
    //     System.out.println(cadena2);
    //     String palabra = (Character.toString(cadena2.get(1)) + (Character.toString(cadena2.get(2)))
    //             + (Character.toString(cadena2.get(3)))+(Character.toString(cadena2.get(4)))+(Character.toString(cadena2.get(5))));
    //     System.out.println(palabra);

    // }
public void longArr(String[] arreglo) {
    ArrayList<String> cadena1 = new ArrayList<>();
    for (int i = 0; i < arreglo.length; i++) {
        cadena1.add(arreglo[i]);
    }
    Collections.shuffle(cadena1);
    
    ArrayList<String> cadena2 = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        Collections.shuffle(cadena1);
        String cadena = cadena1.get(0) + cadena1.get(1)+cadena1.get(2)+cadena1.get(3)+cadena1.get(4)+cadena1.get(5);
        cadena2.add(cadena);
    }
    
    
 System.out.println(cadena2);
}
}
