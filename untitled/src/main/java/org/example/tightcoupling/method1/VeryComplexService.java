package org.example.tightcoupling.method1;

public class VeryComplexService {
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
    public VeryComplexService(){

    }

    public void complexBusiness(int array[]){
        bubbleSortAlgorithm.sort(array);
    }

}
