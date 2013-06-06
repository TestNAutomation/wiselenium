package org.wiselenium.core.util;

import org.wiselenium.core.WiseException;


/**
 * Represents an exception thrown when an implementation of the element couldn't be found by
 * wiselenium.
 * 
 * @author Andre Ricardo Schaffer
 * @since 0.0.1
 */
public class NoElementImplementationClassFoundException extends WiseException {
	
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * @param clazz The class whose implementation couldn't be found.
	 * @param t The cause of the exception.
	 */
	public NoElementImplementationClassFoundException(Class<?> clazz, Throwable t) {
		super(
			"Couldn't find an implementation for the class: "
				+ clazz.getName()
				+ " . For now, it must match the pattern classPackage.{impl}.className{Impl} , but more a sofisticated implementation search is planned for the future.",
			t);
	}
	
}