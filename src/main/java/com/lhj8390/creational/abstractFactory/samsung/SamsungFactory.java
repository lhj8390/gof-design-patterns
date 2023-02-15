package com.lhj8390.creational.abstractFactory.samsung;

import com.lhj8390.creational.abstractFactory.BaseProductFactory;
import com.lhj8390.creational.abstractFactory.Computer;
import com.lhj8390.creational.abstractFactory.Phone;
import com.lhj8390.creational.abstractFactory.Tablet;

public class SamsungFactory extends BaseProductFactory {

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Tablet createTablet() {
        return new SamsungTablet();
    }

    @Override
    public Computer createComputer() {
        return new SamsungComputer();
    }
}
