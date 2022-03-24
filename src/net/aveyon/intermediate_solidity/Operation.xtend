package net.aveyon.intermediate_solidity

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

import lombok.Getter
import lombok.Setter

@Getter
@Setter
abstract class Operation {
	String name
	Visibility visibility
	List<String> expressions = newLinkedList
	List<String> returns = newLinkedList
}
