package de.uni_stuttgart.vis.vowl.owl2vowl.model.nodes.datatypes;

import de.uni_stuttgart.vis.vowl.owl2vowl.model.nodes.BaseNode;

public abstract class BaseDatatype extends BaseNode {
	protected static int counterObjects = 1;

	protected BaseDatatype() {
	}

	protected abstract void setID();
}
