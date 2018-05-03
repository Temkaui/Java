import java.util.ArrayList;
public class BasicJava{
	public void print1to255(){
		for(int i = 1; i<256; i++){
			System.out.println(i);
		}
	}
	public void printOdds(){
		for(int i=1; i<256; i++){
			if(i%2 == 1){
				System.out.println(i);
			}
		}
	}
	public void printEven(){
		for(int i=1; i<256; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
	}
	public void printSum(){
		int sum=0;
		for(int i=0; i<256; i++){
			sum += i;
			System.out.println(sum);
		}
	}
	public void printMax(ArrayList<Object> list){
		int max = (int) list.get(0);
		for(Object item: list){
			int x = (int) item;
			if(max<x){
				max = x;
			}
		}
		System.out.println(max);
	}
	
	public void printMin(ArrayList<Object> list){
		int min = (int) list.get(0);
		for(Object item: list){
			int x = (int) item;
			if(min > x){
				min = x;
			}
		}
		System.out.println(min);
	}

	public void printAvg(ArrayList<Object> list){
		double sum = 0 ;
		for(Object item: list){
			int x = (int) item;
			sum += x;
		}
		System.out.println(sum / list.size());
	}

	public int[] oddsArray(){
		int[] y = new int[128];
		for(int i=1; i<128; i++){
			y[i] = i*2+1;
		}
		return y;
	}
	public void greaterThan(ArrayList<Object> list, int y){
		int count = 0;
		for(Object item: list){
			if((int) item > y){
				count ++;
			}
		}
		System.out.println(count);
	}

	public void squareArray(ArrayList<Object> list){
		for(int i = 0; i<list.size(); i++){
			int val = (int) list.get(i);
			list.set(i, val*val);
		}
		System.out.println(list);
	}
	
	public void negativeEliminate(ArrayList<Object> list){
		for(int i = 0; i<list.size(); i++){
			int val = (int) list.get(i);
			if(val < 0 ){
				list.set(i, 0);
			}
		}
		System.out.println(list);
	}

	public void maxMinAvg(ArrayList<Object> list){
		int[] y = new int[3];
		int min = (int) list.get(0);
		int max = (int) list.get(0);
		int sum = 0;
		for(Object item: list){
			if (min > (int) item) {
				min = (int) item;
			}
			else if (max < (int) item){
				max = (int) item;
			}
			sum += (int) item;
			y[0] = max;
			y[1] = min;
			y[2] = sum/list.size();
		}
		System.out.println(y);
	}

	public void shiftArrayToLeft(ArrayList<Object> list)
    {
        int i=0;
        for (i=0; i<list.size()-1; i++)
        {
            list.set(i, list.get(i+1)); 
        }
        list.set(i, 0);
        System.out.println(list);
    }



}
