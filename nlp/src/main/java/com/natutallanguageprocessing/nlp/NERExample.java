package com.natutallanguageprocessing.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NERExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "Hey! I am Tarak Dusane. I live in Vadodara, Gujarat, India.";
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		List<CoreLabel> coreLabelList = coreDocument.tokens();
		for(CoreLabel coreLabel :coreLabelList) {
			String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
			System.out.println(coreLabel.originalText()+" = "+ ner);
		}

	}

}
