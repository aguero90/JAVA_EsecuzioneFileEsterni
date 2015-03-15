/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EsecuzioneFileEsterni;

/**
 *
 * @author alex
 */
public class EsecuzioneFileEsterni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //look dell'anteprima
            //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); // orrendo xD
            //javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); // classico
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName()); // imita lo stile dell'os su cui gira
            //javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName()); // boh xD sembra il classico xD
            //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"); // tipo win 98
            //javax.swing.UIManager.setLookAndFeel("it.unitn.ing.swing.plaf.macos.MacOSLookAndFeel"); // tipo mac (ma orrendo xD) e serve il jar nella libreria
            //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); // Look Figo
            //javax.swing.UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel"); // Look ancora più figo xD
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Interfaccia i = new Interfaccia();
    }
}
