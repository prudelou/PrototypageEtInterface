/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "m1.piu.Clean"
)
@ActionRegistration(
        displayName = "#CTL_Clean"
)
@ActionReference(path = "Menu/Edit", position = 1300, separatorBefore = 1250, separatorAfter = 1350)
@Messages("CTL_Clean=Clean")
public final class Clean implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
