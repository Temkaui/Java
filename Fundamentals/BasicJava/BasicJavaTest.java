import java.util.ArrayList;
public class BasicJavaTest{
    public static void main(String[] args){
        // System.out.println("Basic 19");
        BasicJava b19 = new BasicJava();
        // b19.print1to255();
        // b19.printOdds1to255();
        // b19.printIntsAndSums1To255();
        ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add(1);
        list1.add(-3);
        list1.add(4);
        list1.add(8);
        list1.add(-2);
        list1.add(0);
        list1.add(8);
        list1.add(0);
        list1.add(-1);
        list1.add(10);
        // b19.printList(list1);
        // b19.printMax(list1);
        // b19.printAvg(list1);
        // System.out.println(b19.oddsArray());
        // b19.squareArray(list1);
        // b19.greaterThan(list1, 7);
        // b19.negativeEliminate(list1);
        // b19.shiftArrayToLeft(list1);
        b19.maxMinAvg(list1);
        // b19.sumFrom0ToN(17);
        // System.out.println(b19.doohickyThing(212.0)) 
    }
} 