package net.aveyon.intermediate_solidity

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

abstract class Operation {
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	String name
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	Visibility visibility
	@Accessors(PUBLIC_GETTER)
	List<String> expressions = newLinkedList
	@Accessors(PUBLIC_GETTER)
	List<String> returnss = newLinkedList
}
