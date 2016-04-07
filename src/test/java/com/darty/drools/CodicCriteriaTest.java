package com.darty.drools;


import org.junit.Assert;
import org.junit.Test;

import java.io.InputStreamReader;
import org.kie.api.KieBase;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

/**
 *
 * @author mbouziad
 */
public class CodicCriteriaTest {

    private final KieBase kbase;
    
    private final KieHelper helper;

	public CodicCriteriaTest() {
        helper = new KieHelper();
        helper.setClassLoader(getClass().getClassLoader());
        helper.addResource(ResourceFactory.newReaderResource(new InputStreamReader(getClass().getResourceAsStream("/rules/init.drl"))), ResourceType.DRL);
        helper.addResource(ResourceFactory.newReaderResource(new InputStreamReader(getClass().getResourceAsStream("/rules/query.drl"))), ResourceType.DRL);
        helper.addResource(ResourceFactory.newReaderResource(new InputStreamReader(getClass().getResourceAsStream("/rules/rule.drl"))), ResourceType.DRL);
        kbase = helper.build();
    }
    
    /**
	 * Create new knowledge session.
	 * 
	 * @return knowledge session
	 */
	private KieSession newSession() {
		KieSession ksession = kbase.newKieSession();
		return ksession;
	}
	

	@Test
	public void price() {
        /*-- Init drools session --*/
        KieSession kSession = newSession();
        LinePrestationPriceConfiguration conf = new LinePrestationPriceConfiguration();
        conf.getCodicCriterias().add(new CodicCriteria());
        
        kSession.insert(conf);
        
        kSession.fireAllRules();
        
        Assert.assertTrue(true);
	}

}
