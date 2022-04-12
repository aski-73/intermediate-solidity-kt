package net.aveyon.intermediate_solidity

import lombok.Setter
import lombok.Getter

@Setter
@Getter
abstract class OperationParameter extends Node {
	String name
	String type
	DataLocation dataLocation = DataLocation.MEMORY

	// Copy ctor
	public new(OperationParameter copySource) {
		name = copySource.name
		type = copySource.type
		dataLocation = copySource.dataLocation
	}
}
