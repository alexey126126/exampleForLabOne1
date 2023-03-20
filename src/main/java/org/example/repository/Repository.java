package org.example.repository;

import org.example.entity.Contract;

import java.util.Arrays;

public class Repository {
    private Contract[] contracts;
    private int capacity;
    private int size;
    public Repository() {
        capacity = 10;
        size = 0;
        this.contracts = new Contract[capacity];
    }

    /**
     *
     * @param newArray - which coping
     */
    private void copy(Contract[] newArray) {
        if (size >= 0) System.arraycopy(contracts, 0, newArray, 0, size);

        this.contracts = newArray;
    }
//    public void append(Contract con) {
//        contracts = append(contracts, con);
//    }
    public void add(Contract contract) {
       if(size == capacity) {
           toExpendArray();

       }
       contracts[size] = contract;
       size += 1;
        Arrays.sort(this.contracts, 0, size, (o1, o2)-> o1.getID() - o2.getID());
    }

    public void addAll(Contract... contract) {
        for (Contract c:contract) {
            add(c);
        }
    }

    public void toExpendArray() {
        this.capacity *= 2;
        Contract[] memory = new Contract[capacity];
        copy(memory);
    }

    public Contract findById(int id) {
        int index = interpolationSearch(id);
        if (outOfRange(index))
            return null;
        return contracts[index];
    }

    private boolean outOfRange(int i) {
        return i < 0 || i >= size;
    }

    private int interpolationSearch(int id) {
        int highEnd = (size - 1);
        int lowEnd = 0;

        while (id >= contracts[lowEnd].getID() && id <= contracts[highEnd].getID() && lowEnd <= highEnd) {

            int probe
                    = lowEnd + (highEnd - lowEnd) * (id - contracts[lowEnd].getID()) / (contracts[highEnd].getID() - contracts[lowEnd].getID());

            if (highEnd == lowEnd) {
                if (contracts[lowEnd].getID() == id) {
                    return lowEnd;
                } else {
                    return -1;
                }
            }

            if (contracts[probe].getID() == id) {
                return probe;
            }

            if (contracts[probe].getID() < id) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        return -1;
    }

}
