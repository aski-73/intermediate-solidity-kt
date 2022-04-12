package net.aveyon.intermediate_solidity

import lombok.Setter
import lombok.Getter

@Setter
@Getter
abstract class StructureField extends Node {
	protected String type
	protected boolean payable
	protected boolean array

	new(StructureField copySource) {
		type = copySource.type
		payable = copySource.payable
		array = copySource.array
	}
}
