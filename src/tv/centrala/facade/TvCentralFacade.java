package tv.centrala.facade;

import tv.centrala.dto.TvOffer;

import java.util.List;


public interface TvCentralFacade {
    List<TvOffer> getTvOffers();
    boolean addOffer(TvOffer tvOffer);
    boolean removeOffer(TvOffer tvOffer);
}
