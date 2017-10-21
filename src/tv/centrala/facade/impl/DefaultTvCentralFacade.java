package tv.centrala.facade.impl;

import org.springframework.stereotype.Component;
import tv.centrala.dto.TvOffer;
import tv.centrala.facade.TvCentralFacade;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultTvCentralFacade implements TvCentralFacade{

    @Override
    public List<TvOffer> getTvOffers() {
        List<TvOffer> tvOffers = new ArrayList<>();
        TvOffer tvOffer1 = new TvOffer(1,"canalplus", "superpakiet","12",0,24,"PLN");
        TvOffer tvOffer2 = new TvOffer(1,"hbo", "hbo","24",55,35,"USD");
        tvOffers.add(tvOffer1);
        tvOffers.add(tvOffer2);
        return tvOffers;
    }

    @Override
    public boolean addOffer(TvOffer tvOffer) {
        return true;
    }

    @Override
    public boolean removeOffer(TvOffer tvOffer) {
        return true;
    }
}
