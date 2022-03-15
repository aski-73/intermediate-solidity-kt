package net.aveyon.intermediate_solidity

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

abstract class Structure {
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	String name
	@Accessors(PUBLIC_GETTER)
	List<Field> fields = newLinkedList
}
