package com.rules.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.rules.model.AssociatePersonClaim;
import com.rules.model.Claim;

public class DroolsTest {

	public static final void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession ksession = kContainer.newKieSession("ksession-rule");

		AssociatePersonClaim apc1 = new AssociatePersonClaim("cl1", "ap1", 10);
		AssociatePersonClaim apc2 = new AssociatePersonClaim("cl1", "ap2", 10);
		AssociatePersonClaim apc3 = new AssociatePersonClaim("cl1", "ap3", 10);
		Claim cl = new Claim("cl1");
		
		ksession.insert(apc1);
		ksession.insert(apc2);
		ksession.insert(apc3);
		ksession.insert(cl);

		ksession.fireAllRules();
	}

}
