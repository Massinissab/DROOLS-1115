package com.darty.drools;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author mbouziad
 */

public class LinePrestationPriceConfiguration {

    private Collection<CodicCriteria> codicCriterias =  new ArrayList<>();

    public Collection<CodicCriteria> getCodicCriterias() {
        return codicCriterias;
    }

    public void setCodicCriterias(Collection<CodicCriteria> codicCriterias) {
        this.codicCriterias = codicCriterias;
    }
}
