package com.natutallanguageprocessing.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentimentAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "Hey! I am Tarak Dusane. I really like this place.";
		
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreSentence> sentences = coreDocument.sentences();
		for(CoreSentence sentence: sentences) {
			String sentiment = sentence.sentiment();
			System.out.println(sentence.toString()+" = "+sentiment);
		}

	}

}
