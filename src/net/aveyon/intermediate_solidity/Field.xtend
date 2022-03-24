package net.aveyon.intermediate_solidity

import lombok.Setter
import lombok.Getter

@Setter
@Getter
abstract class Field {
	String name
	Visibility visibility
	String type
	boolean payable
	String value 
}
