package com.natutallanguageprocessing.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class LemmaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "I am trying to learn new technologies.";
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		List<CoreLabel> coreLabelList = coreDocument.tokens();
		for(CoreLabel coreLabel :coreLabelList) {
			String lemma = coreLabel.lemma();
			System.out.println(coreLabel.originalText()+" = "+ lemma);
		}

	}

}
