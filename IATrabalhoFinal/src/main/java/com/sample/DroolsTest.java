package com.sample;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * This is a sample class to launch a rule.
 */
@SuppressWarnings("restriction")
public class DroolsTest {

    public static final void main(String[] args) {
        try {        	
    		Pessoa requerente = new Pessoa("FM construtora",1470,true);
    		
    		Art art = new Art(321,true);
    		
    		Laudo laudo = new Laudo(321,true);
    		
    		AlvaraDeConstrucao alvaraC = new AlvaraDeConstrucao();
    		alvaraC.setEmitido(false);
    		
    		Imovel imovel = new Imovel(867,false,false,TipoImovel.RESIDENCIAL,70.00,3.0,2.00,10.00,5.00,false);
    		imovel.setLaudo(laudo);
    		imovel.setArt(art);
    		imovel.setAlvara(alvaraC);
    		
    		Terreno terreno = new Terreno(false,500.00);
    		terreno.setConstrucao(imovel);
    		
    		Processo processo = new Processo(123);
    		processo.setRequerente(requerente);
    		processo.setTerreno(terreno);
    		
    		KnowledgeBase kbase = readKnowledgeBase();
    		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    		KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
    		ksession.insert(processo);
    		ksession.fireAllRules();
    		logger.close();
        	
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
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
        return kbase;
    }
    
}
