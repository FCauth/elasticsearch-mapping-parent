package org.elasticsearch.mapping;

/**
 * @author luc boutier
 */
public enum TermVector {
	no, yes, with_offsets, with_positions, with_positions_offsets;
}