package com.lhj8390.structural.adapter.classAdapter;

public class PapagoAdapter extends GoogleAdaptee implements PapagoTranslation {

    @Override
    public void translateByPapago() {
        System.out.println("파파고 번역기에서 구글 번역 기능을 사용합니다.");
        this.translateByGoogle();
    }
}
