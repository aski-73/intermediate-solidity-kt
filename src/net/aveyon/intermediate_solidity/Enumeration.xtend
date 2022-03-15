package net.aveyon.intermediate_solidity

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

abstract class Enumeration {
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	String name
	@Accessors(PUBLIC_GETTER)
	List<String> values = newLinkedList
}
