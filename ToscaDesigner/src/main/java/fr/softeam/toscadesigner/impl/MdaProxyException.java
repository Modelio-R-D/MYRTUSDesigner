package fr.softeam.toscadesigner.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cbcd3805-8de1-4b5f-9c96-29ac61cf377d")
public class MdaProxyException extends Exception {

	private static final long serialVersionUID = 1L;


	@objid ("673ef56a-e5ff-4258-b2e1-c16139a912af")
    public  MdaProxyException(MdaProxyExceptionReason reason, List<MRef> missingRefs) {
        super(missingRefs.stream().map((r) -> r.toString())
                .collect(Collectors.joining(" ", MdaProxyExceptionReason.MISSING_MDA_ELEMENT.toString(), "")));
    }

    @objid ("114bbffa-2bc9-4cf0-986d-c2e516c10c66")
    public  MdaProxyException(Throwable e) {
        super(e);
    }

    @objid ("96e52332-9cd7-46d6-8534-91865dd9a882")
    public  MdaProxyException(String message, Exception e) {
        super(message, e);
    }

    @objid ("5414496f-69cb-400a-b202-5119465e54ab")
    public  MdaProxyException(String message) {
        super(message);
    }

    @objid ("7a10a255-f9af-428e-ba10-77f493c18f53")
    public enum MdaProxyExceptionReason {
        @objid ("497709dc-0bb2-435d-bbd2-7ed8007f844f")
        MISSING_MDA_ELEMENT;

    }

}
