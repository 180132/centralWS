package tv.centrala.ws;

import org.springframework.beans.factory.annotation.Autowired;
import tv.centrala.dto.TvOffer;
import tv.centrala.facade.TvCentralFacade;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class TvCentralWS {

    @Autowired
    TvCentralFacade tvCentralFacade;

    @WebMethod
    public List<TvOffer> getOffers(){
        return tvCentralFacade.getTvOffers();
    }

}
