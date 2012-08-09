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
//            // load up the knowledge base
        	
    		Pessoa requerente = new Pessoa("FM construtora",1470,true);
    		
    		Art art = new Art(321,true);
    		
    		Laudo laudo = new Laudo(321,true);
    		
    		AlvaraDeConstrucao alvaraC = new AlvaraDeConstrucao();
    		
    		Imovel imovel = new Imovel(867,false,TipoImovel.RESIDENCIAL,70.00,2.50,5.00,5.00,10.00);
    		imovel.setLaudo(laudo);
    		imovel.setArt(art);
    		imovel.setAlvara(alvaraC);
    		
    		Terreno terreno = new Terreno(false,500.00);
    		terreno.setContrucao(imovel);
    		
    		Processo processo = new Processo(123);
    		processo.setRequerente(requerente);
    		processo.setTerreno(terreno);
    		
    		KnowledgeBase kbase = readKnowledgeBase();
    		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    		KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
//            // go !
//            Message message = new Message();
//            message.setMessage("Hello World");
//            message.setStatus(Message.HELLO);
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

//    public static class Message {
//
//        public static final int HELLO = 0;
//        public static final int GOODBYE = 1;
//
//        private String message;
//
//        private int status;
//
//        public String getMessage() {
//            return this.message;
//        }
//
//        public void setMessage(String message) {
//            this.message = message;
//        }
//
//        public int getStatus() {
//            return this.status;
//        }
//
//        public void setStatus(int status) {
//            this.status = status;
//        }
//
//    }

}
