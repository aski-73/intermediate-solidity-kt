package net.aveyon.intermediate_solidity

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

abstract class SmartContract {
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	String name
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	boolean iface
	@Accessors(PUBLIC_GETTER)
	List<SmartContract> extending = newLinkedList
	@Accessors(PUBLIC_GETTER)
	List<Field> fields = newLinkedList
	@Accessors(PUBLIC_GETTER)
	List<Operation> operations = newLinkedList	
}
