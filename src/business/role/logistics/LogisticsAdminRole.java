/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.logistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import presentation.logistics.admin.AdminDashboardJPanel;

import javax.swing.*;

/**
 *
 * @author Rishabh
 */
public class LogisticsAdminRole extends Role {

    public LogisticsAdminRole() {
        super(RoleType.LogisticsAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AdminDashboardJPanel(userProcessContainer, enterprise);
    }

}
