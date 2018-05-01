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
public class VersionQuestion {
    String returnNextVersion(String version){
        String newVersion;
        
        // Split input up into array
        String[] stringArray = version.split("[.]"); 
        
        int length = stringArray.length;
        boolean incrementPrevious = false; // If true, increment previous number
        
        // Iterate backwards through array
        for(int i = length - 1; i >= 0; i--){
            
            // The last number will always increment
            if(i == length -1){
                stringArray[i] = String.valueOf(Integer.parseInt(stringArray[i]) + 1);
                if(stringArray[i].equals("10")){
                    stringArray[i] = "0";
                    incrementPrevious = true;
                }
            }else{
                if(incrementPrevious == true){ 
                    stringArray[i] = String.valueOf(Integer.parseInt(stringArray[i]) + 1);
                    
                    // Will not fire if you're on the first number in the string
                    if(stringArray[i].equals("10") && i != 0){
                        stringArray[i] = "0";
                        incrementPrevious = true;
                    }
                }else{
                    stringArray[i] = String.valueOf(Integer.parseInt(stringArray[i]));
                }
            }
        }
       
       newVersion = String.join(".", stringArray);
       return newVersion;
    }
}
