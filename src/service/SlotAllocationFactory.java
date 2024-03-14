package service;

public class SlotAllocationFactory {

    public SlotAllocationStrategy getAllocationBy(){
        return new NearestAllocationStrategy();
    }
}
