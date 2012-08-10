package com.sample;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * This is a sample class to launch a rule.
 */
@SuppressWarnings("restriction")
public class DroolsTest {

    public static void main(String[] args) throws Exception{
        	
    		Pessoa requerente = new Pessoa("FM construtora",1470,true);
    		
    		Art art = new Art(321,true);
    		
    		AlvaraDeConstrucao alvaraC = new AlvaraDeConstrucao();
    		alvaraC.setEmitido(false);
    		
    		Imovel imovel = new Imovel(867,true,false,TipoImovel.RESIDENCIAL,70.00,2.0,2.00,10.00,5.00,false);
    		imovel.setArt(art);
    		imovel.setAlvara(alvaraC);
    		
    		Terreno terreno = new Terreno(false,500.00);
    		terreno.setConstrucao(imovel);
    		
    		Processo processo = new Processo(123);
    		processo.setRequerente(requerente);
    		processo.setTerreno(terreno);
    		
    		
    		StatefulKnowledgeSession ksession = getKnowledgeSession();
    		ksession.insert(processo);
    		ksession.fireAllRules();
    		ksession.dispose();
    		
    		ksession.dispose();
    		System.out.println("----");
    	
    		//PROCESSO 2
    		Laudo laudo2 = new Laudo(321,true);
    		Pessoa requerente2 = new Pessoa("FM construtora",1470,false);
    		
    		AlvaraDeConstrucao alvaraC2 = new AlvaraDeConstrucao();
    		alvaraC2.setEmitido(true);
    		
    		CertidaoDeEdificacao certidaoC2 = new CertidaoDeEdificacao();
    		certidaoC2.setEmitido(false);
    		
    		Imovel imovel2 = new Imovel(867,true,true,TipoImovel.RESIDENCIAL,70.00,2.0,2.00,10.00,5.00,false);
    	
    		imovel2.setAlvara(alvaraC2);
    		imovel2.setLaudo(laudo2);
    		imovel2.setCertidao(certidaoC2);
    		
    		Terreno terreno2 = new Terreno(true,500.00);
    		terreno2.setConstrucao(imovel2);
    		
    		Processo processo2= new Processo(1234);
    		processo2.setRequerente(requerente2);
    		processo2.setTerreno(terreno2);
    		
    		StatefulKnowledgeSession ksession2 = getKnowledgeSession();
    		ksession2.insert(processo2);
    		ksession2.fireAllRules();
    		ksession2.dispose();
    }

//    private static KnowledgeBase readKnowledgeBase() throws Exception {
//        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
//        kbuilder.add(ResourceFactory.newClassPathResource("Rules.drl"), ResourceType.DRL);
//        KnowledgeBuilderErrors errors = kbuilder.getErrors();
//        if (errors.size() > 0) {
//            for (KnowledgeBuilderError error: errors) {
//            	System.out.println("errei");
//                System.err.println(error);
//            }
//            throw new IllegalArgumentException("Could not parse knowledge.");
//        }
//        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
//        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
//        return kbase;
//    }
    
    private static StatefulKnowledgeSession getKnowledgeSession() throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("Rules.drl"), ResourceType.DRL);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error: errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		return ksession;
	}

    
}
