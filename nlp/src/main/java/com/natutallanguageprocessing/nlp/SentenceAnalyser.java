package com.natutallanguageprocessing.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentenceAnalyser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "Hey! I am Harsh Dusane. I am software Developer and Consultant.";
		
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreSentence> sentences = coreDocument.sentences();
		for(CoreSentence sentence: sentences) {
			System.out.println(sentence.toString());
		}

	}

}
