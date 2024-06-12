package fr.softeam.toscadesigner.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelio.vcore.smkernel.mapi.MRef;

public class MdaProxyException extends Exception {
	public MdaProxyException(MdaProxyExceptionReason reason, List<MRef> missingRefs) {
		super(missingRefs.stream().map((r) -> r.toString())
				.collect(Collectors.joining(" ", MdaProxyExceptionReason.MISSING_MDA_ELEMENT.toString(), "")));
	}

	public MdaProxyException(Throwable e) {
		super(e);
	}

	public MdaProxyException(String message, Exception e) {
		super(message, e);
	}

	public MdaProxyException(String message) {
		super(message);
	}

	public enum MdaProxyExceptionReason {
		MISSING_MDA_ELEMENT;
	}

}