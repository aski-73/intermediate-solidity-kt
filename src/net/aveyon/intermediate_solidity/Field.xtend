package net.aveyon.intermediate_solidity

import lombok.Setter
import lombok.Getter

@Setter
@Getter
abstract class Field extends StructureField {
	Visibility visibility
	String value

	// Copy cotr
	new(Field copySource) {
		super(copySource)
		visibility = copySource.visibility
		value = copySource.value
	}
}
