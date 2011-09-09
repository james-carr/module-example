package org.jamescarr.example;

import java.util.Collection;

import com.google.common.base.Joiner;

public class Combiner {
	public String combine(Collection<String> collection){
		return Joiner.on(",").join(collection);
	}
}
