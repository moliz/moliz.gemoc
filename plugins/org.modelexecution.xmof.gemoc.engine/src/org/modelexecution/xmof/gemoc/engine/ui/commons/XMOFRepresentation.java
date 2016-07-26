package org.modelexecution.xmof.gemoc.engine.ui.commons;

public class XMOFRepresentation {
	
	public static String REPRESENTATION_GRAPHITI="Graphiti";
	public static String REPRESENTATION_SIRIUS="Sirius";
	public static String[] getValues(){
		String [] temp= new String[2];
		temp[0]=REPRESENTATION_GRAPHITI;
		temp[1]=REPRESENTATION_SIRIUS;
		return temp;
	}

}
