package org.example.tightcoupling.method2;

public class VeryComplexService {
    private SortAlgorithsm sortAlgorithsm;
    public VeryComplexService(){
        sortAlgorithsm = new BubbleSortAlgorithsm();
    }

    public void complexService(int[] array){
        sortAlgorithsm.sort(array);
    }
}
