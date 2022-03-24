package net.aveyon.intermediate_solidity

import lombok.Setter
import lombok.Getter

@Setter
@Getter
abstract class OperationParameter {
	String name
	String type
	MemoryType memoryType = MemoryType.MEMORY
}
