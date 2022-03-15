package net.aveyon.intermediate_solidity

@org.eclipse.xtend.lib.annotations.Data
abstract class Field {
	String name
	Visibility visibility
	String type
	boolean payable
	String value 
}
