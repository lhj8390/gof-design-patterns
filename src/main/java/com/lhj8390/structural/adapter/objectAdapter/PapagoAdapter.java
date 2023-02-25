package com.lhj8390.structural.adapter.objectAdapter;

public class PapagoAdapter implements PapagoTranslation {
    private final GoogleAdaptee googleAdaptee;

    public PapagoAdapter(GoogleAdaptee googleAdaptee) {
        this.googleAdaptee = googleAdaptee;
    }
    @Override
    public void translateByPapago() {
        System.out.println("파파고 번역기에서 구글 번역 기능을 사용합니다.");
        googleAdaptee.translateByGoogle();
    }
}
