
package com.dictionary.out.tag;

import au.id.jericho.lib.html.EndTagType;
import au.id.jericho.lib.html.ParseText;
import au.id.jericho.lib.html.Source;
import au.id.jericho.lib.html.StartTag;
import au.id.jericho.lib.html.StartTagTypeGenericImplementation;
import au.id.jericho.lib.html.Tag;

final class cfschedule extends StartTagTypeGenericImplementation {
	protected static final cfschedule INSTANCE = new cfschedule();

	private cfschedule() {
		super("CFML if tag", "<cfschedule", ">", EndTagType.NORMAL, true, true, false);
	}

}
					