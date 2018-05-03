import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava{
    
    public static ArrayList<Integer> printAndReturn(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> newarr = new ArrayList();
        for(int num : arr){
            sum += num;
            if(num>10){
                newarr.add(num);
            }
        }
        System.out.println("Sum: "+sum);
        return newarr;
    }
    
    public static ArrayList<String> shuffleNames(){
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> newarr = new ArrayList();
        List list = Arrays.asList(names);
        Collections.shuffle(list);
        for(String name : names){
            System.out.println(name);
            if(name.length() > 5){
                newarr.add(name);
            }
        }
        return newarr;
    }
    
    public static void alphaShuffle(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Collections.shuffle(Arrays.asList(alphabet));
        String first = alphabet[0];
        System.out.println("The last letter is: "+alphabet[25]);
        System.out.println("The first letter is: "+first);
        if(first == "a" || first == "e" || first == "i" || first == "o" || first == "u"){
            System.out.println("The first letter is a vowel. Yay!");
        }
    }
    
    public static int[] randomArr55To100(){
        int[] arr = new int[10];
        Random rand = new Random();
        for(int i=0; i<10; i++){
            arr[i] = rand.nextInt(46)+55;
        }
        return arr;
    }
    
    public static int[] randomArr55To100Sorted(){
        int[] array = randomArr55To100();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("The minimum is: "+array[0]);
        System.out.println("The maximum is: "+array[9]);
        return array;
    }
    
    public static String randomString(){
        Random rand = new Random();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String str = "";
        for(int i = 0; i<5; i++){
            int random = rand.nextInt(26);
            str += alphabet[random];
        }
        return str;
    }
    
    public static String[] arrOfStrings(){
        String[] arr = new String[10];
        for(int i=0; i<10; i++){
            arr[i]=randomString();
        }
        return arr;
    }
    

    public static void main(String[] args){
        System.out.println(printAndReturn());
        System.out.println(shuffleNames());
        alphaShuffle();
        System.out.println(Arrays.toString(randomArr55To100()));
        randomArr55To100Sorted();
        System.out.println(randomString());
        System.out.println(Arrays.toString(arrOfStrings()));
    }
}