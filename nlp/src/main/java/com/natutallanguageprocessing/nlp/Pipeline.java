package com.natutallanguageprocessing.nlp;

import java.util.Properties;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {

	private static StanfordCoreNLP stanfordcoreNLP;
	private static String propertiesName="tokenize, ssplit, pos, lemma, ner, parse, sentiment";
	private static Properties properties;
	
	private Pipeline() {
		
	}
	static {
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
	}
	public static StanfordCoreNLP getPipeline() {
		if(stanfordcoreNLP == null) {
			stanfordcoreNLP = new StanfordCoreNLP(properties);
		}
		return stanfordcoreNLP;
	}
}
