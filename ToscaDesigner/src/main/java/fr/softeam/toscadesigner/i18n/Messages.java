package fr.softeam.toscadesigner.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3e579112-9583-4598-b88e-5beb64540fcb")
public class Messages {
    @objid ("f3431cc0-dd94-40e3-9827-babb1f5cc544")
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle ("fr.softeam.toscadesigner.i18n.messages");

    @objid ("5ca3df72-14b9-4824-8208-ce4106d7b9b0")
    private  Messages() {
        
    }

    @objid ("f14a43e4-36a6-4c3c-bbfa-8920499d05ba")
    public static String getString(final String key) {
        try {
            return RESOURCE_BUNDLE.getString (key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
        
    }

    @objid ("290f6cf4-411a-4712-ae3e-7f41c9605c62")
    public static String getString(final String key, final String... params) {
        try {
            return MessageFormat.format (RESOURCE_BUNDLE.getString (key),(Object[]) params);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
        
    }

}
