package net.aveyon.intermediate_solidity

import lombok.experimental.SuperBuilder
import lombok.Setter
import lombok.Getter

@Getter
@Setter
abstract class Node {
	protected String name
}