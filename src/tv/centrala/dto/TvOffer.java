package tv.centrala.dto;

public class TvOffer {

    private int id;
    private String offerName;
    private String offerDescription;
    private String offerMonthlyLength;
    private double offerActivationPrice;
    private double offerMonthlyPrice;
    private String offerCurrency;

    public TvOffer() {
    }

    public TvOffer(int id, String offerName, String offerDescription, String offerMonthlyLength, double offerActivationPrice, double offerMonthlyPrice, String offerCurrency) {
        this.id = id;
        this.offerName = offerName;
        this.offerDescription = offerDescription;
        this.offerMonthlyLength = offerMonthlyLength;
        this.offerActivationPrice = offerActivationPrice;
        this.offerMonthlyPrice = offerMonthlyPrice;
        this.offerCurrency = offerCurrency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getOfferMonthlyLength() {
        return offerMonthlyLength;
    }

    public void setOfferMonthlyLength(String offerMonthlyLength) {
        this.offerMonthlyLength = offerMonthlyLength;
    }

    public double getOfferActivationPrice() {
        return offerActivationPrice;
    }

    public void setOfferActivationPrice(double offerActivationPrice) {
        this.offerActivationPrice = offerActivationPrice;
    }

    public double getOfferMonthlyPrice() {
        return offerMonthlyPrice;
    }

    public void setOfferMonthlyPrice(double offerMonthlyPrice) {
        this.offerMonthlyPrice = offerMonthlyPrice;
    }

    public String getOfferCurrency() {
        return offerCurrency;
    }

    public void setOfferCurrency(String offerCurrency) {
        this.offerCurrency = offerCurrency;
    }
}
