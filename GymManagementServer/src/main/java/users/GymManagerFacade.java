/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import finance.Payment;
import mms.gymmanagementserver.Branch;
import users.Member;

/**
 *
 * @author hp
 */
public class GymManagerFacade {
    // Mock database or system references
    private Database database; // A hypothetical class to interact with data storage

    // Constructor
    public GymManagerFacade(Database database) {
        this.database = database;
    }

    // Manage member profiles
    public boolean manageMemberProfile(int memberId, String field, String newValue) {
        Member member = database.findMemberById(memberId);
        if (member != null) {
            // Example: Update the member's email or subscription type
            switch (field.toLowerCase()) {
                case "email":
                    member.setEmail(newValue);
                    break;
                case "subscriptiontype":
                    member.setSubscriptionType(newValue);
                    break;
                default:
                    System.out.println("Invalid field.");
                    return false;
            }
            database.updateMember(member); // Save changes
            return true;
        }
        return false;
    }

    // Schedule and manage gym sessions
    public boolean scheduleAndManageSession(String sessionTime, int sessionId, String trainerName) {
        Session session = database.findSessionById(sessionId);
        if (session != null) {
            session.setSessionTime(sessionTime);
            session.setTrainerName(trainerName);
            database.updateSession(session);
            return true;
        }
        return false;
    }

    // Process payments
    public boolean processPayments(String paymentMethod, double amount) {
        Payment payment = new Payment(paymentMethod, amount);
        return payment.process(); // Hypothetical payment processing logic
    }

    // Generate branch report
    public String generateBranchReport(String branchName) {
        Branch branch = database.findBranchByName(branchName);
        if (branch != null) {
            return branch.generateBranchReport();
        }
        return "Branch not found.";
    }

    // Get member session data as DTO
    public MemberSessionDTO getMemberSessionData(int memberId, int sessionId) {
        Member member = database.findMemberById(memberId);
        Session session = database.findSessionById(sessionId);
        if (member != null && session != null) {
            MemberSesAssembler assembler = new MemberSesAssemblerImpl();
            return assembler.assembleDTO(member, session);
        }
        return null;
    }

    // Update member session data using DTO
    public boolean updateMemberSessionData(MemberSessionDTO dto) {
        MemberSesAssembler assembler = new MemberSesAssemblerImpl();
        return assembler.assembleDomainObjects(dto);
    }
}
