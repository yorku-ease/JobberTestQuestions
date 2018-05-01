/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobbertestquestions;

/**
 *
 * @author agyep
 */
public class JobberTestQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VersionQuestion checkVersionObject = new VersionQuestion();
        SpiralArrayQuestion spiralObject = new SpiralArrayQuestion();
        
        System.out.println(checkVersionObject.returnNextVersion("1.2.3"));
        System.out.println(checkVersionObject.returnNextVersion("0.9.9"));
        System.out.println(checkVersionObject.returnNextVersion("1"));
        System.out.println(checkVersionObject.returnNextVersion("1.2.3.4.5.6.7.8"));
        System.out.println(checkVersionObject.returnNextVersion("9.9"));
        
        spiralObject.returnSpiral(0);
        spiralObject.returnSpiral(1);
        spiralObject.returnSpiral(2);
        spiralObject.returnSpiral(3);
        spiralObject.returnSpiral(4);
        spiralObject.returnSpiral(5);
    }
    
}
