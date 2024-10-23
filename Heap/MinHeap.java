package Heap;
import java.util.*;


public class MinHeap {
    ArrayList<Integer> data = new ArrayList<>();

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public int size(){
        return data.size();
    }

    public void add(int n){
        data.add(n);
        upHeapify(data.size()-1);
    }

    public void upHeapify(int ci){
        int pi = (ci-1)/2;

        while(ci>0 && data.get(ci) < data.get(pi)){
            int temp = data.get(ci);
            data.set(ci,data.get(pi));
            data.set(pi, temp);

            ci = pi;
            pi = (ci-1)/2;

        }

    }

    public int getMin(){
        return data.get(0);
    }

    public int remove(){
        int r = data.get(0);
        
        int t = data.get(0);
        data.set(0, data.get(data.size()-1));
        data.set(data.size()-1,t);

        downHeapify(0);

        return r;
    }

    private void downHeapify(int pi){

        while(pi < data.size()){
            int ci1 = 2*pi + 1;
            int ci2 = 2*pi +2;
            int index = pi;

            if(ci1<data.size() && data.get(ci1) < data.get(pi)){
                index = ci1;
            }

            if( ci2<data.size() && data.get(ci2) < data.get(pi)){
                index = ci2;
            }

            if(index == pi){
                break;
            }

            int temp = data.get(pi);
            data.set(pi, data.get(index));
            data.set(index, temp);

            pi=index;
            
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap();

        h.add(10);
        h.add(20);
        h.add(5);
        h.add(6);
        h.add(1);

        System.out.println("Is the heap empty: " + h.isEmpty());

        System.out.println("Size of the heap: " + h.size());

        System.out.println("Minimum element: " + h.getMin());

        System.err.println("Remove : " + h.remove());

        System.out.println("New minimum element: " + h.getMin());
    }
}
