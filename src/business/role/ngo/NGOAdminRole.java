/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.ngo;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import presentation.ngo.admin.AdminDashboardPanel;

import javax.swing.*;

/**
 *
 * @author Rishabh
 */
public class NGOAdminRole extends Role {

    public NGOAdminRole() {
        super(RoleType.NGOMAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AdminDashboardPanel(userProcessContainer, enterprise, business);
    }

}
