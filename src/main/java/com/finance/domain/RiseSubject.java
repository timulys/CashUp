package com.finance.domain;

import org.jsoup.select.Elements;

/**
 * 상승종목 Domain
 */
public class RiseSubject extends Subject {
    private String currentCost; // 현재가
    private String adayCost;    // 전일비
    private String fluctuation; // 등락률
    private String volume;      // 거래량
    private String buying;      // 매수호가
    private String celling;     // 매도호가
    private String buyingVol;   // 매수총잔량
    private String cellingVol;  // 매도총잔량
    private String per;         // PER(주가수익률) : 주식가격을 주당순이익으로 나눈 값
    private String roe;         // ROE(자기자본이익률) : 투입한 자기자본이 얼마만큼의 이익을 냈는지를 나타내는 지표

    public RiseSubject() {
    }

    public String getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(String currentCost) {
        this.currentCost = currentCost;
    }

    public String getAdayCost() {
        return adayCost;
    }

    public void setAdayCost(String adayCost) {
        this.adayCost = adayCost;
    }

    public String getFluctuation() {
        return fluctuation;
    }

    public void setFluctuation(String fluctuation) {
        this.fluctuation = fluctuation;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getBuying() {
        return buying;
    }

    public void setBuying(String buying) {
        this.buying = buying;
    }

    public String getCelling() {
        return celling;
    }

    public void setCelling(String celling) {
        this.celling = celling;
    }

    public String getBuyingVol() {
        return buyingVol;
    }

    public void setBuyingVol(String buyingVol) {
        this.buyingVol = buyingVol;
    }

    public String getCellingVol() {
        return cellingVol;
    }

    public void setCellingVol(String cellingVol) {
        this.cellingVol = cellingVol;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public String getRoe() {
        return roe;
    }

    public void setRoe(String roe) {
        this.roe = roe;
    }

    public static RiseSubject toSubject(Elements elements) {
        RiseSubject riseSubject = new RiseSubject();
        if (elements.size() == 12) {
            if ("N".equals(elements.get(0).text())) {
                return null;
            }
            riseSubject.setNum(elements.get(0).text());
            riseSubject.setName(elements.get(1).text());
            riseSubject.setCurrentCost(elements.get(2).text());
            riseSubject.setAdayCost(elements.get(3).text());
            riseSubject.setFluctuation(elements.get(4).text());
            riseSubject.setVolume(elements.get(5).text());
            riseSubject.setBuying(elements.get(6).text());
            riseSubject.setCelling(elements.get(7).text());
            riseSubject.setBuyingVol(elements.get(8).text());
            riseSubject.setCellingVol(elements.get(9).text());
            riseSubject.setPer(elements.get(10).text());
            riseSubject.setRoe(elements.get(11).text());
        }
        return riseSubject;
    }
}
