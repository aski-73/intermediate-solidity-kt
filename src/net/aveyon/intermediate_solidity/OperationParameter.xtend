package net.aveyon.intermediate_solidity

import org.eclipse.xtend.lib.annotations.Accessors

abstract class OperationParameter {
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	String name
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	String type
	@Accessors(PUBLIC_GETTER, PUBLIC_SETTER)
	MemoryType memoryType = MemoryType.MEMORY
}
