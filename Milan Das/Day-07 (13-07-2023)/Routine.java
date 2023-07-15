package com.oops;

public class Routine {
	public String padL(int n, int len) {
		StringBuffer retVal = new StringBuffer(""+n);
		for(int i=retVal.length(); i<len; i++) {
			retVal.insert(0,".");
		}
		return retVal.toString();
	}

	public String padC(int n, int len) {
		StringBuffer retVal = new StringBuffer(""+n);
		for(int i=retVal.length(); i<len; i++) {
			if(i%2==0) {
				retVal.append(".");
			} else {
				retVal.insert(0, ".");
			}
		}
		return retVal.toString();
	}

	public String padR(int n, int len) {
		StringBuffer retVal = new StringBuffer(""+n);
		for(int i=retVal.length(); i<len; i++) {
			retVal.append(".");
		}
		return retVal.toString();
	}

}
