package com.lhj8390.creational.abstractFactory.lg;

import com.lhj8390.creational.abstractFactory.BaseProductFactory;
import com.lhj8390.creational.abstractFactory.Computer;
import com.lhj8390.creational.abstractFactory.Phone;
import com.lhj8390.creational.abstractFactory.Tablet;

public class LGFactory extends BaseProductFactory {
    @Override
    public Phone createPhone() {
        return new LGPhone();
    }

    @Override
    public Tablet createTablet() {
        return new LGTablet();
    }

    @Override
    public Computer createComputer() {
        return new LGComputer();
    }
}
