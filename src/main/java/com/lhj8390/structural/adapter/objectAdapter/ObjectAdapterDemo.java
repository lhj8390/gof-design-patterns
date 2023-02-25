package com.lhj8390.structural.adapter.objectAdapter;

public class ObjectAdapterDemo {

    public static void main(String[] args) {
        PapagoAdapter papagoAdapter = new PapagoAdapter(new GoogleAdaptee());
        papagoAdapter.translateByPapago();
    }
}
