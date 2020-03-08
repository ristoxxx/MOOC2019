/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 * @param <T>
 */
public class Piilo<T> {
    
    private T piilotettava;
    
    public void laitaPiiloon(T piilotettava) {
        this.piilotettava = piilotettava;
    }
    
    public T otaPiilosta() {
        return this.piilotettava;
    }
    
    public boolean onkoPiilossa() {
        if (piilotettava == null) {
            return false;
        } else {
            return true;
        }
    }
}
