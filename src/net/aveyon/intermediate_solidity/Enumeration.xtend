package net.aveyon.intermediate_solidity

import java.util.List
import lombok.Getter
import lombok.Setter

@Getter
@Setter
abstract class Enumeration {
	String name
	List<String> values = newLinkedList
}